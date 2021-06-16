import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

class CalcPanel extends JPanel
{
    Container finestra;
    JTextField txt1,txt2;
    CalcButton sum, sub, mul, div, calc, canc, num1, num2, num3, num4 , num5 , num6, num7, num8, num9, num0, virgola, potenza, radice, nepero, pgreco, assoluto, percento, fattoriale, sin, cos, log, ln, reciproco, radice2, radcubo, gelfond;
    
    public CalcPanel()
    {
        super();
        txt1 = new JTextField(29);
        txt1.setHorizontalAlignment(JTextField.RIGHT);
        txt1.setEditable(false);
        
        txt2 = new JTextField(29);
        txt2.setHorizontalAlignment(JTextField.RIGHT);
        txt2.setEditable(false);
        
        calc = new CalcButton("=");
        sum = new CalcButton("+");
        sub = new CalcButton("-");
        mul = new CalcButton("*");
        div = new CalcButton("/");
        radice = new CalcButton("√");
        num7 = new CalcButton("7");
        num8 = new CalcButton("8");
        num9 = new CalcButton("9");        
        num4 = new CalcButton("4");
        num5 = new CalcButton("5");
        num6 = new CalcButton("6");        
        num1 = new CalcButton("1");
        num2 = new CalcButton("2");
        num3 = new CalcButton("3");
        virgola = new CalcButton(",");
        num0 = new CalcButton("0");
        canc = new CalcButton("C");
        potenza = new CalcButton("^");
        nepero = new CalcButton("e");
        pgreco = new CalcButton("π");
        assoluto = new CalcButton("|x|");
        percento = new CalcButton("%");
        fattoriale = new CalcButton("x!");
        sin = new CalcButton("sin");
        cos = new CalcButton("cos");
        log = new CalcButton("log");
        ln = new CalcButton("ln");
        reciproco = new CalcButton("1/x");
        radice2 = new CalcButton("y√x");
        radcubo = new CalcButton("3√");
        gelfond = new CalcButton("π^e");
        

        num0.setBackground(Color.green);
        num1.setBackground(Color.green);
        num2.setBackground(Color.green);
        num3.setBackground(Color.green);
        num4.setBackground(Color.green);
        num5.setBackground(Color.green);
        num6.setBackground(Color.green);
        num7.setBackground(Color.green);
        num8.setBackground(Color.green);
        num9.setBackground(Color.green);
        
        sum.setBackground(Color.black);
        sub.setBackground(Color.black);
        mul.setBackground(Color.black);
        div.setBackground(Color.black);
        
        radcubo.setBackground(Color.orange);
        radice.setBackground(Color.orange);
        radice2.setBackground(Color.orange);
        potenza.setBackground(Color.orange);
        
        percento.setBackground(Color.orange);
        fattoriale.setBackground(Color.orange);
        reciproco.setBackground(Color.orange);
        assoluto.setBackground(Color.orange);
        
        sin.setBackground(Color.orange);
        cos.setBackground(Color.orange);
        log.setBackground(Color.orange);
        ln.setBackground(Color.orange);
        
        pgreco.setBackground(Color.yellow);
        nepero.setBackground(Color.yellow);
        gelfond.setBackground(Color.yellow);
        
        canc.setBackground(Color.red);
        
        calc.setBackground(Color.black);
        virgola.setBackground(Color.darkGray);
        
        
        calc.setForeground(Color.white);
        virgola.setForeground(Color.white);
        canc.setForeground(Color.white);
        
        num0.setForeground(Color.gray);
        num1.setForeground(Color.gray);
        num2.setForeground(Color.gray);
        num3.setForeground(Color.gray);
        num4.setForeground(Color.gray);
        num5.setForeground(Color.gray);
        num6.setForeground(Color.gray);
        num7.setForeground(Color.gray);
        num8.setForeground(Color.gray);
        num9.setForeground(Color.gray);
        
        sum.setForeground(Color.white);
        sub.setForeground(Color.white);
        mul.setForeground(Color.white);
        div.setForeground(Color.white);
        
        
        JPanel text = new JPanel();
	GridLayout griglia1 = new GridLayout(2,1);
	text.setLayout(griglia1);

        text.add(txt2);
        text.add(txt1);
        
        add(text);
        
        JPanel tasti = new JPanel();
	GridLayout griglia = new GridLayout(9,1);
	tasti.setLayout(griglia);

	tasti.setBackground(Color.lightGray);
	
        tasti.add(sin);
        tasti.add(cos);
        tasti.add(log);
        tasti.add(ln);
        
        tasti.add(radice);
        tasti.add(radcubo);
        tasti.add(radice2);
        tasti.add(potenza);
        
        tasti.add(fattoriale);
        tasti.add(assoluto);
        tasti.add(reciproco);
        tasti.add(percento);
        
        tasti.add(nepero);
        tasti.add(pgreco);
        tasti.add(gelfond);
        tasti.add(div);

        tasti.add(num7);
        tasti.add(num8);
        tasti.add(num9);
        tasti.add(mul);
        
        tasti.add(num4);
        tasti.add(num5);
        tasti.add(num6);
        tasti.add(sub);
        
        tasti.add(num1);
        tasti.add(num2);
        tasti.add(num3);
        tasti.add(sum);
        
        tasti.add(virgola);
        tasti.add(num0);
        tasti.add(canc);
        tasti.add(calc);
        
        add(tasti);
        
        Calculator calcolatore = new Calculator(txt1, txt2);

        sum.addActionListener(calcolatore);
        sub.addActionListener(calcolatore);
        mul.addActionListener(calcolatore);
        div.addActionListener(calcolatore);
        calc.addActionListener(calcolatore);
        canc.addActionListener(calcolatore);
        num1.addActionListener(calcolatore);
        num2.addActionListener(calcolatore);
        num3.addActionListener(calcolatore);
        num4.addActionListener(calcolatore);
        num5.addActionListener(calcolatore);
        num6.addActionListener(calcolatore);
        num7.addActionListener(calcolatore);
        num8.addActionListener(calcolatore);
        num9.addActionListener(calcolatore);
        virgola.addActionListener(calcolatore);
        num0.addActionListener(calcolatore);
        potenza.addActionListener(calcolatore);
        radice.addActionListener(calcolatore);
        nepero.addActionListener(calcolatore);
        pgreco.addActionListener(calcolatore);
        assoluto.addActionListener(calcolatore);
        percento.addActionListener(calcolatore);
        fattoriale.addActionListener(calcolatore);
        sin.addActionListener(calcolatore);
        cos.addActionListener(calcolatore);
        log.addActionListener(calcolatore);
        ln.addActionListener(calcolatore);
        reciproco.addActionListener(calcolatore);
        radice2.addActionListener(calcolatore);
        radcubo.addActionListener(calcolatore);
        gelfond.addActionListener(calcolatore);
    }
}