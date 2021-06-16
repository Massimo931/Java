import java.io.*;

public class main
{
    public static void main()
    {
        BufferedReader acquisizione = new BufferedReader(new InputStreamReader(System.in));

        int scelta = 0;
        String Sn;
        
        double cat1 = 0;
        double cat2 = 0;
        double ipotenusa = 0;

        do{
            do{
                System.out.println("Triangolo rettangolo avente:\n1)\tCateto e ipotenusa\n2)\tCateti\n3)\tCateti e ipotenusa\n0)\tTermina\n");
                
                try{
                    Sn = acquisizione.readLine();
                    scelta = Integer.valueOf(Sn).intValue();
                }
                catch(Exception e){}
            }while(scelta < 0 || scelta > 3);
            
            switch(scelta)
            {
                case 1:
                
                    do{
                        System.out.println("Misura del cateto:");
                        
                        try{
                            Sn = acquisizione.readLine();
                            cat1 = Double.valueOf(Sn).doubleValue();
                        }
                        catch(Exception e){}
                    }while(cat1 <= 0);
                    
                    do{
                        System.out.println("Misura dell'ipotenusa:");
                        
                        try{
                            Sn = acquisizione.readLine();
                            ipotenusa = Double.valueOf(Sn).doubleValue();
                        }
                        catch(Exception e){}
                    }while(ipotenusa <= 0);
    
                    Triangolo triangolo_rettangolo1 = new Triangolo(cat1, cat2, ipotenusa);
    
                    System.out.println("Il secondo cateto e': " + triangolo_rettangolo1.calcola_cateto());
                    System.out.println("L'altezza e': " + triangolo_rettangolo1.calcola_altezza());
                    System.out.println("Il perimetro e': " + triangolo_rettangolo1.calcola_perimetro());
                    System.out.println("L'area e': " + triangolo_rettangolo1.calcola_area());
                    
                    break;
                    
                case 2:

                    do{
                        System.out.println("Misura del primo cateto:");
                        
                        try{
                            Sn = acquisizione.readLine();
                            cat1 = Double.valueOf(Sn).doubleValue();
                        }
                        catch(Exception e){}
                    }while(cat1 <= 0);
                    
                    do{
                        System.out.println("Misura del secondo cateto:");
                        
                        try{
                            Sn = acquisizione.readLine();
                            cat2 = Double.valueOf(Sn).doubleValue();
                        }
                        catch(Exception e){}
                    }while(cat2 <= 0);
    
                    Triangolo triangolo_rettangolo2 = new Triangolo(cat1, cat2, ipotenusa);
                    
                    System.out.println("L'ipotenusa e': " + triangolo_rettangolo2.calcola_ipotenusa());
                    System.out.println("L'altezza e': " + triangolo_rettangolo2.calcola_altezza());
                    System.out.println("Il perimetro e': " + triangolo_rettangolo2.calcola_perimetro());
                    System.out.println("L'area e': " + triangolo_rettangolo2.calcola_area());
    
                    break;
                
                case 3:
                
                    do{
                        System.out.println("Misura del primo cateto:");
                        
                        try{
                            Sn = acquisizione.readLine();
                            cat1 = Double.valueOf(Sn).doubleValue();
                        }
                        catch(Exception e){}
                    }while(cat1 <= 0);
                    
                    do{
                        System.out.println("Misura del secondo cateto:");
                        
                        try{
                            Sn = acquisizione.readLine();
                            cat2 = Double.valueOf(Sn).doubleValue();
                        }
                        catch(Exception e){}
                    }while(cat2 <= 0);
                    
                    do{
                        System.out.println("Misura dell'ipotenusa:");
                        
                        try{
                            Sn = acquisizione.readLine();
                            ipotenusa = Double.valueOf(Sn).doubleValue();
                        }
                        catch(Exception e){}
                    }while(ipotenusa <= 0);
    
                    Triangolo triangolo_rettangolo3 = new Triangolo(cat1, cat2, ipotenusa);
    
                    System.out.println("L'altezza e': " + triangolo_rettangolo3.calcola_altezza());
                    System.out.println("Il perimetro e': " + triangolo_rettangolo3.calcola_perimetro());
                    System.out.println("L'area e': " + triangolo_rettangolo3.calcola_area());
                    
                    break;
            }
            
            cat1 = 0;
            cat2 = 0;
            ipotenusa = 0;
            
        }while(scelta != 0);
    }
}
