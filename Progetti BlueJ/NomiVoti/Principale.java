import java.io.*;
    
public class Principale
{
    public static void Principale()
    {
        BufferedReader acquisizione = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        
        do{
            System.out.println("Inserisci il numero di alunni: ");
    
            String Sn;
            try{
                Sn = acquisizione.readLine();
                n = Integer.valueOf(Sn).intValue();
            }
            catch(Exception e){}
        }while(n < 0);

        String alunni[] = new String[n];
        
        float voti[] = new float[n];

        float media = 0.0f;

        float Vmax = 0.0f;

        float Vmin = 10.0f;

        for (int i = 0; i < n; i++)
        {
            int contatore = 1 + i;
            
            System.out.println("Inserisci il nome dell'alunno " + contatore + ": ");

            try{
                alunni[i] = acquisizione.readLine();
            }
            catch(Exception e){}
            
            do{
                System.out.println("Inserisci il voto dell'alunno " + alunni[i] +  ": ");

                String Svoto;
                try{
                    Svoto = acquisizione.readLine();
                    voti[i] = Float.valueOf(Svoto).floatValue();
                }
                catch(Exception e){}
                
                if(voti[i] < 1 || voti[i] > 10)
                {
                    System.out.println("Valore non valido, ti preghiamo di riprovare.\n");
                }
            }while(voti[i] < 1 || voti[i] > 10);

            if(voti[i] > Vmax)
            {
                Vmax = voti[i];
            }

            if(voti[i] < Vmin)
            {
                Vmin = voti[i];
            }

            media = media + voti[i];
        }

        media = media / n;

        System.out.println("La media dei voti è " + media);

        System.out.println("Il voto massimo è stato " + Vmax);

        System.out.println("Il voto minimo è stato " + Vmin);
    }
}