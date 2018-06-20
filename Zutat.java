
/**
 * Beschreiben Sie hier die Klasse Zutat.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zutat
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private boolean istVegetarisch;

    /**
     * Konstruktor für Objekte der Klasse Zutat
     */
    public Zutat(String name, boolean istVegetarisch)
    {
        this.name=name;
        this.istVegetarisch=istVegetarisch;
    }
    
    public boolean gibVegetarisch()
    {
        return istVegetarisch;
    }
    
    public void zutatDrucken()
    {
        System.out.println(name);
    }

}
