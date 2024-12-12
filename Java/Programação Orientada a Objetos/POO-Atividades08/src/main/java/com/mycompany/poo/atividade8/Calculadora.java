/*
Escreva uma classe em Java que simule uma calculadora bem simples. Essa
classe deve ter como atributos duas variáveis double e um char. Deve possuir um
construtor que recebe como parâmetro dois números e um caracter
correspondente a uma das operações básicas (+, -, *, /). Deve ter um método para
calcular a operação desejada e um para imprimir o resultado. O programa deve
considerar divisões por zero como sendo erros, e imprimir uma mensagem
adequada
*/

package com.mycompany.poo.atividade8;

import javax.swing.JOptionPane;

public class Calculadora {
    
    private double num1;
    private double num2;
    private char operador;
    
    public double calcOperacao() {
        double resultado = 0;
        
        switch (this.operador) {
            
            case('+'):
                resultado = num1 + num2;
                break;
                
            case('-'):
                resultado =  num1 - num2;
                break;
                
            case('*'):
                resultado = num1 * num2;
                break;
            
            case('/'):
                resultado = num1 / num2;
                break;
        }
        
        return resultado;
    }
    
    public void getResultado() {
        double calculo = calcOperacao();
        
        JOptionPane.showMessageDialog(null, "O resultado da operação " + this.num1 + this.operador + this.num2 + " é igual a :" + calculo);
    }
    
    Calculadora(double n1, double n2, char op) {
        this.num1 = n1;
        this.num2 = n2;
        this.operador = op;
    }
}
