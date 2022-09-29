public class Objekt {

    String name;
    KFZ fahrzeug;

    public Objekt (String name, KFZ fahrzeug) {
        this.name = name;
        this.fahrzeug = fahrzeug;
    }

    public boolean printData() {
        fahrzeug.printData();
        return false;
    }
}
