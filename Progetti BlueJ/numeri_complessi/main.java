import java.io.*;

public class main
{
    public static void main()
    {
        BufferedReader acquisizione = new BufferedReader(new InputStreamReader(System.in));
       
        int n = 0;
        
        do{
            System.out.println("Quale operazione si desidera effettuare?\n1)\tSomma\n2)\tDifferenza\n3)\tProdotto\n4)\tRapporto\n5)\tConiugato\n6)\tModulo\n7)\tArgomento\n0)\tEsci");
            
            do{
                System.out.println("Scelta: ");
        
                String Sn;
                try{
                    Sn = acquisizione.readLine();
                    n = Integer.valueOf(Sn).intValue();
                }
                catch(Exception e){}
            }while(n < 0 || n > 7);
    
            float reale1 = 0;
            float immaginaria1 = 0;
            
            if(n > 0)
            {
                System.out.println("Inserire la parte reale del primo numero complesso: ");
                String Sreale1 = "0";
                try{
                    Sreale1 = acquisizione.readLine();
                    reale1 = Integer.valueOf(Sreale1).intValue();
                }
                catch(Exception e){}
                
                System.out.println("Inserire la parte immaginaria del primo numero complesso: ");
                String Simmaginaria1 = "0";
                try{
                    Simmaginaria1 = acquisizione.readLine();
                    immaginaria1 = Integer.valueOf(Simmaginaria1).intValue();
                }
                catch(Exception e){}
            }
            
            Complex complesso1 = new Complex(reale1, immaginaria1);
            
            float reale2 = 0;
            float immaginaria2 = 0;
            
            if(n < 5 && n > 0)
            {
                System.out.println("Inserire la parte reale del secondo numero complesso: ");
                String Sreale2 = "0";
                try{
                    Sreale2 = acquisizione.readLine();
                    reale2 = Integer.valueOf(Sreale2).intValue();
                }
                catch(Exception e){}
                
                System.out.println("Inserire la parte immaginaria del secondo numero complesso: ");
                String Simmaginaria2 = "0";
                try{
                    Simmaginaria2 = acquisizione.readLine();
                    immaginaria2 = Integer.valueOf(Simmaginaria2).intValue();
                }
                catch(Exception e){}
            }
            
            Complex complesso2 = new Complex(reale2, immaginaria2);
            
            Complex risultato = new Complex();
            
            switch(n)
            {
                case 1:
                    risultato.somma(complesso1, complesso2);
                    
                    System.out.println(complesso1.getReale() + " + " + complesso2.getReale() + " = " + risultato.getReale());
                    System.out.println(complesso1.getImmaginaria() + " + " + complesso2.getImmaginaria() + " = " + risultato.getImmaginaria());
                    System.out.println(risultato.getReale() + " + " + risultato.getImmaginaria() + " j");
                    
                    break;
                    
                case 2:
                    risultato.differenza(complesso1, complesso2);
                    
                    System.out.println(complesso1.getReale() + " - " + complesso2.getReale() + " = " + risultato.getReale());
                    System.out.println(complesso1.getImmaginaria() + " - " + complesso2.getImmaginaria() + " = " + risultato.getImmaginaria());
                    System.out.println(risultato.getReale() + " + " + risultato.getImmaginaria() + " j");
                    
                    break;
                    
                case 3:
                    risultato.prodotto(complesso1, complesso2);
                    
                    System.out.println(complesso1.getReale() + " * " + complesso2.getReale() + " = " + risultato.getReale());
                    System.out.println(complesso1.getImmaginaria() + " * " + complesso2.getImmaginaria() + " = " + risultato.getImmaginaria());
                    System.out.println(risultato.getReale() + " + " + risultato.getImmaginaria() + " j");
                    
                    break;
                    
                case 4:
                    risultato.rapporto(complesso1, complesso2);
                    
                    System.out.println(complesso1.getReale() + " + " + complesso1.getImmaginaria() + "j / " + complesso2.getReale() + " + " + complesso2.getImmaginaria() + "j = ");
                    System.out.println(risultato.getReale() + " + " + risultato.getImmaginaria() + " j");
                    
                    break;
                    
                case 5:
                    risultato.coniugato(complesso1);
                    System.out.println(risultato.getReale() + " + " + risultato.getImmaginaria() + " j");
                    
                    break;
                
                case 6:
                    System.out.println(risultato.modulo(complesso1));
                    
                    break;
                    
                case 7:
                    System.out.println(risultato.argomento(complesso1));
    
                    break;
            }
        }while(n != 0);
    }
}