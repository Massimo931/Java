public class Rettangolo extends FiguraPiana
{
    protected double b, h;
    
    public Rettangolo(double b, double h)
    {
        super();
        this.b = b;
        this.h = h;
    }

    public double Area()
    {
        a = b * h;
        return a;
    }
    
    public double Perimetro()
    {
        p = (b * 2) + (h * 2);
        return p;
    }
    
    public String toString()
    {
        return "Perimetro rettangolo: " + p + "\nArea rettangolo: " + a;
    }
    
    public void SetBase(double b)
    {
        this.b = b;
    }
    
    public double GetBase()
    {
        return b;
    }
    
    public void SetAltezza(double h)
    {
        this.h = h;
    }
    
    public double GetAltezza()
    {
        return h;
    }
}