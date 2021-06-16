import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CuboPanel extends JPanel implements ActionListener
{
    JPanel risultati, layout, form, bottoni;
    JTextField txt1,txt2, txt3, txt4, txt5;
    JLabel lato, perimetro, area, cordx, cordy, colore;
    JButton calcolo;
    JComboBox listcolor;
    double l = 300;
    int x = 200;
    int y = 200;
    int l1 = 300;
    java.awt.Color c = Color.BLUE;
    
    public CuboPanel()
    {
        super();
        
        lato = new JLabel("Lato: ");
        perimetro = new JLabel("Volume: ");
        cordx = new JLabel("X: ");
        cordy = new JLabel("Y: ");
        colore = new JLabel("Colore: ");
        area = new JLabel("Superficie Totale: ");
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
        
        form = new JPanel();
        GridLayout griglia3 = new GridLayout(7,1);
        form.setLayout(griglia3);
        form.add(lato);
        form.add(txt1);
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
            l = 0;
            l1 = 0;
        }
        
        else
        {
            l = Double.valueOf(txt1.getText()).doubleValue();
            l1 = Integer.valueOf(txt1.getText()).intValue();
        }
        
        Cubo figura = new Cubo(l);
        
        txt2.setText(String.valueOf(figura.Volume()));
        txt3.setText(String.valueOf(figura.Area()));
        
        CuboDisegnabile disegno = new CuboDisegnabile(l);
        

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
            g.fillRect(x + i,y + i,l1 + 5,l1 + 5);
        }

        g.setColor(c);

        for(int i = 0; i <= l1 / 3; i++)
        {
            g.fillRect(x + 5 + i,y + 5 + i,l1 - 5,l1 - 5);
        }
        
        g.setColor(Color.YELLOW);
        g.fillRect(x + (l1 / 3),y + (l1 / 3),l1 + 5,l1 + 5);

        g.setColor(c);
        g.fillRect(x + 5 + (l1 / 3),y + 5 + (l1 / 3),l1 - 5,l1 - 5);
    }
}