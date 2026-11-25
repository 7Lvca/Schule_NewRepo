package Schaltung;

public class BausteinFactory {
    public static Baustein erstellen(String baustein) {
        if (baustein == null) {
            return null;
        }
        return switch(baustein) {
            case "Lampe" -> new Lampe();
            case "Schalter" -> new Schalter();
            default -> new Kabel();
        };
    }
}
