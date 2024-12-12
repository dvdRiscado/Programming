/*
Um programa capaz de imprimir todos os números pares em um intervalo de 
números informador pelo usuário;
*/

package poo.listaexercicio3;

import javax.swing.JOptionPane;

public class exerc01 {
    
    public static void funExerc01() throws Exception {
        
        String resp = "";
    
        try {
            String inputLimite = JOptionPane.showInputDialog("Número de pares em um Intervalo!\n\nDigite o número inicial: ");
            int limiteInf = Integer.parseInt(inputLimite);
            
            inputLimite = JOptionPane.showInputDialog("Número de pares em um Intervalo!\n\nDigite o número final: ");
            int limiteSup = Integer.parseInt(inputLimite);
            
            if (limiteInf >= limiteSup) {
                throw new Exception("limite_invalido");
            }
            
            for (int i = limiteInf; i <= limiteSup; i++) {
                
                if (i % 2 == 0) {
                    resp += i + " ";
                }
            }
            
            JOptionPane.showMessageDialog(null, "Números pares: \n" + resp);
        }

        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: digite apenas números inteiros!");
            funExerc01();
        }
        
        catch(Exception limite_invalido) {
            JOptionPane.showMessageDialog(null, "ERRO: intervalo inválido! Digite um novo intervalo!");
            funExerc01();
        }
    }
}
