

public class Spieler
{
   
    private String name;
    private int nummer;
    private String postion;

    
   
    public Spieler(String name,int nummer,String postion)
    {
        this.name=name;
        this.nummer=nummer;
        this.postion=postion;
    }

    
    public String gibName()
    {
       return name;
    }
    public int gibNummer()
    {
       return nummer;
    }
    public String gibPostion()
    {
       return postion;
    }
    public void spielerzeigen()
    {
      System.out.println("Spieler -"+ name); 
      System.out.println("Nummer - "+ nummer); 
      System.out.println("Postion - "+ postion); 
    }
}
