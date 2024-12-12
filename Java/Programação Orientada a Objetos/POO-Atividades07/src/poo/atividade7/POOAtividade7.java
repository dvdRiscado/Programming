/*
Criar uma classe para curso Superior contendo os seguintes atributos privativos à 
classe: N1, N2, N3. Deverá conter também o método público CalculaMedia().

Herdar da classe Superior os atributos e método gerando a subclasse Tecnico.

Na classe Superior:
N1 = Nota da P1;
N2 = Nota da P2;
N3 = Nota de trabalhos.
Média = (N1*0,35 + N2*0,5 + N3*0,15)

Na classe Tecnico:
N1 = Nota do 1º Trimestre;
N2 = Nota do 2º Trimestre;
N3 = Nota do 3º Trimestre;.
Média = (N1 + N2*2 + N3*2)/5;

Criar uma classe principal, instanciar um objeto a partir da classe Superior e outro 
objeto a partir da classe Tecnico.

Solicitar as notas e exibir as médias
*/

package poo.atividade7;

import javax.swing.JOptionPane;

public class POOAtividade7 {
    
    public static void main(String[] args) {
        
        boolean boot = true;
        
        float nota1, nota2, nota3;
        
        while (boot) {
        
            try {
                String input = JOptionPane.showInputDialog("Atividades de POO da Lista 5!\nDia 01 de outubro de 2024\n\n1 - Média do Ensino Superior\n2 - Média do Ensino Técnico\n0 - Sair\n\nDigite o número da atividade: ");
                int escolha = Integer.parseInt(input);
                
                switch (escolha) {
                    case 1:
                        while (boot) {
                            try {
                                input = JOptionPane.showInputDialog("Média do Ensino Superior\n\nDigite a nota da P1: ");
                                nota1 = Float.parseFloat(input);

                                if (nota1 > 10.0 || nota1 < 0.0) {
                                    throw new Exception("nota_invalida");
                                }

                                input = JOptionPane.showInputDialog("Média do Ensino Superior\n\nDigite a nota da P2: ");
                                nota2 = Float.parseFloat(input);

                                if (nota2 > 10.0 || nota2 < 0.0) {
                                    throw new Exception("nota_invalida");
                                }

                                input = JOptionPane.showInputDialog("Média do Ensino Superior\n\nDigite a nota de trabalho: ");
                                nota3 = Float.parseFloat(input);

                                if (nota3 > 10.0 || nota3 < 0.0) {
                                    throw new Exception("nota_invalida");
                                }

                                Superior exercicio = new Superior();

                                exercicio.setNotas(nota1, nota2, nota3);

                                JOptionPane.showMessageDialog(null, "A média das notas no ensino superior é: " + exercicio.calculaMedia());
                                
                                boot = false;
                            }

                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite uma nota de 0 a 10!");
                            }

                            catch (Exception nota_invalida) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite uma nota de 0 a 10!");
                            }
                        }
                        
                        boot = true;
                        break;
                        
                    case 2:
                        while (boot) {
                            try {
                                input = JOptionPane.showInputDialog("Média do Ensino Técnico\n\nDigite a nota do 1º Trimestre: ");
                                nota1 = Float.parseFloat(input);

                                if (nota1 > 10.0 || nota1 < 0.0) {
                                    throw new Exception("nota_invalida");
                                }

                                input = JOptionPane.showInputDialog("Média do Ensino Técnico\n\nDigite a nota do 2º Trimestre: ");
                                nota2 = Float.parseFloat(input);

                                if (nota2 > 10.0 || nota2 < 0.0) {
                                    throw new Exception("nota_invalida");
                                }

                                input = JOptionPane.showInputDialog("Média do Ensino Técnico\n\nDigite a nota do 3º Trimestre: ");
                                nota3 = Float.parseFloat(input);

                                if (nota3 > 10.0 || nota3 < 0.0) {
                                    throw new Exception("nota_invalida");
                                }

                                Tecnico exercicio = new Tecnico();

                                exercicio.setNotas(nota1, nota2, nota3);

                                JOptionPane.showMessageDialog(null, "A média das notas no ensino superior é: " + exercicio.calculaMedia());
                                
                                boot = false;
                            }

                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite uma nota de 0 a 10!");
                            }

                            catch (Exception nota_invalida) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite uma nota de 0 a 10!");
                            }
                        }
                        
                        boot = true;
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
    }
}
