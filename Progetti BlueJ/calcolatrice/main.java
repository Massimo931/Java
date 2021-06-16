import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class main
{
    public static void main()
    {
        JFrame f = new JFrame("Mini-calcolatrice - Arnoni Massimo");
        Container c = f.getContentPane();
        CalcPanel p = new CalcPanel();
        c.add(p);
        
        p.setBackground(Color.lightGray);

        f.setSize(350,385);
        f.setLocation(750,300);
        f.addWindowListener(new Terminator());
        f.setResizable(false);

        f.show();
    }
}