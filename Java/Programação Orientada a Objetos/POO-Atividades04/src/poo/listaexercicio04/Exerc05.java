/*
Criar um programa que mostre qual o maior valor entre dois números, utilizando um 
método do tipo void (que não retorna valores).
*/

package poo.listaexercicio04;

import javax.swing.JOptionPane;

public class Exerc05 {

    public void funExerc05(float n1, float n2) {
        
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O maior valor é: " + n1);
        } else if (n2 > n1) {
            JOptionPane.showMessageDialog(null, "O maior valor é: " + n2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais: " + n2);
        }
    }
}
