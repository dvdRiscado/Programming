
package com.mycompany.poo.atividades;

import javax.swing.JOptionPane;

public class exerc01 {
    
    public static void funExerc01() {
        try {
            String inputNum = JOptionPane.showInputDialog("Decector de Múltiplos de 3!\n\nDigite um número: ");
            int num = Integer.parseInt(inputNum);

            if (num % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O número é múltiplo de 3!");
            } else {
                JOptionPane.showMessageDialog(null, "O número não é múltiplo de 3!");
            }
        }
        
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: Digite apenas números inteiros!");
            funExerc01();
        }
    }
}
