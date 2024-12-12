/*
Criar um programa que leia um número que será o limite superior de um intervalo e 
o incremento. Exibir todos os números naturais no intervalo de 0 até esse número. 
Suponha que os dois números lidos são maiores que zero. Exemplo:
Limite superior: 20
Incremento: 5
Saída: 0 5 10 15 20
 */

package poo.listaexercicio3;

import javax.swing.JOptionPane;

public class exerc05 {

    public static void funExerc05() throws Exception {
        
        String resp = "";
        
        try {
            String input = JOptionPane.showInputDialog("Lista de Números com incremento!\n\nDigite o limite de números: ");
            int limiteSup = Integer.parseInt(input);
            
            if (limiteSup <= 0) {
                throw new Exception("valor_invalido");
            }
            
            input = JOptionPane.showInputDialog("Lista de Números com incremento!\n\nDigite o valor de incremento: ");
            int incremento = Integer.parseInt(input);
            
            if (incremento <= 0) {
                throw new Exception("valor_invalido");
            }
            
            for (int i = 0; i <= limiteSup; i += incremento) {
                resp += " " + i;
            }
            
            JOptionPane.showMessageDialog(null, "Lista de números:\n" + resp);
        }
        
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: digite apenas números inteiros acima de 0! ");
            funExerc05();
        }
        
        catch (Exception valor_invalido) {
            JOptionPane.showMessageDialog(null, "ERRO: digite apenas números inteiros acima de 0! ");
            funExerc05();
        }
        
    }
}
