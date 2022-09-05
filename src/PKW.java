public class PKW extends KFZ {

    // Attribute
    protected int anzahlSitze;
    private int personenInPKW = 0;


    public PKW(int anzahlRaeder, int ps, int anzahlSitze) {
        super(anzahlRaeder, ps);
        this.anzahlSitze = anzahlSitze;
    }

    // Methoden
    public void einsteigen(int personen) {
        if (personen + personenInPKW <= anzahlSitze) {
            personenInPKW += personen;
        } else {
            System.out.println("Der PKW hat nicht genug Sitze.");
        }
        ausgabeAnzahl();
    }
    public void aussteigen(int personen) {
        if (personen < personenInPKW) {
            personenInPKW -= personen;
        } else {
            System.out.println("Es sind nicht genug Personen im Fahrzeug!");
        }
        ausgabeAnzahl();
    }

    private void ausgabeAnzahl() {
        System.out.println("Aktuell befinden sich " + personenInPKW + " Personen im Fahrzeug.");
    }

}
