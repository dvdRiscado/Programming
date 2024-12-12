package com.mycompany.poo.atividade8;

import javax.swing.JOptionPane;

public class POOAtividade8 {

    public static void main(String[] args) {
        
        boolean boot = true;

        while (boot) {
            
            try {
                String input = JOptionPane.showInputDialog("Atividades de POO da Lista 8!\nDia 14 de outubro de 2024\n\n1 - Faturar\n2 - Empregado\n3 - Calculadora\n4 - Data\n0 - Sair\n\nDigite o número da atividade: ");
                int escolha = Integer.parseInt(input);
                
                switch (escolha) {
                    case 1:
                        while (boot) {
                            try {
                                Faturar exercicio = new Faturar();

                                input = JOptionPane.showInputDialog("Faturando Total\n\nDigite o número do item: ");
                                int num = Integer.parseInt(input);

                                if (num < 0) {
                                    throw new Exception("valor_invalido");
                                }

                                exercicio.setNumItem(num);

                                input = JOptionPane.showInputDialog("Faturando Total\n\nDigite a descrição do item: ");
                                String desc = input;

                                exercicio.setDescItem(desc);

                                input = JOptionPane.showInputDialog("Faturando Total\n\nDigite a quantidade do item: ");
                                int qtd = Integer.parseInt(input);
                                
                                if (qtd < 0) {
                                    throw new Exception("valor_invalido");
                                }

                                exercicio.setQtdItem(qtd);

                                input = JOptionPane.showInputDialog("Faturando Total\n\nDigite o valor do item: ");
                                double valor = Double.parseDouble(input);
                                
                                if (valor < 0) {
                                    throw new Exception("valor_invalido");
                                }

                                exercicio.setValorItem(valor);
                                
                                JOptionPane.showMessageDialog(null, "Faturando Total\n\nCódigo: " + exercicio.getNumItem() + "\nDescrição: " + exercicio.getDescItem() + "\nQuantidade: " + exercicio.getQtdItem() + "\nValor: R$" + exercicio.getValorItem() + "\n\nFatura Total: R$" + exercicio.getFaturaTotal());
                                
                                boot = false;
                            }

                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                            }

                            catch (Exception valor_invalido) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor acima de 0!");
                            }
                        }
                        
                        boot = true;
                        break;
                        
                    case 2:
                        while (boot) {
                            try {
                                Empregado exercicio01 = new Empregado();
                                
                                input = JOptionPane.showInputDialog("Salário Anual e Aumento\n\n1º Empregado\n\nDigite o nome:");
                                String nome = input;
                                
                                exercicio01.setNomeEmpre(nome);
                                
                                input = JOptionPane.showInputDialog("Salário Anual e Aumento\n\n1º Empregado\n\nDigite o sobrenome:");
                                String sobrenome = input;
                                
                                exercicio01.setSobrenomeEmpre(sobrenome);
                                
                                input = JOptionPane.showInputDialog("Salário Anual e Aumento\n\n1º Empregado\n\nDigite o salário:");
                                double salario = Double.parseDouble(input);
                                
                                if (salario < 0) {
                                    throw new Exception("valor_invalido");
                                }
                                
                                exercicio01.setSalarioEmpre(salario);
                                
                                Empregado exercicio02 = new Empregado();
                                
                                input = JOptionPane.showInputDialog("Salário Anual e Aumento\n\n2º Empregado\n\nDigite o nome:");
                                nome = input;
                                
                                exercicio02.setNomeEmpre(nome);
                                
                                input = JOptionPane.showInputDialog("Salário Anual e Aumento\n\n2º Empregado\n\nDigite o sobrenome:");
                                sobrenome = input;
                                
                                exercicio02.setSobrenomeEmpre(sobrenome);
                                
                                input = JOptionPane.showInputDialog("Salário Anual e Aumento\n\n2º Empregado\n\nDigite o salário:");
                                salario = Double.parseDouble(input);
                                
                                if (salario < 0) {
                                    throw new Exception("valor_invalido");
                                }
                                
                                exercicio02.setSalarioEmpre(salario);
                                
                                JOptionPane.showMessageDialog(null, "Salário Anual e Aumento\n\n1º Empregado\n\nNome: " + exercicio01.getNomeEmpre() + "\nSobrenome: " + exercicio01.getSobrenomeEmpre()  + "\nSalário Atual: R$" + exercicio01.getSalarioEmpre() + "\nSalário Anual: R$" + (exercicio01.getSalarioEmpre() * 12) + "\n\n2º Empregado\n\nNome: " + exercicio02.getNomeEmpre() + "\nSobrenome: " + exercicio02.getSobrenomeEmpre()  + "\nSalário Atual: R$" + exercicio02.getSalarioEmpre() + "\nSalário Anual: R$" + (exercicio02.getSalarioEmpre() * 12) );
                                
                                double novoSalario = (exercicio01.getSalarioEmpre() * 0.10) + exercicio01.getSalarioEmpre();
                                exercicio01.setSalarioEmpre(novoSalario);
                                
                                novoSalario = (exercicio02.getSalarioEmpre() * 0.10) + exercicio02.getSalarioEmpre();
                                exercicio02.setSalarioEmpre(novoSalario);
                                
                                JOptionPane.showMessageDialog(null, "Salário Anual e Aumento\n\n1º Empregado\n\nNome: " + exercicio01.getNomeEmpre() + "\nSobrenome: " + exercicio01.getSobrenomeEmpre()  + "\nNovo Salário Atual: R$" + exercicio01.getSalarioEmpre() + "\nNovo Salário Anual: R$" + exercicio01.getSalarioEmpre() * 12 + "\n\n2º Empregado\n\nNome: " + exercicio02.getNomeEmpre() + "\nSobrenome: " + exercicio02.getSobrenomeEmpre()  + "\nNovo Salário Atual: R$" + exercicio02.getSalarioEmpre() + "\nNovo Salário Anual: R$" + (exercicio02.getSalarioEmpre() * 12));
                                
                                boot = false;
                            }
                            
                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                            }
                            
                            catch (Exception valor_invalido) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor acima de 0!");
                            }
                        }
                        
                        boot = true;
                        break;
                        
                    case 3:
                        while (boot) {
                            try {
                                input = JOptionPane.showInputDialog("Calculadora\n\nDigite o primeiro número: ");
                                double n1 = Double.parseDouble(input);

                                input = JOptionPane.showInputDialog("Calculadora\n\n+ Adição\n- Subtração\n* Multiplicação\n/ Divisão\n\nDigite o símbolo da operação: ");
                                char op = input.charAt(0);
                                
                                if (op != '+' && op != '-' && op != '*' && op != '/') {
                                    throw new Exception ("operacao_invalida");
                                }

                                input = JOptionPane.showInputDialog("Calculadora\n\nDigite o segundo número: ");
                                double n2 = Double.parseDouble(input);
                                
                                if (n2 == 0 && op == '/') {
                                    throw new Exception ("erro_divisao");
                                }

                                Calculadora exercicio = new Calculadora(n1, n2, op);

                                exercicio.getResultado();
                                
                                boot = false;
                            }
                            
                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                            }
                            
                            catch (Exception e) {
                                String msg = e.getMessage();
                                
                                switch (msg) {
                                    case "operacao_invalida":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite um símbolo válido!");
                                        break;
                                        
                                    case "erro_divisao":
                                        JOptionPane.showMessageDialog(null, "ERRO: Não é possível uma divisão com o número 0!");
                                        break;
                                }
                            }
                        }
                        
                        boot = true;
                        break;
                        
                    case 4:
                        Data exercicio = new Data();
                        
                        while (boot) {
                            try {
                                
                                if (exercicio.getDia() == 0) {
                                    input = JOptionPane.showInputDialog("DataTeste\n\nDigite um dia: ");
                                } else {
                                    input = JOptionPane.showInputDialog("DataTeste\n\nÚltimo Dia armazenado: " + exercicio.getDia() + "\nDigite um dia: ");
                                }
                                
                                int d = Integer.parseInt(input);
                                
                                if (d > 31 || d <= 0) {
                                    throw new Exception("dia_invalido");
                                }
                                
                                if (exercicio.getMes() == 0) {
                                    input = JOptionPane.showInputDialog("DataTeste\n\nDigite um número correspondente a um mês: ");
                                } else {
                                    input = JOptionPane.showInputDialog("DataTeste\n\nÚltimo Mês armazenado: " + exercicio.getMes() + "\nDigite um número correspondente a um mês: ");
                                }
                                
                                int m = Integer.parseInt(input);
                                
                                if (m > 12 || m <= 0) {
                                    throw new Exception("mes_invalido");
                                }
                                
                                if (m == 4 || m == 6 || m == 9 || m == 11) {
                                    if (d > 30) {
                                        throw new Exception("data_invalida");
                                    }
                                } else if (m == 2) {
                                    if (d > 29) {
                                        throw new Exception("data_invalida");
                                    }
                                }
                                
                                if (exercicio.getAno() == 0) {
                                    input = JOptionPane.showInputDialog("DataTeste\n\nDigite um ano:");
                                } else {
                                    input = JOptionPane.showInputDialog("DataTeste\n\nÚltimo Ano armazenado: " + exercicio.getAno() + "\nDigite um ano:");
                                }
                                
                                int a = Integer.parseInt(input);
                                
                                if (a <= 0) {
                                    throw new Exception("ano_invalido");
                                }
                                
                                
                                if (a % 100 == 0) {
                                    if (a % 400 != 0) {
                                        throw new Exception("data_invalida");
                                    }
                                } else if (a % 4 != 0) {
                                    if (m == 2 && d > 28) {
                                        throw new Exception("data_invalida");
                                    }
                                }
                                
                                exercicio.setDia(d);
                                exercicio.setMes(m);
                                exercicio.setAno(a);
                                
                                exercicio.displayData();
                                
                                input = JOptionPane.showInputDialog("DataTeste\n\nGostaria de adicionar uma nova data? (S ou N)");
                                
                                if ("N".equals(input)) {
                                    boot = false;
                                } else if (!"S".equals(input)) {
                                    JOptionPane.showMessageDialog(null, "ERRO: Valor Inválido! O programa DataTeste foi finalizado!");
                                    boot = false;
                                }
                            } 
                            
                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                            }
                            
                            catch (Exception e) {
                                String msg = e.getMessage();
                                
                                switch (msg) {
                                    case "dia_invalido":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite um dia existente!");
                                        break;
                                        
                                    case "mes_invalido":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite o valor de um mês existente!");
                                        break;
                                        
                                    case "ano_invalido":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite um ano existente!");
                                        break;
                                    
                                    case "data_invalida":
                                        JOptionPane.showMessageDialog(null, "ERRO: Digite uma data existente!");
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
