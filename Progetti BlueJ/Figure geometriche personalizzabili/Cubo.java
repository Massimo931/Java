public class Cubo extends Quadrato
{
    protected double v;
    
    public Cubo(double l)
    {
        super(l);
    }

    public double Area()
    {
        a = l * l * 6;
        return a;
    }
    
    public double Volume()
    {
        v = l * l * l;
        return v;
    }
    
    public String toString()
    {
        return "Superficie cubo: " + a + "\nVolume cubo: " + v;
    }
    
    public void SetVolume(double v)
    {
        this.v = v;
    }
    
    public double GetVolume()
    {
        return v;
    }
}
