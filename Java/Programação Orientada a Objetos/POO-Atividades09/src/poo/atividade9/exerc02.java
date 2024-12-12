/*
Elabore um frame que simule o teclado de um telefone digital, de acordo com a
Figura. A cada tecla pressionada o número é acumulado na caixa de texto. O botão
Limpar apaga todos os números digitados.
 */
package poo.atividade9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exerc02 {
    
    private JFrame janela;
    private JPanel painelCabecalho, painelPrincipal, painelRodape;
    private Label label1;
    private TextField input1;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAs, btn0, btnHa, btnLimpar;
    
    public static void main(String[] args) {
        new exerc02().montaTela();
    }
    
    private void montaTela() {
        preparaJanela();
        preparaPainelCabecalho();
        preparaPainelPrincipal();
        preparaPainelRodape();
        preparaLabel();
        preparaBotoes();
        preparaTextField();
        mostraJanela();
    }
    
    private void preparaJanela() {
        janela = new JFrame("Exercicio 02");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void mostraJanela() {
        janela.pack();
        
        janela.setSize(250, 400);
        janela.setVisible(true);
    }
    
    private void preparaPainelCabecalho() {
        painelCabecalho = new JPanel();
        
        painelCabecalho.setLayout(new BoxLayout(painelCabecalho, BoxLayout.PAGE_AXIS));
        janela.add(painelCabecalho, BorderLayout.NORTH);
    }
    
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        
        painelPrincipal.setLayout(new GridLayout(4,3));
        janela.add(painelPrincipal, BorderLayout.CENTER);
    }
    
    private void preparaPainelRodape() {
        painelRodape = new JPanel();
        
        painelRodape.setLayout(new GridLayout(2,1));
        janela.add(painelRodape, BorderLayout.SOUTH);
    }
    
    private void preparaLabel() {
        label1 = new Label("Telefone Digital!", Label.CENTER);
        
        painelCabecalho.add(label1);
    }
    
    private void preparaTextField() {
        input1 = new TextField("");
        
        painelRodape.add(input1);
    }
    
    private void preparaBotoes() {
        btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "1");
            }
        });
        painelPrincipal.add(btn1);
        
        btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "2");
            }
        });
        painelPrincipal.add(btn2);
        
        btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "3");
            }
        });
        painelPrincipal.add(btn3);
        
        btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "4");
            }
        });
        painelPrincipal.add(btn4);
        
        btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "5");
            }
        });
        painelPrincipal.add(btn5);
        
        btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "6");
            }
        });
        painelPrincipal.add(btn6);
        
        btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "7");
            }
        });
        painelPrincipal.add(btn7);
        
        btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "8");
            }
        });
        painelPrincipal.add(btn8);
        
        btn9 = new JButton("9");
        painelPrincipal.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "9");
            }
        });
        
        btnAs = new JButton("*");
        btnAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "*");
            }
        });
        painelPrincipal.add(btnAs);
        
        btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "0");
            }
        });
        painelPrincipal.add(btn0);
        
        btnHa = new JButton("#");
        btnHa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText(input1.getText() + "#");
            }
        });
        painelPrincipal.add(btnHa);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText("");
            }
        });
        painelRodape.add(btnLimpar);
    }
}
