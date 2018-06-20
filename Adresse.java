
/**
 * Beschreiben Sie hier die Klasse Adresse.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Adresse
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String strasse;
    private int hausnummer;
    private int plz;
    private String ort;

    /**
     * Konstruktor für Objekte der Klasse Adresse
     */
    public Adresse(String strasse, int hausnummer, int plz, String ort)
    {
        this.strasse=strasse;
        this.hausnummer=hausnummer;
        this.plz=plz;
        this.ort=ort;
    }
    
    public void adresseDrucken()
    {
        System.out.println(strasse + " " + hausnummer);
        System.out.println(plz + " " + ort);
    }
    
   

}
