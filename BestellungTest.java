

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse BestellungTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BestellungTest
{
    private Adresse adresse1;
    private Kunde kunde1;
    private Zutat zutat1;
    private Zutat zutat2;
    private Zutat zutat3;
    private Zutat zutat4;
    private Zutat zutat5;
    private Zutat zutat6;
    private Zutat zutat7;
    private Zutat zutat8;
    private Zutat zutat9;
    private Bestellung bestellu1;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
 
    
  
    /**
     * Konstruktor fuer die Test-Klasse BestellungTest
     */
    public BestellungTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        adresse1 = new Adresse("August-Thyssen-Str.", 15, 52249, "Eschweiler");
        kunde1 = new Kunde("Herr Gurdon", "02403 6097-0", adresse1);
        zutat1 = new Zutat("Salami", false);
        zutat2 = new Zutat("Käse", true);
        zutat3 = new Zutat("Schinken", false);
        zutat4 = new Zutat("Spinat", true);
        zutat5 = new Zutat("Gorgonzola", true);
        zutat6 = new Zutat("Ananas", true);
        zutat7 = new Zutat("Parmesan", true);
        zutat8 = new Zutat("Gruyere", true);
        zutat9 = new Zutat("Mozzarella", true);
        bestellu1 = new Bestellung(kunde1);
        
        pizza1 = new Pizza("Pizza Hawaii", 5, 32);
        pizza1.zutatHinzufuegen(zutat2);
        pizza1.zutatHinzufuegen(zutat3);
        pizza1.zutatHinzufuegen(zutat6);
        bestellu1.speiseHinzufuegen(pizza1);
        
        pizza2 = new Pizza("Pizza Salami", 5, 32);
        pizza2.zutatHinzufuegen(zutat2);
        pizza2.zutatHinzufuegen(zutat1);
        bestellu1.speiseHinzufuegen(pizza2);
        
        pizza3 = new Pizza("Pizza Quattro Fromagie", 5, 32);
        pizza3.zutatHinzufuegen(zutat5);
        pizza3.zutatHinzufuegen(zutat7);
        pizza3.zutatHinzufuegen(zutat8);
        pizza3.zutatHinzufuegen(zutat9);
        bestellu1.speiseHinzufuegen(pizza3);
        
        bestellu1.bestellungDrucken();
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
