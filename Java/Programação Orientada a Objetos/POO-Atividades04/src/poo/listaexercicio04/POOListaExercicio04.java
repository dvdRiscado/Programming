/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.listaexercicio04;

import javax.swing.JOptionPane;

/**
 *
 * @author lab04aluno
 */
public class POOListaExercicio04 {

        public static void main(String[] args) {
        
        boolean boot = true;
        
        while (boot) {
            String input = JOptionPane.showInputDialog("Atividades de POO da Lista 4!\nDia 16 de setembro de 2024\n\n1 - Atividade 1\n2 - Atividade 2\n3 - Atividade 3\n4 - Atividade 4\n5 - Atividade 5\n6 - Atividade 6\n7  - Atividade 7\n8 - Atividade 8\n0 - Sair\n\nDigite o número da atividade: ");
            
            switch (input) {
                case "1":
                    while (boot) {
                        try {
                            input = JOptionPane.showInputDialog("Dobro do Valor!\n\nDigite um número inteiro: ");
                            int num = Integer.parseInt(input);   

                            Exerc01 exercicio = new Exerc01();

                            JOptionPane.showMessageDialog(null, "O dobro do número " + num + " é " + exercicio.funExerc01(num) + "!");

                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um número inteiro!");
                        }
                    }
                    
                    boot = true;
                    break;
                    
                case "2":
                    while (boot) {
                        try {
                            float notas[] = new float[4];

                            for (int i = 0; i < 4; i++) {
                                input = JOptionPane.showInputDialog("Média AritMética!\n\nDigite a " + (i + 1) + "ª nota: ");
                                notas[i] = Float.parseFloat(input);

                                if (notas[i] > 10 || notas[i] < 0) {
                                    throw new Exception ("valor_invalido");
                                }
                            }

                            Exerc02 exercicio = new Exerc02();

                            JOptionPane.showMessageDialog(null, "A média aritmética é " + exercicio.funExerc02(notas[0], notas[1], notas[2], notas[3]));
                            
                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite uma nota de 0 a 10!");
                        }

                        catch (Exception valor_invalido) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite uma nota de 0 a 10!");
                        }
                    }
                    
                    boot = true;
                    break;
                    
                case "3":
                    while (boot) {
                        try {
                            input = JOptionPane.showInputDialog("Produto de Dois Valores!\n\nDigite o primeiro valor: ");
                            float num1 = Float.parseFloat(input);

                            input = JOptionPane.showInputDialog("Produto de Dois Valores!\n\nDigite o segundo valor: ");
                            float num2 = Float.parseFloat(input);

                            Exerc03 exercicio = new Exerc03();

                            JOptionPane.showMessageDialog(null, "O produto dos dois valores é " + exercicio.funExerc03(num1, num2));
                            
                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                        }
                    }
                    
                    boot = true;
                    break;
                    
                    
                case "4":
                    while (boot) {
                        try {
                            input = JOptionPane.showInputDialog("Converta Graus em Radianos!\n\nDigite o valor do grau: ");
                            float grau = Float.parseFloat(input);

                            Exerc04 exercicio = new Exerc04();

                            JOptionPane.showMessageDialog(null, "O valor da conversão de graus para o radiano é " + exercicio.funExerc04(grau));
                            
                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                        }
                    }
                    
                    boot = true;
                    break;
                    
                case "5":
                    while (boot) {
                        try {
                            input = JOptionPane.showInputDialog("Maior valor!\n\nDigite o primeiro número: ");
                            float n1 = Float.parseFloat(input);

                            input = JOptionPane.showInputDialog("Maior valor!\n\nDigite o primeiro número: ");
                            float n2 = Float.parseFloat(input);

                            Exerc05 exercicio = new Exerc05();

                            exercicio.funExerc05(n1, n2);
                            
                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                        }
                        
                    }
                    
                    boot = true;
                    break;
                    
                case "6":
                    while (boot) {
                        try {
                            input = JOptionPane.showInputDialog("Mês Correspondente do Primeiro Trimestre!\n\nDigite um número: ");
                            int num = Integer.parseInt(input);

                            Exerc06 exercicio = new Exerc06();

                            exercicio.funExerc06(num);
                            
                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um número inteiro!");
                        }
                    }
                    
                    boot = true;
                    break;
                    
                case "7":
                    while (boot) {
                        try {
                            input = JOptionPane.showInputDialog("Fatorial!\n\nDigite um número inteiro: ");
                            int num = Integer.parseInt(input);

                            Exerc07 exercicio = new Exerc07();

                            JOptionPane.showMessageDialog(null, "O valor fatorial do número " + num + " é: " + exercicio.funExerc07(num));
                            
                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um número inteiro!");
                        }
                    }
                    
                    boot = true;
                    break;
                    
                case "8":
                    while (boot) {
                        try {
                            input = JOptionPane.showInputDialog("Detector de Número Primo!\n\nDigite um número natural: ");
                            int num = Integer.parseInt(input);

                            if (num < 0) {
                                throw new Exception("valor_invalido");
                            }

                            Exerc08 exercicio = new Exerc08();

                            if (exercicio.funExerc08(num) == false) {
                                JOptionPane.showMessageDialog(null, "O número " + num + " não é primo!");
                            } else {
                                JOptionPane.showMessageDialog(null, "O número " + num + " é primo!");
                            }
                            
                            boot = false;
                        }

                        catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um número natural!");
                        }

                        catch (Exception valor_invalido) {
                            JOptionPane.showMessageDialog(null, "ERRO: Digite um número natural!");
                        }
                    }
                    
                    boot = true;
                    break;
                    
                case "0":
                    boot = false;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "ERRO: Digite o valor de uma das alternativas!");
                    break;
            }
        }
    }
}
