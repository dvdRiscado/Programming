
package poo.listaexercicio3;

import javax.swing.JOptionPane;
import static poo.listaexercicio3.exerc01.funExerc01;
import static poo.listaexercicio3.exerc02.funExerc02;
import static poo.listaexercicio3.exerc03.funExerc03;
import static poo.listaexercicio3.exerc04.funExerc04;
import static poo.listaexercicio3.exerc05.funExerc05;

public class POOListaExercicio3 {

    public static void main(String[] args) throws Exception {
        
        boolean boot = true;
        
        while (boot) {
            
            try {
                String input = JOptionPane.showInputDialog("Atividades de POO da Lista 3!\nDia 04 de setembro de 2024\n\n1 - Atividade 1\n2 - Atividade 2\n3 - Atividade 3\n4 - Atividade 4\n5 - Atividade 5\n0 - Sair\n\nDigite o número da atividade: ");
                int num = Integer.parseInt(input);

                switch (num) {
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
                        JOptionPane.showMessageDialog(null, "ERRO: Digite o valor de uma das alternativas!");
                        break;
                }
            }
            
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERRO: Digite o valor de uma das alternativas!");
            }
        }
        
        System.exit(0);
    }
}
