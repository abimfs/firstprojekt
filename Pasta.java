
/**
 * Beschreiben Sie hier die Klasse Pasta.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Pasta extends Speise
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String bezeichnung;

    /**
     * Konstruktor für Objekte der Klasse Pasta
     */
    public Pasta(String name, double grundpreis, String bezeichnung)
    {
        // Instanzvariable initialisieren
        super(name, grundpreis);
        this.bezeichnung=bezeichnung;
    }
}
