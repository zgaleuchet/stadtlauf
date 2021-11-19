import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ReadFile {

    private ArrayList<Teilnehmer> teilnehmerListe = new ArrayList<>();
    private ArrayList<Teilnehmer> junior = new ArrayList<>();
    private ArrayList<Teilnehmer> senior = new ArrayList<>();
    private ArrayList<Teilnehmer> elite = new ArrayList<>();
    private String messresultate = "/Users/zgaleuch/Desktop/test/stadtlauf/src/main/resources/messresultate.txt";
    private String startliste = "/Users/zgaleuch/Desktop/test/stadtlauf/src/main/resources/startliste.txt";



    public void read() {
        Teilnehmer teilnehmer;

        try {
            BufferedReader readerMessresultate = new BufferedReader(new FileReader(messresultate));
            String line = readerMessresultate.readLine();

            BufferedReader readerStartliste = new BufferedReader(new FileReader(startliste));
            String line2 = readerStartliste.readLine();

            while ((line = readerMessresultate.readLine()) != null) {
                StringTokenizer tokenizerMessresultate = new StringTokenizer(line, " ");
                StringTokenizer tokenizerStartliste = new StringTokenizer(line2, " ");

                teilnehmer = new Teilnehmer();
                teilnehmer.setStartnummer(Integer.parseInt(tokenizerMessresultate.nextToken()));
                teilnehmer.setEinlaufzeit(tokenizerMessresultate.nextToken());
                teilnehmer.setName(tokenizerStartliste.nextToken());
                teilnehmer.setKategorie(Integer.parseInt(tokenizerStartliste.nextToken()));

                teilnehmerListe.add(teilnehmer);
            }
            readerMessresultate.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        splitList();

    }

    public void splitList(){
        int counter = 0;
        while (counter < teilnehmerListe.size()){
            if (teilnehmerListe.get(counter).getKategorie() == 1){
                junior.add(teilnehmerListe.get(counter));
            } else if (teilnehmerListe.get(counter).getKategorie() == 2){
                senior.add(teilnehmerListe.get(counter));
            } else if (teilnehmerListe.get(counter).getKategorie() == 3){
                elite.add(teilnehmerListe.get(counter));
            }
            counter++;
        }
    }

}
