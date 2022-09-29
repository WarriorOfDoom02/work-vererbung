import java.util.Scanner;

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

    public void menu() {
        Scanner read = new Scanner(System.in);
        int selection;

        System.out.println("1. Einsteigen");
        System.out.println("2. Aussteigen");
        System.out.println("3. Fahren");

        selection = zahlEingeben();
        if (selection != 0) {
            if (selection == 1) {
                System.out.println("Wie viele Personen steigen ein?");
                einsteigen(zahlEingeben());
            } else if (selection == 2) {
                System.out.println("Wie viele Personen steigen aus?");
                aussteigen(zahlEingeben());
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

}
