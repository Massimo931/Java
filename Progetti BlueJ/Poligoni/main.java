import java.io.*;

public class main
{
    public static void main()
    {
        BufferedReader acquisizione = new BufferedReader(new InputStreamReader(System.in));
        
        int lati = 0;
        double valore_lato = 0;
        String Sn;
        
        do{
            System.out.println("Lati del poligono:");
            
            try{
                Sn = acquisizione.readLine();
                lati = Integer.valueOf(Sn).intValue();
            }
            catch(Exception e){}
        }while(lati < 3 || lati > 12);

        System.out.println("Lunghezza del lato:");

        try{
            Sn = acquisizione.readLine();
            valore_lato = Double.parseDouble(Sn);
        }
        catch(Exception e){}
        
        Poligono pol = new Poligono(lati, valore_lato);
        
        System.out.println("Perimetro:\t" + pol.perimetro());
        System.out.println("\nApotema:\t" + pol.apotema());
        System.out.println("\nArea:\t" + pol.area());
    }
}
