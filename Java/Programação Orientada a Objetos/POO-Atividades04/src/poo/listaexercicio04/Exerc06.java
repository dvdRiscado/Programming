/*
Criar um programa que receba um número que corresponda a um mês do 1º trimestre e 
escreva o mês correspondente; caso o usuário digite o número fora do intervalo deverá 
aparecer inválido, mas utilizando um método do tipo void
*/
package poo.listaexercicio04;

import javax.swing.JOptionPane;

public class Exerc06 {

    public void funExerc06(int num) {
        
        switch(num) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mês correspondente:\n\nJaneiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Mês correspondente:\n\nFevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Mês correspodente:\n\nMarço");
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERRO: Valor inválido! Digite um número correspondente a algum mês do primeiro trimestre!");
                break;
        }
    }
}
