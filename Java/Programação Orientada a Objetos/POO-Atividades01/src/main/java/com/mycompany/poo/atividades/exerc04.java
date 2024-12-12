
package com.mycompany.poo.atividades;

import javax.swing.JOptionPane;

public class exerc04 {
    
    public static void funExerc04() {
        
        try {
            String inputNum = JOptionPane.showInputDialog("Classe Eleitoral!\n\nDigite a idade do cidadão: ");
            int num = Integer.parseInt(inputNum);
            
            if (num < 16) {
                JOptionPane.showMessageDialog(null, "Cidadão Não-Eleitor!");
            } else if ((num >= 16 && num < 18) || num >= 65) {
                JOptionPane.showMessageDialog(null, "Cidadão Eleitor Facultativo!");
            } else {
                JOptionPane.showMessageDialog(null, "Cidadão Eleitor Obrigatório!");
            }
        }
        
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: Digite apenas números inteiros!");
            funExerc04();
        }
    }
}
