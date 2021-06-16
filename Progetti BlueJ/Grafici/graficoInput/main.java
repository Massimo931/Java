import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class main
{
    public static void main()
    {
        JFrame f = new JFrame("Grafico funzione (3x^2 - 2)/(2x^2 + 1) by Massimo Arnoni");
        Container c = f.getContentPane();
        FunctionPanel p = new FunctionPanel();
        c.add(p);
        f.setBounds(300,100,1300,800);
        f.show();
    }   
}