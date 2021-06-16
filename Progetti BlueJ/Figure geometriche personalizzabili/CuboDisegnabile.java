public class CuboDisegnabile extends Cubo implements Disegnabile
{
    protected String colore;
    protected int x,y;
    
    public CuboDisegnabile(double l)
    {
        super(l);
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
        return "Disegna il cubo di colore " + colore + " in posizione " + x + "," + y;
    }
}
