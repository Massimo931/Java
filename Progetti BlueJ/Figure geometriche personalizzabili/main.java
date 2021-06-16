import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class main
{
    public static void main()
    {
        JFrame f = new JFrame("Figura - Arnoni Massimo");
        Container c = f.getContentPane();
        SceltaPanel p = new SceltaPanel();
        c.add(p);
        f.setBounds(300,100,180,200);
        f.setResizable(false);
        f.show();
    }
}