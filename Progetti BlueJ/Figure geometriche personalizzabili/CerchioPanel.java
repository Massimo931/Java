import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CerchioPanel extends JPanel implements ActionListener
{
    JPanel risultati, layout, form, bottoni;
    JTextField txt1,txt2, txt3, txt4, txt5;
    JLabel raggio, perimetro, area, cordx, cordy, colore, colore1;
    JButton calcolo;
    JComboBox listcolor, listcolor1;
    double r = 300;
    int x = 200;
    int y = 200;
    int r1 = 300;
    java.awt.Color c = Color.BLUE;
    java.awt.Color c1 = Color.MAGENTA;
    
    public CerchioPanel()
    {
        super();
        
        raggio = new JLabel("Raggio: ");
        perimetro = new JLabel("Circonferenza: ");
        cordx = new JLabel("X: ");
        cordy = new JLabel("Y: ");
        colore = new JLabel("Colore area: ");
        colore1 = new JLabel("Colore perimetro: ");
        area = new JLabel("Area: ");
        txt1 = new JTextField("300", 10);
        txt4 = new JTextField("200", 10);
        txt5 = new JTextField("200", 10);
        txt2 = new JTextField("", 10);
        txt2.setEditable(false);
        txt3 = new JTextField("", 10);
        txt3.setEditable(false);
        calcolo = new JButton("Calcola");
        calcolo.addActionListener(this);
        listcolor = new JComboBox();
        listcolor.setEditable(false);
        listcolor.addItem("Blu");
        listcolor.addItem("Giallo");
        listcolor.addItem("Verde");
        listcolor.addItem("Arancione");
        listcolor.addItem("Magenta");
        listcolor.addItem("Azzurro");
        listcolor.addItem("Nero");
        listcolor.addActionListener(this);
        listcolor1 = new JComboBox();
        listcolor1.setEditable(false);
        listcolor1.addItem("Magenta");
        listcolor1.addItem("Giallo");
        listcolor1.addItem("Blu");
        listcolor1.addItem("Arancione");
        listcolor1.addItem("Verde");
        listcolor1.addItem("Azzurro");
        listcolor1.addItem("Nero");
        listcolor1.addActionListener(this);
        
        form = new JPanel();
        GridLayout griglia3 = new GridLayout(8,1);
        form.setLayout(griglia3);
        form.add(raggio);
        form.add(txt1);
        form.add(cordx);
        form.add(txt4);
        form.add(cordy);
        form.add(txt5);
        form.add(colore);
        form.add(listcolor);
        form.add(colore1);
        form.add(listcolor1);
        form.add(perimetro);
        form.add(txt2);
        form.add(area);
        form.add(txt3);
        form.add(calcolo);
        add(form);
    }

    public void actionPerformed(ActionEvent e)
    {
        String operazione = e.getActionCommand();
        
        if(txt1.getText() == "")
        {
            r = 0;
            r1 = 0;
        }
        
        else
        {
            r = Double.valueOf(txt1.getText()).doubleValue();
            r1 = Integer.valueOf(txt1.getText()).intValue();
        }
        
        Cerchio figura = new Cerchio(r);
        
        txt2.setText(String.valueOf(figura.Perimetro()));
        txt3.setText(String.valueOf(figura.Area()));
        
        CerchioDisegnabile disegno = new CerchioDisegnabile(r);
        

        disegno.FissaPosizione(Integer.valueOf(txt4.getText()).intValue(),Integer.valueOf(txt5.getText()).intValue());

        x = disegno.x;
        y = disegno.y;
        
        String scelta = (String) listcolor.getSelectedItem();
        
        if(scelta == "Verde")
        {
            c = Color.GREEN;
        }
        
        else if(scelta == "Giallo")
        {
            c = Color.YELLOW;
        }
        
        else if(scelta == "Blu")
        {
            c = Color.BLUE;
        }
        
        else if(scelta == "Arancione")
        {
            c = Color.ORANGE;
        }
        
        else if(scelta == "Magenta")
        {
            c = Color.MAGENTA;
        }
        
        else if(scelta == "Azzurro")
        {
            c = Color.CYAN;
        }
        
        else if(scelta == "Nero")
        {
            c = Color.BLACK;
        }
        
        disegno.ImpostaColore(scelta);
        
        area.setForeground(c);
        
        String scelta1 = (String) listcolor1.getSelectedItem();
        
        if(scelta1 == "Verde")
        {
            c1 = Color.GREEN;
        }
        
        else if(scelta1 == "Giallo")
        {
            c1 = Color.YELLOW;
        }
        
        else if(scelta1 == "Blu")
        {
            c1 = Color.BLUE;
        }
        
        else if(scelta1 == "Arancione")
        {
            c1 = Color.ORANGE;
        }
        
        else if(scelta1 == "Magenta")
        {
            c1 = Color.MAGENTA;
        }
        
        else if(scelta1 == "Azzurro")
        {
            c1 = Color.CYAN;
        }
        
        else if(scelta1 == "Nero")
        {
            c1 = Color.BLACK;
        }
        
        perimetro.setForeground(c1);
        
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        area.setForeground(c);
        perimetro.setForeground(c1);
        
        g.setColor(c1);
        g.fillOval(x,y,r1,r1);
        
        g.setColor(c);
        g.fillOval(x + 5,y + 5,r1 - 10,r1 - 10);
    }
}
