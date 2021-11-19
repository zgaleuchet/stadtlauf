public class Teilnehmer {
    int startnummer;
    int kategorie;
    String name;
    String einlaufzeit;

    public Teilnehmer(int startnummer, int kategorie, String name, String einlaufzeit) {
        this.startnummer = startnummer;
        this.kategorie = kategorie;
        this.name = name;
        this.einlaufzeit = einlaufzeit;
    }

    public Teilnehmer(){}

    public int getStartnummer() {
        return startnummer;
    }

    public void setStartnummer(int startnummer) {
        this.startnummer = startnummer;
    }

    public int getKategorie() {
        return kategorie;
    }

    public void setKategorie(int kategorie) {
        this.kategorie = kategorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEinlaufzeit() {
        return einlaufzeit;
    }

    public void setEinlaufzeit(String einlaufzeit) {
        this.einlaufzeit = einlaufzeit;
    }
}
