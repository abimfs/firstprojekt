
/**
 * Beschreiben Sie hier die Klasse Kunde.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kunde
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private String telefonnummer;
    private Adresse adresse;

    /**
     * Konstruktor für Objekte der Klasse Kunde
     */
    public Kunde(String name, String telefonnummer, Adresse adresse)
    {
        this.name=name;
        this.telefonnummer=telefonnummer;
        this.adresse=adresse;
    }

    public void kundeDrucken()
    {
        System.out.println(name);
        System.out.println("Tel: " + telefonnummer);
        adresse.adresseDrucken();
    }

}
