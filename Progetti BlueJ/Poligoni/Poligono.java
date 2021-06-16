public class Poligono
{
    private static final double nf[] = {0.0, 0.0, 0.0, 0.289, 0.5, 0.688, 0.866, 1.038, 1.207, 1.374, 1.539, 1.703, 1.866};
    
    private int lati;
    private double valore_lato;
    
    private double perimetro = 0;
    private double area = 0;
    private double apotema = 0;
    

    
    public Poligono(int lati, double valore_lato)
    {
        this.lati = lati;
        this.valore_lato = valore_lato;
    }
    
    public double perimetro()
    {
        for(int i = 0; i < lati; i++)
        {
            perimetro += valore_lato;
        }
        
        return perimetro;
    }
    
    public double apotema()
    {
        apotema = nf[lati] * valore_lato;
        
        return apotema;
    }
    
    
    public double area()
    {
        area = (perimetro * apotema) / 2;
        
        return area;
    }
}
