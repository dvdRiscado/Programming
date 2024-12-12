/*
No exemplo dado em sala de aula, acrescentar botões para subtrair, dividir e 
multiplicar os 2 valores, exibindo o resultado.
*/
package poo.atividade9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exerc01 {
    
    private JFrame janela;
    private JPanel painelPrincipal;
    private Label label1, label2, label3;
    private TextField text1, text2;
    
    public static void main(String[] args) {
        new exerc01().montaTela();
    }
    
    private void montaTela() {
        
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoSoma();
        preparaBotaoSubtracao();
        preparaBotaoMultiplicacao();
        preparaBotaoDivisao();
        preparaBotaoSair();
        mostraJanela();
    }
    
    private void preparaJanela() {
        janela = new JFrame("Exercicio 01");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setLayout(new BorderLayout());
    }
    
    private void mostraJanela() {
        janela.pack();
        
        janela.setSize(600, 300);
        janela.setVisible(true);
    }
    
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));
        janela.add(painelPrincipal);
    }
    
    private void preparaLabel() {
        label1 = new Label("Calculadora 2000");
        
        painelPrincipal.add(label1);
    }
    
    private void preparaText() {
        text1 = new TextField("");
        text2 = new TextField("");
        label2 = new Label ("Resultado = ");
        label3 = new Label(" ");
        
        painelPrincipal.add(text1);
        painelPrincipal.add(text2);
        painelPrincipal.add(label2);
        painelPrincipal.add(label3);
    }
    
    private void preparaBotaoSoma() {
        JButton botaoSoma = new JButton("Soma");
        botaoSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int soma = Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText());
                    String r = Integer.toString(soma);
                    label3.setText(r);
                }
                catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null, "ERRO: digite um valor inteiro!");
                }
            }
        });
        
        painelPrincipal.setLocation(50, 100);
        painelPrincipal.add(botaoSoma);
    }
    
    private void preparaBotaoSubtracao() {
        JButton botaoSubtracao = new JButton("Subtração");
        botaoSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int subtracao = Integer.parseInt(text1.getText()) - Integer.parseInt(text2.getText());
                    String r = Integer.toString(subtracao);
                    label3.setText(r);
                }
                catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor inteiro!");
                }
                
            }
        });
        
        painelPrincipal.setLocation(50, 100);
        painelPrincipal.add(botaoSubtracao);
    }
    
    private void preparaBotaoMultiplicacao() {
        JButton botaoMultiplicacao = new JButton("Multiplicação");
        botaoMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int multiplicacao = Integer.parseInt(text1.getText()) * Integer.parseInt(text2.getText());
                    String r = Integer.toString(multiplicacao);
                    label3.setText(r);
                }
                catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor inteiro!");
                }
            }
        });
        
        painelPrincipal.setLocation(50, 100);
        painelPrincipal.add(botaoMultiplicacao);
    }
    
    private void preparaBotaoDivisao() {
        JButton botaoDivisao = new JButton("Divisão");
        botaoDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Integer.parseInt(text2.getText()) == 0) {
                        JOptionPane.showMessageDialog(null, "ERRO: Não é possível dividir por 0!");
                    } else {
                        float divisao = Float.parseFloat(text1.getText()) / Float.parseFloat(text2.getText());
                        String r = Float.toString(divisao);
                        label3.setText(r);  
                    }
                }
                catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor inteiro!");
                }
            }
        });
        
        painelPrincipal.setLocation(50, 100);
        painelPrincipal.add(botaoDivisao);
    }
    
    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        painelPrincipal.add(botaoSair);
    }
}
