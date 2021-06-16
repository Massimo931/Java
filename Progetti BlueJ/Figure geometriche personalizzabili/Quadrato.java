public class Quadrato extends FiguraPiana
{
    protected double l;
    
    public Quadrato(double l)
    {
        super();
        this.l = l;
    }

    public double Area()
    {
        a = l * l;
        return a;
    }
    
    public double Perimetro()
    {
        p = l * 4;
        return p;
    }
    
    public String toString()
    {
        return "Perimetro quadrato: " + p + "\nArea quadrato: " + a;
    }
    
    public void SetLato(double l)
    {
        this.l = l;
    }
    
    public double GetLato()
    {
        return l;
    }
}