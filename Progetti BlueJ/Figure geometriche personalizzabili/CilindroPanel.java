import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CilindroPanel extends JPanel implements ActionListener
{
    JPanel risultati, layout, form, bottoni;
    JTextField txt1,txt2, txt3, txt4, txt5, txt6;
    JLabel raggio, perimetro, area, cordx, cordy, colore, altezza;
    JButton calcolo;
    JComboBox listcolor;
    double r = 300;
    double h = 400;
    int x = 200;
    int y = 200;
    int r1 = 300;
    int h1 = 400;
    java.awt.Color c = Color.BLUE;
    
    public CilindroPanel()
    {
        super();
        
        raggio = new JLabel("Raggio: ");
        altezza = new JLabel("Altezza: ");
        perimetro = new JLabel("Volume: ");
        cordx = new JLabel("X: ");
        cordy = new JLabel("Y: ");
        colore = new JLabel("Colore: ");
        area = new JLabel("Superficie Totale: ");
        txt1 = new JTextField("300", 20);
        txt4 = new JTextField("200", 20);
        txt5 = new JTextField("200", 20);
        txt6 = new JTextField("400", 20);
        txt2 = new JTextField("", 20);
        txt2.setEditable(false);
        txt3 = new JTextField("", 20);
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
        GridLayout griglia3 = new GridLayout(8,1);
        form.setLayout(griglia3);
        form.add(raggio);
        form.add(txt1);
        form.add(altezza);
        form.add(txt6);
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
            r = 0;
            r1 = 0;
            
            h = 0;
            h1 = 0;
        }
        
        else
        {
            r = Double.valueOf(txt1.getText()).doubleValue();
            r1 = Integer.valueOf(txt1.getText()).intValue();
            
            h = Double.valueOf(txt6.getText()).doubleValue();
            h1 = Integer.valueOf(txt6.getText()).intValue();
        }
        
        Cilindro figura = new Cilindro(r,h);
        
        txt2.setText(String.valueOf(figura.Volume()));
        txt3.setText(String.valueOf(figura.Area()));
        
        CilindroDisegnabile disegno = new CilindroDisegnabile(r,h);
        

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
        
        for(int i = 0; i <= h1 / 3; i++)
        {
            g.fillOval(x + i,y + i,r1 + 5,r1 + 5);
        }

        g.setColor(c);

        for(int i = 0; i <= h1 / 3; i++)
        {
            g.fillOval(x + 5 + i,y + 5 + i,r1 - 5,r1 - 5);
        }
        
        g.setColor(Color.YELLOW);
        g.fillOval(x + (h1 / 3),y + (h1 / 3),r1 + 5,r1 + 5);
        
        g.setColor(c);
        g.fillOval(x + 5 + (h1 / 3),y + 5 + (h1 / 3),r1 - 5,r1 - 5);
    }
}