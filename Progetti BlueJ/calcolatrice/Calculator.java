import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math.*; 

class Calculator implements ActionListener
{
    JTextField display1, display2;
    String OutputDisplay2 = "";
    String opPrec = "";
    String opPrec2 = "";
    String opPrec3 = "";
    boolean ultimoClick = false;
    boolean first = true;
    boolean firstABS1 = true;
    boolean firstABS2 = true;
    boolean firstRadice1 = true;
    boolean firstRadice2 = true;
    double res = 0;
    double valore = 0;
    double resIniziale = 0;
    double radice = 0;
    int fattoriale = 1;
    int ContaOp = 0;
    
    public Calculator(JTextField t1, JTextField t2)
    {
        display1 = t1;
        display2 = t2;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        display1.requestFocus();
        
        String operazione = e.getActionCommand();
        
        if(firstABS2 == false && opPrec == "|x|")
        {
            opPrec3 = "|x|";
        }
        
        if(firstRadice1 == false)
        {
            radice = Math.pow(valore, 1/res);
            
            OutputDisplay2 = radice + " √ ";
            firstRadice2 = false;
        }
        
        
        if (operazione.equals("+") || operazione.equals("-") || operazione.equals("*") || operazione.equals("/") || operazione.equals("^") || operazione.equals("√") || operazione.equals("x!") || operazione.equals("%") || operazione.equals("|x|") || operazione.equals("cos") || operazione.equals("sin") || operazione.equals("ln") || operazione.equals("log") || operazione.equals("1/x") || operazione.equals("y√x") || operazione.equals("3√"))
        {
            if(opPrec != "")
            {
                opPrec2 = operazione;
                fattoriale = 1;
            }
            
            else
            {
                opPrec = operazione;
                opPrec2 = operazione;
                fattoriale = 0;
            }
            
            if(opPrec == "+")
            {
                OutputDisplay2 = res + valore + " " + operazione + " ";
            }
            
            else if(opPrec == "-")
            {
                OutputDisplay2 = res - valore + " " + operazione + " ";
            }
            
            else if(opPrec == "*")
            {
                if(first == true)
                {
                    OutputDisplay2 = res + " " + operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = res * valore + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "/")
            {
                if(first == true)
                {
                    OutputDisplay2 = res + " " + operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = res / valore + " " + operazione + " ";
                }
            }

            else if(opPrec == "^")
            {
                if(opPrec2 == ("^"))
                {
                    OutputDisplay2 =  res + " " + operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = Math.pow(res,valore) + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "√")
            {
                if(opPrec2 == ("√"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = Math.sqrt(valore) + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "3√")
            {
                if(opPrec2 == ("3√"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = Math.cbrt(valore) + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "|x|")
            {
                if(firstABS1 == true)
                {
                    OutputDisplay2 = opPrec + " ";
                    firstABS1 = false;
                }
                
                else
                {
                    if(valore == 0)
                    {
                        OutputDisplay2 = opPrec + opPrec2 + " ";
                    }
                    
                    else
                    {
                        OutputDisplay2 = valore + " " + operazione + " ";
                    }
                    
                    firstABS2 = false;
                }
            }
            
            else if(opPrec == "%")
            {
                if(opPrec2 == ("%"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = valore/100 + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "x!")
            {
                for (int i = 2; i <= valore; i++)
                {
                    fattoriale = fattoriale * i;
                }
                
                if(opPrec2 == ("x!"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 =  fattoriale + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "sin")
            {
                if(opPrec2 == ("sin"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = Math.sin(valore) + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "cos")
            {
                if(opPrec2 == ("cos"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = Math.cos(valore) + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "log")
            {
                if(opPrec2 == ("log"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = Math.log10(valore) + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "ln")
            {
                if(opPrec2 == ("ln"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = Math.log(valore) + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "1/x")
            {
                if(opPrec2 == ("1/x"))
                {
                    OutputDisplay2 =  operazione + " ";
                }
                
                else
                {
                    OutputDisplay2 = 1/valore + " " + operazione + " ";
                }
            }
            
            else if(opPrec == "y√x")
            {
                if(firstRadice1 == true)
                {
                    OutputDisplay2 = res + " " + "√" + " ";
                    firstRadice1 = false;
                }
            }
            
            display2.setText(OutputDisplay2);
            display1.setText("");
            
            ContaOp++;
            ultimoClick = true;
        }
        
        
        
        

        else if (operazione.equals("1"))
        {
            display1.setText(display1.getText() + "1");
        }
        
        else if (operazione.equals("2"))
        {
            display1.setText(display1.getText() + "2");
        }
        
        else if (operazione.equals("3"))
        {
            display1.setText(display1.getText() + "3");
        }
        
        else if (operazione.equals("4"))
        {
            display1.setText(display1.getText() + "4");
        }
        
        else if (operazione.equals("5"))
        {
            display1.setText(display1.getText() + "5");
        }
        
        else if (operazione.equals("6"))
        {
            display1.setText(display1.getText() + "6");
        }
        
        else if (operazione.equals("7"))
        {
            display1.setText(display1.getText() + "7");
        }
        
        else if (operazione.equals("8"))
        {
            display1.setText(display1.getText() + "8");
        }
        
        else if (operazione.equals("9"))
        {
            display1.setText(display1.getText() + "9");
        }
        
        else if (operazione.equals("0"))
        {
            display1.setText(display1.getText() + "0");
        }
        
        else if (operazione.equals("e"))
        {
            display1.setText(display1.getText() + "2.71828");
        }
        
        else if (operazione.equals("π"))
        {
            display1.setText(display1.getText() + "3.14159");
        }
        
        else if (operazione.equals("π^e"))
        {
            display1.setText(display1.getText() + "23.14069");
        }
        
        else if (operazione.equals(","))
        {
            display1.setText(display1.getText() + ".");
            
            ultimoClick = false;
            
            if(opPrec != "")
            {
                first = false;
            }
        }
        
        else if (operazione.equals("C"))
        {
            display1.setText("");
            display2.setText("");
            OutputDisplay2 = "";
            opPrec = "";
            opPrec2 = "";
            opPrec3 = "";
            res = valore = 0;
            ContaOp = 0;
            resIniziale = 0;
            radice = 0;
            ultimoClick = false;
            first = true;
            firstABS1 = true;
            firstABS2 = true;
            firstRadice1 = true;
            firstRadice2 = true;
            fattoriale = 1;
        }
        
        else if(operazione.equals("="))
        {
           ultimoClick = true;
        }
        
        
        
        if (operazione.equals("1") || operazione.equals("2") || operazione.equals("3") || operazione.equals("4") || operazione.equals("5") || operazione.equals("6") || operazione.equals("7") || operazione.equals("8") || operazione.equals("9") || operazione.equals("0") || operazione.equals("e") || operazione.equals("π") || operazione.equals("π^e"))
        {
            if(opPrec == "")
            {
                res = Double.parseDouble(display1.getText());
            }
            
            else
            {
                valore = Double.parseDouble(display1.getText());
                first = false;
            }
            
            ultimoClick = false;
        }
        
        

        
        
        if(ContaOp > 0 && ultimoClick == true)
        {
            if (opPrec.equals("+") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res += valore;
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("-") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res -= valore;
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("*") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                if(first == true)
                {
                    res *= 1;
                }
                
                else
                {
                    res *= valore;
                }
                
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
                
            else if (opPrec.equals("/") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                if(first == true)
                {
                    res /= 1;
                }
                
                else
                {
                    res /= valore;
                }
                
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("^") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                resIniziale = res;
                
                for(int i = 0; i < valore - 1; i++)
                {
                    res *= resIniziale;
                }

                valore = 0;
                resIniziale = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("√") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = Math.sqrt(valore);
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("3√") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = Math.cbrt(valore);
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec3.equals("|x|"))
            {
                res = Math.abs(valore);
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
                opPrec3 = "";
                firstABS1 = true;
                firstABS2 = true;
            }
            
            else if (opPrec.equals("%") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = valore/100;
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("x!") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                fattoriale = 1;
                
                for (int i = 2; i <= valore; i++)
                {
                    fattoriale = fattoriale * i;
                }
                
                res = fattoriale;
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("sin") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = Math.sin(valore);
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("cos") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = Math.cos(valore);
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("log") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = Math.log10(valore);
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("ln") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = Math.log(valore);
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("1/x") && opPrec3.equals("") && firstABS1 == true && firstABS2 == true)
            {
                res = 1/valore;
                valore = 0;
                ultimoClick = false;
                opPrec = opPrec2;
            }
            
            else if (opPrec.equals("y√x") && opPrec3.equals("") && firstRadice1 == false && firstRadice2 == false)
            {
                res = radice;
                valore = 0;
                radice = 0;
                ultimoClick = false;
                firstRadice1 = true;
                firstRadice2 = true;
                opPrec = opPrec2;
            }
        }
        
        if(operazione.equals("="))
        {
           display2.setText(OutputDisplay2 + display1.getText() + " = " + res);
           display1.setText("");
           OutputDisplay2 = "";
           res = valore = 0;
           radice = 0;
           opPrec = "";
           opPrec2 = "";
           opPrec3 = "";
           ultimoClick = false;
           first = true;
           firstABS1 = true;
           firstABS2 = true;
           firstRadice1 = true;
           firstRadice2 = true;
           resIniziale = 0;
           fattoriale = 1;
           ContaOp = 0;
        }
    }
}