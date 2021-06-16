import java.awt.*;
import javax.swing.*;

public class main
{
    public static void main()
    {
        JFrame f = new JFrame("Grafico funzione (3x^2 - 2)/(2x^2 + 1) by Massimo Arnoni");
        Container c = f.getContentPane();
        FunctionPanel p = new FunctionPanel();
        c.add(p);
        f.setBounds(500,200,1000,800);
        f.show();
    }   
}
