/*
 Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série: 
1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8
*/

package poo.listaexercicio3;

import javax.swing.JOptionPane;

public class exerc02 {

    public static void funExerc02() throws Exception {
    
        try {
            String input = JOptionPane.showInputDialog("Sequência de Fibonacci!\n\nDigite o limite de números: ");
            int limiteSup = Integer.parseInt(input);
            
            if (limiteSup <= 0) {
                throw new Exception("valor_invalido");
            }
            
            int numA = 1;
            int numB = 1;
            
            String resp = "";
            
            for (int i = 0; i < limiteSup; i++) {
                
                if (i < 2) {
                    resp += " " + 1;
                } else {
                    if (i % 2 == 0) {
                        numA = numA + numB;
                        resp += " " + numA;
                    } else {
                        numB = numA + numB;
                        resp += " " + numB;
                    }
                }
            }
            
            JOptionPane.showMessageDialog(null, "Sequência de Fibonacci até o número " + limiteSup + ": \n" + resp);
            
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: digite apenas números acima de zero!");
            funExerc02();
        }
        
        catch(Exception valor_invalido) {
            JOptionPane.showMessageDialog(null, "ERRO: digite apenas números acima de zero!");
            funExerc02();
        }
    }
}
