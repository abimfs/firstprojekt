import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Speise.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Speise
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private double grundpreis;
    private ArrayList<Zutat> zutaten;

    /**
     * Konstruktor für Objekte der Klasse Speise
     */
    public Speise(String name, double grundpreis)
    {
        this.name=name;
        this.grundpreis=grundpreis;
        zutaten=new ArrayList<Zutat>();
    }
    
    public void zutatHinzufuegen(Zutat zutat)
    {
        zutaten.add(zutat);
    }
    
    public double gibGesamtpreis()
    {
        //todo
        return grundpreis + zutaten.size();
    }
    
    public boolean istVegetarisch()
    {
        for(Zutat zutat:zutaten)
        {
            if(!zutat.gibVegetarisch())
            {
                return false;
            }
        }
        return true;
    }
    
    public void speiseDrucken()
    {
        System.out.print(name + "(vegetarisch: ");
        if(istVegetarisch())
        {
            System.out.println("ja)");
        }
        else
        {
            System.out.println("nein)");
        }
        for(Zutat zutat:zutaten)
        {
            zutat.zutatDrucken();
        }
        System.out.println(gibGesamtpreis() + " Euro");
    }
    
}
