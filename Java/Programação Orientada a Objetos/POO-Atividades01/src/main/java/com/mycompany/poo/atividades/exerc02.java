
package com.mycompany.poo.atividades;

import javax.swing.JOptionPane;

public class exerc02 {
    
    public static void funExerc02() {
        int[] arrayNum = {0, 0, 0};
        int box;
        
        try {
            for (int i = 0; i < 3; i++) {
                String inputNum = JOptionPane.showInputDialog("Do maior para o menor!\n\nDigite o " + (i + 1) + "º valor: ");
                arrayNum[i] = Integer.parseInt(inputNum);

                if (arrayNum[i] < arrayNum[0]) {
                    box = arrayNum[0];
                    arrayNum[0] = arrayNum[i];
                    arrayNum[i] = box;
                } 
                if (arrayNum[i] < arrayNum[1]) {
                    box = arrayNum[1];
                    arrayNum[1] = arrayNum[i];
                    arrayNum[i] = box;
                }
            }

            JOptionPane.showMessageDialog(null, "OrdemCrescente: " + arrayNum[0] + ", " + arrayNum[1] + ", " + arrayNum[2]);
        }
        
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: Digite apenas números inteiros!");
            funExerc02();
        }
    }
}
