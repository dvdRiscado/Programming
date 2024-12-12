/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab04Aluno
 */
public class exerc02 {
    
    
    public static void main(String[] args) {
        int[] arrayNum = {0, 0, 0};
        int box;
        
        JOptionPane.showMessageDialog(null, "Do maior para o menor!\n");
        for (int i = 0; i < 3; i++) {
            String inputNum = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor: ");
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
        
        JOptionPane.showMessageDialog(null, "Num 1: " + arrayNum[0] + "\nNum 2: " + arrayNum[1] + "\nNum 3: " + arrayNum[2]);
    }
    
}
