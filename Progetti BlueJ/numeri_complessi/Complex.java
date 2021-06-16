public class Complex
{
    private float Re, Im;
    
    public Complex()
    {
        Re = 0;
        Im = 0;
    }
    
    public Complex(float REpart, float IMpart)
    {
        Re = REpart;
        Im = IMpart;
    }
    
    void setReale(float REpart)
    {
        Re = REpart;
    }
    
    void setImmaginaria(float IMpart)
    {
        Im = IMpart;
    }
    
    float getReale()
    {
        return Re;
    }
    
    float getImmaginaria()
    {
        return Im;
    }
    
    void somma(Complex a, Complex b)
    {
        Re=a.getReale() + b.getReale();
        Im=a.getImmaginaria() + b.getImmaginaria();
    }
    
    void differenza(Complex a, Complex b)
    {
        Re=a.getReale() - b.getReale();
        Im=a.getImmaginaria() - b.getImmaginaria();
    }
    
    void prodotto(Complex a, Complex b)
    {
        Re=a.getReale() * b.getReale() - a.getImmaginaria() * b.getImmaginaria();
        Im=a.getImmaginaria() * b.getReale() + b.getImmaginaria() * a.getReale();
    }
    
    void rapporto(Complex a, Complex b)
    {  
        Re = (a.getReale() * b.getReale() + a.getImmaginaria() * b.getReale()) / ((b.getReale() * b.getReale()) + (b.getImmaginaria() * b.getImmaginaria()));
        Im = - (a.getReale() * b.getImmaginaria() - a.getImmaginaria() * b.getImmaginaria() * (-1)) / ((b.getReale() * b.getReale()) + (b.getImmaginaria() * b.getImmaginaria()));
    }
    
    void coniugato(Complex a)
    {
        Re = a.getReale();
        Im = -a.getImmaginaria();
    }
    
    double modulo(Complex a)
    {
        return Math.sqrt(a.getReale() * a.getReale() + a.getImmaginaria() * a.getImmaginaria());
    }
    
    double argomento(Complex a)
    {
        return Math.atan(a.getReale() / a.getImmaginaria());
    }
}
