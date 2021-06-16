public class Cerchio extends FiguraPiana
{
    protected double r;
    
    public Cerchio(double r)
    {
        super();
        this.r = r;
    }

    public double Area()
    {
        a = r * r * Math.PI;
        return a;
    }
    
    public double Perimetro()
    {
        p = 2 * Math.PI * r;
        return p;
    }
    
    public String toString()
    {
        return "Circonferenza: " + p + "\nArea cerchio: " + a;
    }
    
    public void SetRaggio(double r)
    {
        this.r = r;
    }
    
    public double GetRaggio()
    {
        return r;
    }
}