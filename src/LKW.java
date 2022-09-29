import java.util.Scanner;

public class LKW extends KFZ{

    // Attribute
    protected double maxLast;
    private double beladung = 0;

    public LKW(int anzahlRaeder, int ps, double maxLast) {
        super(anzahlRaeder, ps);
        this.maxLast = maxLast;
    }

    // Methoden
    public void beladen(double kg) {
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

    public void menu() {
        Scanner read = new Scanner(System.in);
        int selection;

        System.out.println("1. Beladen");
        System.out.println("2. Entladen");
        System.out.println("3. Fahren");

        selection = zahlEingeben();
        if (selection != 0) {
            if (selection == 1) {
                System.out.println("Wie viel wird geladen?");
                beladen(doubleEingeben());
            } else if (selection == 2) {
                System.out.println("Wie viel wird ausgeladen?");
                entladen(doubleEingeben());
            } else if (selection == 3) {
                System.out.println("Wie viele km fahren?");
                fahren(zahlEingeben());
            } else {
                System.out.println("Eingabe ausserhalb der Parameter!");
            }
        } else {
            System.out.println("Fehlerhafte Eingabe!");
        }
    }

    private int zahlEingeben() {
        Scanner read = new Scanner(System.in);
        int selection;

        try {
            selection = read.nextInt();
        } catch (Error error) {
            System.out.println("Fehlerhafte eingabe!");
            selection = 0;
        }
        return selection;
    }

    private double doubleEingeben() {
        Scanner read = new Scanner(System.in);
        double selection;

        try {
            selection = read.nextDouble();
        } catch (Error error) {
            System.out.println("Fehlerhafte eingabe!");
            selection = 0;
        }
        return selection;
    }
}
