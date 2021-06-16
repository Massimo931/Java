public class ParallelepipedoDisegnabile extends Parallelepipedo implements Disegnabile
{
    protected String colore;
    protected int x,y;
    
    public ParallelepipedoDisegnabile(double b, double h, double l)
    {
        super(b,h,l);
    }

    public void ImpostaColore(String c)
    {
        this.colore = c;
    }
    
    public void FissaPosizione(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public String Disegna()
    {
        return "Disegna il parallelepipedo di colore " + colore + " in posizione " + x + "," + y;
    }
}