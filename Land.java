import java.util.ArrayList;

public class Land
{
   
    private ArrayList<Spieler> spielern;
    private String landerName;
    private String tFarbe;
    private String tranier;
    
    
    public Land(String landerName,String tFarbe,String tranier)
    {
       this.landerName=landerName;
       this.tFarbe=tFarbe;
       this.tranier=tranier;
        spielern= new ArrayList<Spieler>();
        
    }

   
    public String gibLanderName()
    {
       return landerName; 
        
    }
    public String gibTfarbe()
    {
       return tFarbe; 
        
    }
    public String gibTranier()
    {
       return tranier; 
        
    }
    public void spielerHinzufuegen(Spieler spieler)
    {
      spielern.add(spieler); 
       
    }
    public void landDrucken()
    {
        for(Spieler spieler:spielern)
        {
         spieler.spielerzeigen();
        }
        System.out.println("tranier - " + tranier );
    }
   }
