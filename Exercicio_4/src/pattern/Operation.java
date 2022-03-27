package pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Cardoso
 */
public class Operation 
{
    //set de variaveis
    private int numenu;
    private double num1, num2;
    
    //metodo construtor
    Operation()
    {
        
    }
    
    //inicio do set e get
    /**
     * @return the numenu
     */
    public int getNumenu() {
        return numenu;
    }

    /**
     * @param numenu the numenu to set
     */
    public void setNumenu(int numenu) {
        this.numenu = numenu;
    }

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    //fim do set e get
    
    //metodo de exibição do menu e operação solicitada 
    public void exibirMenu()
    {
        double resp;
        
        setNumenu(Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das operações abaixo: \n1 – Soma \n2 – Subtração \n3 – Divisão \n4 – Multiplicação \n5 – Resto da Divisão \n6 – Dobro \n7 – Quadrado \n8 – Cubo \n9 – Raiz Quadrada \n0 – Sair")));

        switch(getNumenu())
        {
            //sair do programa
            case 0:
            {
                JOptionPane.showMessageDialog(null, "Saindo do programa...");
                System.exit(0);
            }
            
            //soma
            case 1:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("SOMA \nInsira o primeiro número da soma: ")));
                setNum2(Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número da soma: ")));
                
                resp = getNum1() + getNum2();
                
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resp);
                break;
            }    
            
            //subtração
            case 2:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("SUBTRAÇÃO \nInsira o número que será subtraido: ")));
                setNum2(Double.parseDouble(JOptionPane.showInputDialog("Insira o número que irá subtrair: ")));
                
                resp = getNum1() - getNum2();
                
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + resp);
                break;
            }
            
            //divisão
            case 3:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("DIVISÃO \nInsira o número que será dividido: ")));
                setNum2(Double.parseDouble(JOptionPane.showInputDialog("Insira o número divisor: ")));
                
                resp = getNum1() / getNum2();
                
                JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resp);
                break;
            }
            
            //multiplicação
            case 4:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("MULTIPLICAÇÃO \nInsira o primeiro número da multiplicação: ")));
                setNum2(Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número da multiplicação: ")));
                
                resp = getNum1() * getNum2();
                
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resp);
                break;
            }
            
            //resto da divisão
            case 5:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("RESTO DA DIVISÃO \nInsira o número que será dividido: ")));
                setNum2(Double.parseDouble(JOptionPane.showInputDialog("Insira o número divisor: ")));
                
                resp = getNum1() % getNum2();
                
                JOptionPane.showMessageDialog(null, "O resto da divisão dos números é: " + resp);
                break;
            }
            
            //dobro
            case 6: 
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("DOBRO \nInsira o número que será dobrado: ")));
                
                resp = getNum1() * 2;
                
                JOptionPane.showMessageDialog(null, "O dobro de " + getNum1() + " é: " + resp);
                break;
            }
            
            //ao quadrado
            case 7:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("AO QUADRADO \nInsira o número que será elevado ao quadrado: ")));
                
                resp = Math.pow(getNum1(), 2);
                
                JOptionPane.showMessageDialog(null, getNum1() + " ao quadrado é igual a: " + resp);
                break;
            }
            
            //ao cubo
            case 8:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("AO CUBO \nInsira o número que será elevado ao cubo: ")));
                
                resp = Math.pow(getNum1(), 3);
                
                JOptionPane.showMessageDialog(null, getNum1() + " ao cubo é igual a: " + resp);
                break;
            }
            
            //raiz quadrada
            case 9:
            {
                setNum1(Double.parseDouble(JOptionPane.showInputDialog("RAIZ QUADRADA \nInsira o número que deseja a raiz quadrada: ")));
                
                resp = Math.sqrt(getNum1());
                
                JOptionPane.showMessageDialog(null, "A raiz quadrada de " + getNum1() + " é: " + resp);
                break;
            }
            
            //opção default caso digite um valor inteiro invalido
            default:
            {
                JOptionPane.showMessageDialog(null, "Escolha inválida \nSaindo do programa...");
                System.exit(0);
            }
        }
    }
    
} 
