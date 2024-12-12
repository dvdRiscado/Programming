/*
Criar um frame contendo uma caixa de texto onde o usuário digita um valor
numérico qualquer referente à venda. Calcular o ICMS, que corresponde a 18%
do valor da venda e o IPI, correspondente a 5%. Em outra caixa exibir o Valor
Total, que é a soma de todos os valores, isto é, Valor da Venda + ICMS + IPI.
*/

package poo.atividade9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class exerc03 {
    
    private JFrame janela;
    private JPanel painelCabecalho, painelPrincipal;
    private Label label1, label2, label3, label4, labelTitulo;
    private TextField input1, input2, input3, input4;
    private JButton btnCalcular, btnLimpar;
    
    public static void main(String[] args) {
        new exerc03().montaTela();
    }
    
    private void montaTela(){
        preparaJanela();
        preparaPainelCabecalho();
        preparaPainelPrincipal();
        preparaLabelTextField();
        preparaBotoes();
        mostraJanela();
    };
    
    private void preparaJanela() {
        janela = new JFrame("Exercicio 03");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void mostraJanela() {
        janela.pack();
        
        janela.setSize(250, 200);
        janela.setVisible(true);
    }
    
    private void preparaPainelCabecalho() {
        painelCabecalho = new JPanel();
        
        painelCabecalho.setLayout(new BoxLayout(painelCabecalho, BoxLayout.PAGE_AXIS));
        janela.add(painelCabecalho, BorderLayout.NORTH);
    }
    
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        
        painelPrincipal.setLayout(new GridLayout(5, 2));
        janela.add(painelPrincipal, BorderLayout.CENTER);
    }
    
    private void preparaLabelTextField() {
        labelTitulo = new Label("Valor Total da Venda!", Label.CENTER);
        painelCabecalho.add(labelTitulo);
        
        label1 = new Label("Valor a venda: ", Label.LEFT);
        painelPrincipal.add(label1);
        
        input1 = new TextField("");
        painelPrincipal.add(input1);
        
        label2 = new Label("ICMS: ", Label.LEFT);
        painelPrincipal.add(label2);
        
        input2 = new TextField("");
        painelPrincipal.add(input2);
        
        label3 = new Label("IPI: ", Label.LEFT);
        painelPrincipal.add(label3);
        
        input3 = new TextField("");
        painelPrincipal.add(input3);
        
        label4 = new Label("Valor Total: ", Label.LEFT);
        painelPrincipal.add(label4);
        
        input4 = new TextField("");
        painelPrincipal.add(input4);
    }
    
    private void preparaBotoes() {
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Float.parseFloat(input1.getText()) <= 0) {
                        throw new Exception("valor_invalido");
                    }
                    
                    double res = Float.parseFloat(input1.getText()) * 0.18;
                    input2.setText(Double.toString(res));
                    
                    res = Float.parseFloat(input1.getText()) * 0.05;
                    input3.setText(Double.toString(res));
                    
                    res = Float.parseFloat(input1.getText()) + Float.parseFloat(input2.getText()) + Float.parseFloat(input3.getText());
                    input4.setText(Double.toString(res));
                }
                catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor válido!");
                    
                } catch (Exception valor_invalido) {
                    JOptionPane.showMessageDialog(null, "ERRO: Digite um valor acima de 0!");
                }
            }
        });
        painelPrincipal.add(btnCalcular);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               input1.setText("");
               input2.setText("");
               input3.setText("");
               input4.setText("");
           }
        });
        painelPrincipal.add(btnLimpar);
        
    }
}
