
package com.mycompany.poo.atividades;

import javax.swing.JOptionPane;

public class exerc05 {

    public static void funExerc05() {
        
        try {
            String nome = JOptionPane.showInputDialog("Mensalidade do Plano de Saúde!\n\nDigite o nome do cliente: ");
            
            String inputFloat = JOptionPane.showInputDialog("Digite a idade do cliente: ");
            double valor = Float.parseFloat(inputFloat);
            
            if(valor <= 10) {
                JOptionPane.showMessageDialog(null, "O cliente " + nome + " terá um plano de saúde de R$30.00");
            } else if(valor <= 29) {
                JOptionPane.showMessageDialog(null, "O cliente " + nome + " terá um plano de saúde de R$60.00");
            } else if(valor <= 45) {
                JOptionPane.showMessageDialog(null, "O cliente " + nome + " terá um plano de saúde de R$120.00");
            } else if(valor <= 59) {
                JOptionPane.showMessageDialog(null, "O cliente " + nome + " terá um plano de saúde de R$150.00");
            } else if(valor <= 65) {
                JOptionPane.showMessageDialog(null, "O cliente " + nome + " terá um plano de saúde de R$250.00");
            } else {
                JOptionPane.showMessageDialog(null, "O cliente " + nome + " terá um plano de saúde de R$400.00");
            }
            
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: Digite apenas números inteiros!");
            funExerc05();
        }
    }
}
