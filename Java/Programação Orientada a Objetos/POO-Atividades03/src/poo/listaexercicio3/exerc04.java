/*
Um programa que calcule a média de uma aluno nos moldes da Fatec Zona SUL.
*/

package poo.listaexercicio3;

import javax.swing.JOptionPane;

public class exerc04 {
    
    public static void funExerc04() throws Exception {
        
        try {
            String input = JOptionPane.showInputDialog("Média da Fatec Zona Sul!\n\nDigite a nota da p1:");
            float p1 = Float.parseFloat(input);
            
            if (p1 < 0 || p1 > 10) {
                throw new Exception("valor_invalido");
            }

            input = JOptionPane.showInputDialog("Média da Fatez Zona Sul!\n\nDigite a nota da p2:");
            float p2 = Float.parseFloat(input);
            
            if (p2 < 0 || p2 > 10) {
                throw new Exception("valor_invalido");
            }

            input = JOptionPane.showInputDialog("Média da Fatec Zona Sul!\n\nDigite a nota dos trabalhos:");
            float t = Float.parseFloat(input);
            
            if (t < 0  || t > 10) {
                throw new Exception("valor_invalido");
            }

            double res = (p1 * 0.35) + (p2 * 0.50) + (t * 0.15);

            JOptionPane.showMessageDialog(null, "A média do aluno da Fatec: " + res);
        }
        
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: digite apenas números entre 0 e 10!");
            funExerc04();
        }
    
        catch(Exception valor_invalido) {
            JOptionPane.showMessageDialog(null, "Erro: digite apenas números entre 0 e 10!");
            funExerc04();
        }
        
    }
}
