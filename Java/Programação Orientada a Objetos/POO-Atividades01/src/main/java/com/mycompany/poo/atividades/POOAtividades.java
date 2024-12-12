
package com.mycompany.poo.atividades;

import static com.mycompany.poo.atividades.exerc01.funExerc01;
import static com.mycompany.poo.atividades.exerc02.funExerc02;
import static com.mycompany.poo.atividades.exerc03.funExerc03;
import static com.mycompany.poo.atividades.exerc04.funExerc04;
import static com.mycompany.poo.atividades.exerc05.funExerc05;

import javax.swing.JOptionPane;

public class POOAtividades {

    public static void main(String[] args) {
        
        boolean boot = true;
        
        while(boot) {
            
            try {
                String inputNum = JOptionPane.showInputDialog("Atividades de POO!\nDia 20 de agosto de 2024\n\n1 - Atividade 1\n2 - Atividade 2\n3 - Atividade 3\n4 - Atividade 4\n5 - Atividade 5\n0 - Sair\n\nDigite o número da atividade: ");
                int num = Integer.parseInt(inputNum);
                
                switch(num) {
                    case 1:
                        funExerc01();
                        break;
                    case 2:
                        funExerc02();
                        break;
                    case 3:
                        funExerc03();
                        break;
                    case 4:
                        funExerc04();
                        break;
                    case 5:
                        funExerc05();
                        break;
                    case 0:
                        boot = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERRO! Digite um valor válido!\n\n1 - Atividade 1\n2 - Atividade 2\n3 - Atividade 3\n4 - Atividade 4\n5 - Atividade 5\n0 - Sair");
                        break;
                }
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERRO: Digite apenas números inteiros!");
            }
        } 
        System.exit(0);
    }
}
