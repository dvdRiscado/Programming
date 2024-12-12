/*
Um programa capaz de imprimir todos os números primos em um intervalo de 
números informado pelo usuário
*/

package poo.listaexercicio3;

import javax.swing.JOptionPane;

public class exerc03 {

    public static void funExerc03() throws Exception {
    
        String resp = "";
        
        try {
            String inputLimite = JOptionPane.showInputDialog("Números primos em um Intervalo!\n\nDigite o número inicial: ");
            int limiteInf = Integer.parseInt(inputLimite);
            
            inputLimite = JOptionPane.showInputDialog("Número Primos em um Intervalo!\n\nDigite o número final: ");
            int limiteSup = Integer.parseInt(inputLimite);
            
            if (limiteInf >= limiteSup) {
                throw new Exception("limite_invalido");
            }
            
            for (int i = limiteInf; i < limiteSup; i++) {
                
                if (i > 1) {
                    if (i == 2 || i == 3) {
                        resp += " " + i;
                    } else {
                        boolean primo = true;
                        
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                primo = false;
                            }
                        }
                        
                        if (primo) {
                            resp += " " + i;
                        }
                    }
                }
            }
            
            JOptionPane.showMessageDialog(null, "Números primos: " + resp);
        }
        
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: digite apenas números inteiros!");
            funExerc03();
        }
        
        catch(Exception limite_invalido) {
            JOptionPane.showMessageDialog(null, "ERRO: intervalo inválido! Digite um novo intervalo!");
            funExerc03();
        }
    }
}
