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
public class POOAula02 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Decector de Múltiplos de 3!\n");
        String inputNum = JOptionPane.showInputDialog("Digite um número: ");
        int num = Integer.parseInt(inputNum);
        
        if (num % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O número é múltiplo de 3!");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é múltiplo de 3!");
        }
    }
}