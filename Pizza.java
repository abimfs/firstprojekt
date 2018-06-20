
/**
 * Beschreiben Sie hier die Klasse Pizza.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Pizza extends Speise
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int durchmesser;

    /**
     * Konstruktor für Objekte der Klasse Pizza
     */
    public Pizza(String name, double grundpreis, int durchmesser)
    {
        // Instanzvariable initialisieren
        super(name, grundpreis);
        this.durchmesser=durchmesser;
    }


}
