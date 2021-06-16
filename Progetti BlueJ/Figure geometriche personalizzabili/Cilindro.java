public class Cilindro extends Cerchio
{
    protected double v, h;
    
    public Cilindro(double r, double h)
    {
        super(r);
        this.h = h;
    }

    public double Area()
    {
        a = (2 * Math.PI * r * h) + (r * r * Math.PI * 2);
        return a;
    }
    
    public double Volume()
    {
        v = r * r * Math.PI * h;
        return v;
    }
    
    public String toString()
    {
        return "Superficie cilindro: " + a + "\nVolume cilindro: " + v;
    }
    
    public void SetVolume(double v)
    {
        this.v = v;
    }
    
    public double GetVolume()
    {
        return v;
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
