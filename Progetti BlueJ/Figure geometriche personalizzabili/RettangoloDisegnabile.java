public class RettangoloDisegnabile extends Rettangolo implements Disegnabile
{
    protected String colore;
    protected int x,y;
    
    public RettangoloDisegnabile(double b, double h)
    {
        super(b,h);
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
        return "Disegna il rettangolo di colore " + colore + " in posizione " + x + "," + y;
    }
}