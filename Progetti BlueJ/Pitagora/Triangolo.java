import java.lang.Math;

public class Triangolo
{
    private double cat1, cat2, ipotenusa, area, perimetro, altezza;

    public Triangolo(double cat1, double cat2, double ipotenusa)
    {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.ipotenusa = ipotenusa;
    }

    public double calcola_cateto()
    {
        cat2 = Math.sqrt((ipotenusa * ipotenusa) - (cat1 * cat1));
        
        return cat2;
    }
    
    public double calcola_ipotenusa()
    {
        ipotenusa = Math.sqrt((cat2 * cat2) + (cat1 * cat1));
        
        return ipotenusa;
    }
    
    public double calcola_altezza()
    {
        altezza = (cat1 * cat2) / ipotenusa;
        
        return altezza;
    }
    
    public double calcola_perimetro()
    {
        perimetro = cat1 + cat2 + ipotenusa;
        
        return perimetro;
    }
    
    public double calcola_area()
    {
        area = (ipotenusa * altezza) / 2;
        
        return area;
    }
}