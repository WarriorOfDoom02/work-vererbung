public class LKW extends KFZ{

    // Attribute
    protected double maxLast;
    private double beladung = 0;

    public LKW(int anzahlRaeder, int ps, double maxLast) {
        super(anzahlRaeder, ps);
        this.maxLast = maxLast;
    }

    // Methoden
    public void belade(double kg) {
        if (beladung+kg <= maxLast) {
            beladung += kg;
        } else {
            System.out.println("Maximallast überschritten!");
        }
        ausgabeGewicht();

    }

    public void entladen(double kg) {
        if (beladung >= kg) {
            beladung -= kg;
        } else {
            System.out.println("Es ist nicht genug Beladung im LKW!");
        }
        ausgabeGewicht();

    }

    private void ausgabeGewicht() {
        System.out.println("Aktuell hat der LKW " + beladung + " KG geladen.");
    }

    @Override
    public void menu() {
        super.menu();
    }
}
