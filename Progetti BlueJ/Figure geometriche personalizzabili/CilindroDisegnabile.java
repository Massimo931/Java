public class CilindroDisegnabile extends Cilindro implements Disegnabile
{
    protected String colore;
    protected int x,y;
    
    public CilindroDisegnabile(double r, double h)
    {
        super(r,h);
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
        return "Disegna il cilindro di colore " + colore + " in posizione " + x + "," + y;
    }
}