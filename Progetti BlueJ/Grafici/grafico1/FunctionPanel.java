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

        //g.drawString("Grafico funzione (3x^2 - 2)/(2x^2 + 1) by Massimo Arnoni",60,40);
        
        for(int x=0; x<800; x=x+20) {
            
            g.setColor(Color.green);
            g.drawLine(x, 0, x, 600);
         
        }

        for(int y=0; y<600; y=y+20) {
           
             g.setColor(Color.green);
             g.drawLine(0, y, 800, y);
         
        }
        
        g.setColor(Color.black);
        g.drawRect(0,0,larghezza-1,altezza-1);
        
        // assi cartesiani
        g.setColor(Color.red);
        g.drawLine(0, Math.round((-yMin) * fattoreScalaY), larghezza-1, Math.round((-yMin)*fattoreScalaY));
        g.drawLine(Math.round((-xMin) * fattoreScalaX), 0, Math.round((-xMin)*fattoreScalaX), altezza - 1);
       
        // estremi degli assi
        g.drawString(""+xMin, 5, Math.round((-yMin)*fattoreScalaY) - 5);
        g.drawString(""+xMax, larghezza + 5, Math.round((-yMin)*fattoreScalaY) - 5);
        g.drawString(""+yMax, Math.round((-xMin) * fattoreScalaX) + 5, 15);
        g.drawString(""+yMin, Math.round((-xMin) * fattoreScalaX) + 5,altezza - 5);
        
        g.setColor(Color.blue);
        setPixel(g,xMin,f(xMin));
        
        for (int ix=1; ix<larghezza; ix++)
        {
            float x = xMin+((float)ix)/fattoreScalaX;
            setPixel(g,x,f(x));
        }
    }
    
    static float f(float x)
    {
        return (float)((3 * (x * x)) - 2)/((2 * (x * x)) + 1);
    }
    
    void setPixel(Graphics g, float x, float y)
    {
        if (x<xMin || x>xMax || y<yMin || y>yMax)
        return;
        int ix = Math.round((x-xMin)*fattoreScalaX);
        int iy = altezza-Math.round((y-yMin)*fattoreScalaY);
        g.drawLine(ix,iy,ix,iy);
    }
}