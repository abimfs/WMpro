

public class Spiel
{
    
    private String ort;
    private int datum;
    private String team1;
    private String team2;

    
    public Spiel(String ort,int datum,String team1,String team2)
    {
        this.ort=ort;
        this.datum=datum;
        this.team1=team1;
        this.team2=team2;
    }

    
    public int gibDatum()
    {
        return datum;
    }
    public String gibOrt()
    {
        return ort;
    }
    public void spielDaten()
    {
     System.out.println(team1+ "gegen" + team2);
     System.out.println("Spiel ort --" + ort);
     System.out.println("Datum --" + datum);
     
    }
}
