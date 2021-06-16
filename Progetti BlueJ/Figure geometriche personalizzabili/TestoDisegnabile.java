public class TestoDisegnabile implements Disegnabile
{
    protected String colore, testo;
    protected int x,y;
    
    public TestoDisegnabile()
    {
        testo = "";
    }
    
    public void ImpostaTesto(String t)
    {
        testo = t;
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
        return "Testo da visualizzare: " + y;
    }
}