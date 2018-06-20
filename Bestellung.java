import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Bestellung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bestellung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Kunde kunde;
    private ArrayList<Speise> speisen;

    /**
     * Konstruktor für Objekte der Klasse Bestellung
     */
    public Bestellung(Kunde kunde)
    {
        this.kunde=kunde;
        speisen=new ArrayList<Speise>();
    }
    
    public void speiseHinzufuegen(Speise speise)
    {
        speisen.add(speise);
    }
    
    public void bestellungDrucken()
    {
        double gesamtpreis=0.0;
        kunde.kundeDrucken();
        for(Speise speise:speisen)
        {
            gesamtpreis = gesamtpreis + speise.gibGesamtpreis();
            System.out.println("--------------------");
            speise.speiseDrucken();
        }
        System.out.println("====================");
        System.out.println(gesamtpreis + " Euro");
    }
    public ArrayList<Pizza>gibAllePizza()
    {
        ArrayList<Pizza> tmppizza= new ArrayList<Pizza>();
        
        for(Speise speise:speisen)
        {
         if(speise instanceof Pizza)
         {
          Pizza pizza =(Pizza) speise;
          tmppizza.add(pizza);
         }   
        }
         return tmppizza;
    }
    public ArrayList<Pasta>gibAllePasta()
    {
        ArrayList<Pasta> tmppasta= new ArrayList<Pasta>();
        
        for(Speise speise:speisen)
        {
         if(speise instanceof Pasta)
         {
          Pasta pasta =(Pasta) speise;
          tmppasta.add(pasta);
         }   
        }
         return tmppasta;
    }
}
