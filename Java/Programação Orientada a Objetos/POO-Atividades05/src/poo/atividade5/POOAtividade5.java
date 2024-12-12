package poo.atividade5;

import javax.swing.JOptionPane;

public class POOAtividade5 {

    public static void main(String[] args) {
        
        boolean boot = true;
        
        while (boot) {
        
            try {
                String input = JOptionPane.showInputDialog("Atividades de POO da Lista 5!\nDia 01 de outubro de 2024\n\n1 - Atividade 1\n2 - Atividade 2\n3 - Atividade 3\n0 - Sair\n\nDigite o número da atividade: ");
                int num = Integer.parseInt(input);
                
                switch (num) {
                    case 1:
                        while (boot) {
                            try {
                                input = JOptionPane.showInputDialog("Área de um Triângulo!\n\nDigite a base(cm): ");
                                float varBase = Float.parseFloat(input);

                                if (varBase <= 0) {
                                    throw new Exception("valor_invalido");
                                }

                                input = JOptionPane.showInputDialog("Área de um Triângulo!\n\nDigite a altura(cm): ");
                                float varAltura = Float.parseFloat(input);

                                if (varAltura <= 0) {
                                    throw new Exception("valor_invalido");
                                }

                                Triangulo exercicio = new Triangulo();

                                exercicio.setDados(varBase, varAltura);

                                JOptionPane.showMessageDialog(null, "A área do Triângulo é: " + exercicio.calcArea() + " cm^2");

                                boot = false;
                            }
                            catch(NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                            }

                            catch(Exception valor_invalido) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor acima de 0!");
                            }
                        }
                        
                        boot = true;
                        break;
                        
                    case 2:
                        
                        while (boot) {
                            try {
                                input = JOptionPane.showInputDialog("Equação de Segundo Grau!\n\nDigite o valor A: ");
                                float A = Float.parseFloat(input);

                                input = JOptionPane.showInputDialog("Equação de Segundo Grau!\n\nDigite o valor B: ");
                                float B = Float.parseFloat(input);

                                input = JOptionPane.showInputDialog("Equação de Segundo Grau!\n\nDigite o valor C: ");
                                float C = Float.parseFloat(input);

                                Equacao exercicio = new Equacao();

                                exercicio.SetDados(A, B, C);

                                exercicio.calcRaizes();
                                
                                boot = false;
                            }

                            catch(NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                            }
                        }
                        
                        boot = true;
                        break;
                        
                    case 3:
                        while (boot) {
                            try {
                                input = JOptionPane.showInputDialog("Quantos Anos Ele Tem?\n\nDigite o dia atual: ");
                                int dia = Integer.parseInt(input);

                                if (dia > 31) {
                                    throw new Exception("dia_invalido");
                                } else if (dia <= 0) {
                                    throw new Exception("dia_invalido");
                                }

                                input = JOptionPane.showInputDialog("Quantos Anos Ele Tem?\n\nDigite o mês: ");
                                int mes = Integer.parseInt(input);

                                if (mes > 12) {
                                    throw new Exception("mes_invalido");
                                } else if (mes <= 0) {
                                    throw new Exception("mes_invalido");
                                }

                                // Meses com 31 dias (1, 3, 5, 7, 8, 10, 12)
                                if (mes == 4|| mes == 6 || mes == 9 || mes == 11) {
                                    if (dia > 30) {
                                        throw new Exception("dia_invalido_do_mes");
                                    }
                                } else if (mes == 2) {
                                    if (dia > 29) {
                                        throw new Exception("dia_invalido_do_mes");
                                    }
                                }

                                input = JOptionPane.showInputDialog("Quantos Anos Ele Tem?\n\nDigite o ano: ");
                                int ano = Integer.parseInt(input);

                                if (ano < 0) {
                                    throw new Exception("ano_invalido");
                                }

                                if (mes == 2) {
                                    if (ano % 4 != 0) {
                                        if (dia == 29) {
                                            throw new Exception("dia_invalido_do_ano");
                                        }
                                    }
                                }

                                Pessoa albert = new Pessoa("Albert Einstein");
                                albert.ajustaDataDeNascimento(14, 3, 1879);

                                albert.calculaIdade(dia, mes, ano);

                                if (albert.informaIdade() < 0) {
                                    JOptionPane.showMessageDialog(null, "O " + albert.informaNome() + " ainda não nasceu!");
                                } else {
                                    JOptionPane.showMessageDialog(null, "A idade de " + albert.informaNome() + " seria: " + albert.informaIdade() + " anos.");
                                }

                                Pessoa isaac = new Pessoa("Isaac Newton");
                                isaac.ajustaDataDeNascimento(4, 1, 1643);

                                isaac.calculaIdade(dia, mes, ano);

                                if (isaac.informaIdade() < 0) {
                                    JOptionPane.showMessageDialog(null, "O " + albert.informaNome() + " ainda não nasceu!");
                                } else {
                                    JOptionPane.showMessageDialog(null, "A idade de " + isaac.informaNome() + " seria: " + isaac.informaIdade() + " anos.");
                                }

                                boot = false;
                            }

                            catch(NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                            }

                            catch(Exception e) {
                                String msg = e.getMessage();

                                switch (msg) {
                                    case "dia_invalido":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite um dia existente!");
                                        break;

                                    case "mes_invalido":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite um mês existente!");
                                        break;

                                    case "dia_invalido_do_mes":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite um dia existente no mês!");
                                        break;

                                    case "ano_invalido":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite um ano válido!");
                                        break;

                                    case "dia_invalido_do_ano":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite uma data existente no ano!");
                                        break;
                                }

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