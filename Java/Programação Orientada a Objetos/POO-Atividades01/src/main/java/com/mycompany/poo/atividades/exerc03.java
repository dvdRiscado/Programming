
package com.mycompany.poo.atividades;

import javax.swing.JOptionPane;

public class exerc03 {
    
    public static void funExerc03() {
        
        try {
            double vVenda = 0;
            
            String inputFloat = JOptionPane.showInputDialog("Lucro na Venda!\n\nDigite o valor da compra: ");
            
            float vCompra = Float.parseFloat(inputFloat);
            
            if (vCompra >= 20.00) {
                vVenda = vCompra + (vCompra * 0.30);
            } else {
                vVenda = vCompra + (vCompra * 0.45);
            }
            
            JOptionPane.showMessageDialog(null, "Valor da compra: R$" + vCompra + "\n\nValor da Venda: R$" + vVenda);
        }
        
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: Digite apenas números inteiros!");
            funExerc03();
        }
    }
}
