/*
Escreva um programa que peça como entrada o peso (em kilogramas) e a
altura (em metros) da pessoa e calcule e exiba o seu IMC – Índice de Massa
Corpórea. O IMC é calculado da seguinte forma: divide-se o peso (quilogramas) 
pela altura ao quadrado (em metros).
*/

package com.mycompany.poo.atividade10;

// Importando as bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POOAtividade10 {
    
    private JFrame janela;
    private JPanel painelPrincipal, painelTitulo, painelBotoes;
    private Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
    private TextField txt1, txt2;

    public static void main(String[] args) {
        new POOAtividade10().montaTela();
    }
    
    private void montaTela() {
        addJanela();
        addPainelTitulo();
        addPainelPrincipal();
        addPainelBotoes();
        addLabel();
        addTextFieldLabel();
        addBotaoCalcular();
        addBotaoSair();
        viewJanela();
    }
    
    private void addJanela() {
        janela = new JFrame("Calculadora IMC");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        janela.setLayout(new BorderLayout());
    }
    
    private void viewJanela() {
        janela.pack();
        janela.setSize(600, 200);
        janela.setVisible(true);
    }
    
    private void addPainelTitulo(){
        painelTitulo = new JPanel();
        painelTitulo.setLayout(new BoxLayout(painelTitulo, BoxLayout.PAGE_AXIS));
        
        janela.add(painelTitulo, BorderLayout.NORTH);
    }   
    
    private void addPainelPrincipal() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(3,2));
        
        janela.add(painelPrincipal, BorderLayout.CENTER);
    }
    
    private void addPainelBotoes() {
        painelBotoes = new JPanel(new FlowLayout());
        
        janela.add(painelBotoes, BorderLayout.SOUTH);
    }
    
    private void addLabel() {
        lbl1 = new Label("Calculadora IMC!", Label.CENTER);
        
        painelTitulo.add(lbl1);
    }
    
    private void addTextFieldLabel() {
        lbl2 = new Label("Digite o peso (em quilogramas): ");
        txt1 = new TextField("");
        lbl3 = new Label("Digite a altura (em metros)");
        txt2 = new TextField("");
        lbl4 = new Label("Resultado = ");
        lbl5 = new Label("");
        
        painelPrincipal.add(lbl2);
        painelPrincipal.add(txt1);
        painelPrincipal.add(lbl3);
        painelPrincipal.add(txt2);
        painelPrincipal.add(lbl4);
        painelPrincipal.add(lbl5);
    }
    
    private void addLabelResultado() {
        lbl6 = new Label("");
    }
    
    private void addBotaoCalcular() {
        JButton botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    if (Float.parseFloat(txt1.getText()) <= 0) {
                        throw new Exception ("valor_invalido");
                    } else if (Float.parseFloat(txt2.getText()) <= 0) {
                        throw new Exception ("valor_invalido");
                    }
                    
                    float res = Float.parseFloat(txt1.getText()) / (Float.parseFloat(txt2.getText()) * Float.parseFloat(txt2.getText()));
                
                    String r = Float.toString(res);

                    if (res < 18.5) {
                        lbl5.setText("IMC: " + r + " - Você está abaixo do peso ideal!");
                        JOptionPane.showMessageDialog(null, "IMC: " + r + " - Você está abaixo do peso ideal!");
                    } else if (res <= 24.9) {
                        lbl5.setText("IMC: " + r + " - Parabéns! Você está em seu peso normal!");
                        JOptionPane.showMessageDialog(null, "IMC: " + r + " - Parabéns! Você está em seu peso normal!");
                    } else if (res <= 29.9) {
                        lbl5.setText("IMC: " + r + " - Você está acima de seu peso! (Sobrepeso)");
                        JOptionPane.showMessageDialog(null, "IMC: " + r + " - Você está acima de seu peso! (Sobrepeso)");
                    } else if (res <= 34.9) {
                        lbl5.setText("IMC: " + r + " - Vocè está com Obersidade grau I!");
                        JOptionPane.showMessageDialog(null, "IMC: " + r + " - Você está com Obersidade grau I!");
                    } else if (res <= 39.9) {
                        lbl5.setText("IMC: " + r + " - Vocè está com Obersidade grau II!");
                        JOptionPane.showMessageDialog(null, "IMC: " + r + " - Você está com Obersidade grau II!");
                    } else {
                        lbl5.setText("IMC: " + r + " - Vocè está com Obersidade grau III!");
                        JOptionPane.showMessageDialog(null, "IMC: " + r + " - Você está com Obersidade grau III!");
                    }
                }
                catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor acima de 0!");
                }
            }
        });
        
        painelBotoes.add(botaoCalcular);
    }
    
    private void addBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        painelBotoes.add(botaoSair);
    }
}