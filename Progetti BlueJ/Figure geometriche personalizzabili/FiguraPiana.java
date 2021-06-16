public abstract class FiguraPiana
{
    protected double a, p;
    
    public FiguraPiana()
    {

    }

    public abstract double Area();
    public abstract double Perimetro();
    public abstract String toString();
    
    public void SetPerimetro(double perimetro)
    {
        p = perimetro;
    }
    
    public void SetArea(double area)
    {
        a = area;
    }
    
    public double GetPerimetro()
    {
        return p;
    }
    
    public double GetArea()
    {
        return a;
    }
}