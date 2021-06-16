public class Parallelepipedo extends Rettangolo
{
    protected double v, l;
    
    public Parallelepipedo(double b, double h, double l)
    {
        super(b,h);
        this.l = l;
    }

    public double Area()
    {
        a = (b * h * 2) + (l * h * 2) + (l * b * 2);
        return a;
    }
    
    public double Volume()
    {
        v = b * h * l;
        return v;
    }
    
    public String toString()
    {
        return "Superficie parallelepipedo: " + a + "\nVolume parallelepipedo: " + v;
    }
    
    public void SetVolume(double v)
    {
        this.v = v;
    }
    
    public double GetVolume()
    {
        return v;
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
