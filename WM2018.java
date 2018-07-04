
/**
 * Beschreiben Sie hier die Klasse WM2018.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WM2018
{
    private Spiel spiel;
    private Land  land;
    /**
     * Konstruktor für Objekte der Klasse WM2018
     */
    public WM2018(Spiel spiel,Land land)
    {
        this.spiel=spiel;
        this.land=land;
    }

    
    public void wmDrucken()
    {
        spiel.spielDaten();
        land.landDrucken();
    }
}
