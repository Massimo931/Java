import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SceltaPanel extends JPanel implements ActionListener
{
    JTextField txt;
    JComboBox list;
    
    public SceltaPanel()
    {
        super();
        
        list = new JComboBox();
        list.setEditable(false);
        
        list.addItem("Seleziona una figura:");
        list.addItem("Quadrato");
        list.addItem("Rettangolo");
        list.addItem("Cerchio");
        list.addItem("Cubo");
        list.addItem("Parallelepipedo");
        list.addItem("Cilindro");
        list.addActionListener(this);
        add(list);
    }

    public void actionPerformed(ActionEvent e)
    {
        String scelta = (String) list.getSelectedItem();
        
        if(scelta == "Seleziona una figura:")
        {
            
        }
        
        else if(scelta == "Quadrato")
        {
            JFrame f = new JFrame("Quadrato - Arnoni Massimo");

            Container c = f.getContentPane();
            QuadratoPanel p = new QuadratoPanel();
            c.add(p);
            f.setBounds(100,100,700,700);
            f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            f.show();
        }
        
        else if(scelta == "Rettangolo")
        {
            JFrame f = new JFrame("Rettangolo - Arnoni Massimo");

            Container c = f.getContentPane();
            RettangoloPanel p = new RettangoloPanel();
            c.add(p);
            f.setBounds(100,100,700,700);
            f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            f.show();
        }
        
        else if(scelta == "Cerchio")
        {
            JFrame f = new JFrame("Cerchio - Arnoni Massimo");

            Container c = f.getContentPane();
            CerchioPanel p = new CerchioPanel();
            c.add(p);
            f.setBounds(100,100,700,700);
            f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            f.show();
        }
        
        else if(scelta == "Cubo")
        {
            JFrame f = new JFrame("Cubo - Arnoni Massimo");

            Container c = f.getContentPane();
            CuboPanel p = new CuboPanel();
            c.add(p);
            f.setBounds(100,100,700,700);
            f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            f.show();
        }
        
        else if(scelta == "Parallelepipedo")
        {
            JFrame f = new JFrame("Parallelepipedo - Arnoni Massimo");

            Container c = f.getContentPane();
            ParallelepipedoPanel p = new ParallelepipedoPanel();
            c.add(p);
            f.setBounds(100,100,700,700);
            f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            f.show();
        }
        
        else if(scelta == "Cilindro")
        {
            JFrame f = new JFrame("Cilindro - Arnoni Massimo");

            Container c = f.getContentPane();
            CilindroPanel p = new CilindroPanel();
            c.add(p);
            f.setBounds(100,100,700,700);
            f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            f.show();
        }
    }
}