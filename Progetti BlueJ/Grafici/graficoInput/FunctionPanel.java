import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FunctionPanel extends JPanel implements ActionListener
{
    int larghezza=800, altezza=600;
    float fattoreScalaX, fattoreScalaY;
    
    int xMin,xMax,yMin,yMax;
    String SxMin,SxMax,SyMin,SyMax;
    
    JTextField txt1,txt2,txt3,txt4;

    public FunctionPanel()
    {
        super();

        txt1 = new JTextField("", 25);
        
        txt2 = new JTextField("", 25);

        txt3 = new JTextField("", 25);

        txt4 = new JTextField("", 25);
        
        JButton b = new JButton("Genera il grafico");

        b.addActionListener(this);

        add(txt1);
        add(txt2);
        add(txt3);
        add(txt4);

        add(b);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        SxMin = txt1.getText();
        SxMax = txt2.getText();
        SyMin = txt3.getText();
        SyMax = txt4.getText();
        
        xMin = Integer.valueOf(SxMin).intValue();
        xMax = Integer.valueOf(SxMax).intValue();
        yMin = Integer.valueOf(SyMin).intValue();
        yMax = Integer.valueOf(SyMax).intValue();
        
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setBackground(Color.white);
        fattoreScalaX=larghezza/((float)xMax-xMin);
        fattoreScalaY=altezza/((float)yMax-yMin);
        
        g.drawString("Grafico funzione (3x^2 - 2)/(2x^2 + 1) by Massimo Arnoni",100,60);
        
        for(int x=100; x<900; x=x+10)
        {
            
            g.setColor(Color.green);
            g.drawLine(x, 100, x, 700);
         
        }
        
        for(int y=100; y<700; y=y+10)
        {
           
            g.setColor(Color.green);
            g.drawLine(100, y, 900, y);
         
        }
        
        g.setColor(Color.black);

        g.drawString("xMin",60,40);
        g.drawString("xMax",330,40);
        g.drawString("yMin",600,40);
        g.drawString("yMax",850,40);
        
        g.drawRect(100,100,larghezza,altezza);
        
        g.setColor(Color.red);
        g.drawLine(100, (altezza-Math.round((-yMin) * fattoreScalaY)) + 100, larghezza + 100, (altezza-Math.round((-yMin)*fattoreScalaY)) + 100);
        g.drawLine((Math.round((-xMin) * fattoreScalaX)) + 100, 100, (Math.round((-xMin)*fattoreScalaX)) + 100, altezza + 100);
        
        g.drawString(""+xMin, 80, altezza-Math.round((-yMin)*fattoreScalaY) + 105);
        g.drawString(""+xMax, larghezza + 110, altezza-Math.round((-yMin)*fattoreScalaY) + 105);
        g.drawString(""+yMax, Math.round((-xMin) * fattoreScalaX) + 95, 80);
        g.drawString(""+yMin, Math.round((-xMin) * fattoreScalaX) + 95,altezza + 120);
        
        g.setColor(Color.blue);
        setPixel(g,xMin,f(xMin));
        
        for (int ix=1; ix<larghezza; ix++)
        {
            float x = xMin + ((float)ix) / fattoreScalaX;
            setPixel(g,x,f(x));
        }
    }
    
    static float f(float x)
    {
        return (float)((3 * (x * x)) - 2)/((2 * (x * x)) + 1);
    }
    
    void setPixel(Graphics g, float x, float y)
    {
        if (x < xMin || x > xMax || y < yMin || y > yMax)
        return;
        int ix = (Math.round((x-xMin)*fattoreScalaX)) + 100;
        int iy = (altezza-Math.round((y-yMin)*fattoreScalaY)) + 100;
        g.drawLine(ix,iy,ix,iy);
    }
    
    //int xMin=-9, xMax=5, yMin=-3, yMax=4;
}