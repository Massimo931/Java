import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ParallelepipedoPanel extends JPanel implements ActionListener
{
    JPanel risultati, layout, form, bottoni;
    JTextField txt1,txt2, txt3, txt4, txt5, txt6, txt7;
    JLabel base, perimetro, area, cordx, cordy, colore, altezza, lato;
    JButton calcolo;
    JComboBox listcolor;
    double b = 300;
    double h = 200;
    double l = 400;
    int x = 200;
    int y = 200;
    int b1 = 300;
    int h1 = 200;
    int l1 = 400;
    java.awt.Color c = Color.BLUE;
    
    public ParallelepipedoPanel()
    {
        super();
        
        lato = new JLabel("Lato: ");
        base = new JLabel("Base: ");
        altezza = new JLabel("Altezza: ");
        perimetro = new JLabel("Volume: ");
        cordx = new JLabel("X: ");
        cordy = new JLabel("Y: ");
        colore = new JLabel("Colore: ");
        area = new JLabel("Superficie Totale: ");
        txt1 = new JTextField("300", 10);
        txt6 = new JTextField("200", 10);
        txt7 = new JTextField("400", 10);
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
        
        form = new JPanel();
        GridLayout griglia3 = new GridLayout(9,1);
        form.setLayout(griglia3);
        form.add(base);
        form.add(txt1);
        form.add(altezza);
        form.add(txt6);
        form.add(lato);
        form.add(txt7);
        form.add(cordx);
        form.add(txt4);
        form.add(cordy);
        form.add(txt5);
        form.add(colore);
        form.add(listcolor);
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
            b = 0;
            b1 = 0;
            
            h = 0;
            h1 = 0;
            
            l = 0;
            l1 = 0;
        }
        
        else
        {
            b = Double.valueOf(txt1.getText()).doubleValue();
            b1 = Integer.valueOf(txt1.getText()).intValue();
            
            h = Double.valueOf(txt6.getText()).doubleValue();
            h1 = Integer.valueOf(txt6.getText()).intValue();
            
            l = Double.valueOf(txt7.getText()).doubleValue();
            l1 = Integer.valueOf(txt7.getText()).intValue();
        }
        
        Parallelepipedo figura = new Parallelepipedo(b,h,l);
        
        txt2.setText(String.valueOf(figura.Volume()));
        txt3.setText(String.valueOf(figura.Area()));
        
        ParallelepipedoDisegnabile disegno = new ParallelepipedoDisegnabile(b,h,l);
        
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
        
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        area.setForeground(c);
        
        g.setColor(Color.YELLOW);
        
        for(int i = 0; i <= l1 / 3; i++)
        {
            g.fillRect(x + i,y + i,b1 + 5,h1 + 5);
        }

        g.setColor(c);

        for(int i = 0; i <= l1 / 3; i++)
        {
            g.fillRect(x + 5 + i,y + 5 + i,b1 - 5,h1 - 5);
        }
        
        g.setColor(Color.YELLOW);
        g.fillRect(x +  + (l1 / 3),y +  + (l1 / 3),b1 + 5,h1 + 5);

        g.setColor(c);
        g.fillRect(x + 5 + (l1 / 3),y + 5 + (l1 / 3),b1 - 5,h1 - 5);
    }
}