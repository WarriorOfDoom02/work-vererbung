import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Objekt[] objekte = new Objekt[10];

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String selection = "";


        System.out.println("=====Dein Motorleben=====");


        while (!selection.equals("0")) {

            System.out.println("Was möchten Sie tun?");
            System.out.println("1. Eigene Fahrzeuge");
            System.out.println("2. Neues Fahrzeug");


            selection = read.next();

            if (selection.equals("1")) {
                eigeneFahrzeuge();
            } else if (selection.equals("2")) {
                neuesFahrzeug();
            }

            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public static void eigeneFahrzeuge() {
        System.out.println("Welches Fahrzeug moechten Sie benutzen?");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(objekte[i].name);
            } catch (Exception error) {
                System.out.println("Stellplatz " + (i+1) + " ist leer!");
            }

        }
        System.out.println();
        System.out.println();
    }

    public static void neuesFahrzeug() {
        Scanner read = new Scanner(System.in);

        int selection;

        System.out.println();
        System.out.println("--Neues Fahrzeug einlagern--");
        System.out.println("");

        System.out.println("Was möchtest du einlagern?");
        System.out.println("1. Auto");
        System.out.println("2. Motorrad");
        System.out.println("3. LKW");

        try {
            selection = read.nextInt();
        } catch (Exception error) {
            System.out.println("Fehlerhafte Eingabe");
            return;
        }

        if (selection == 1) {
            createAuto();
        }
        System.out.println();
        System.out.println();
    }

    public static void createAuto() {
        Scanner read = new Scanner(System.in);

        String name;
        int ps, sitze, stellplatz;

        System.out.println("--Auto Konfigurator--");

        try {
            System.out.println("Auf welchen Stellplatz soll das Auto geliefert werden? (1-10)");
            System.out.print("Stellplatz Nr.: ");
            stellplatz = read.nextInt();
            if (stellplatz <= 0 || stellplatz > 10) {
                System.out.println("Fehlerhafte Eingabe!");
                return;
            }

        } catch (Exception error) {
            System.out.println("Fehlerhafte Eingabe!");
            return;
        }


        try {
            System.out.print("Name des Autos (auch 1...10 möglich): ");
            name = read.next();
            System.out.println("PS: ");
            ps = read.nextInt();
            System.out.println("Anzahl Sitze: ");
            sitze = read.nextInt();

            System.out.println();
            System.out.println("Eingabe erfolgreich. Auto wird gebaut!");

        } catch (Exception error) {
            System.out.println("Fehler: Ungültige Eingabe");
            return;
        }


        try {
            objekte[stellplatz-1] = new Objekt(name, new PKW(4, 150, 5));
            System.out.println("Auto wurde erfolgreich gebaut!");
        } catch (Exception error) {
            System.out.println("Fehler: Auto konnte nicht gebaut werden!");
            return;
        }


    }


}