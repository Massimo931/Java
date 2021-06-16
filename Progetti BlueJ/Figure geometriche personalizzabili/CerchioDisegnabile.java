public class CerchioDisegnabile extends Cerchio implements Disegnabile
{
    protected String colore;
    protected int x,y;
    
    public CerchioDisegnabile(double r)
    {
        super(r);
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
        return "Disegna il cerchio di colore " + colore + " in posizione " + x + "," + y;
    }
}