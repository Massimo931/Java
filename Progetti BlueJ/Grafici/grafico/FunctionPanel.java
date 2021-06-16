import java.awt.*;
import javax.swing.*;

class FunctionPanel extends JPanel
{
    int xMin=-9, xMax=5, yMin=-3, yMax=4;
    int larghezza=800, altezza=600;
    float fattoreScalaX, fattoreScalaY;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setBackground(Color.white);
        fattoreScalaX=larghezza/((float)xMax-xMin);
        fattoreScalaY=altezza/((float)yMax-yMin);

        g.drawString("Grafico funzione (3x^2 - 2)/(2x^2 + 1) by Massimo Arnoni",60,40);
        
        for(int x=60; x<860; x=x+10)
        {
            
            g.setColor(Color.green);
            g.drawLine(x, 60, x, 660);
         
        }

        for(int y=60; y<660; y=y+10)
        {
           
            g.setColor(Color.green);
            g.drawLine(60, y, 860, y);
         
        }
        
        g.setColor(Color.black);
        g.drawRect(60,60,larghezza,altezza);

        g.setColor(Color.red);
        g.drawLine(60, (altezza-Math.round((-yMin) * fattoreScalaY)) + 60, larghezza + 60, (altezza-Math.round((-yMin)*fattoreScalaY)) + 60);
        g.drawLine((Math.round((-xMin) * fattoreScalaX)) + 60, 60, (Math.round((-xMin)*fattoreScalaX)) + 60, altezza + 60);

        g.drawString(""+xMin, 40, altezza-Math.round((-yMin)*fattoreScalaY) + 65);
        g.drawString(""+xMax, larghezza + 70, altezza-Math.round((-yMin)*fattoreScalaY) + 65);
        g.drawString(""+yMax, Math.round((-xMin) * fattoreScalaX) + 55, 50);
        g.drawString(""+yMin, Math.round((-xMin) * fattoreScalaX) + 55,altezza + 80);
        
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
        int ix = (Math.round((x-xMin)*fattoreScalaX)) + 60;
        int iy = (altezza-Math.round((y-yMin)*fattoreScalaY)) + 60;
        g.drawLine(ix,iy,ix,iy);
    }
}