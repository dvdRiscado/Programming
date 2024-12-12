/*
Crie uma classe em Java chamada Data que inclui três informações como
variáveis de instância:
• mês (int),
• dia (int)
• e ano (int).
A classe deve ter métodos get e set para cada variável e um construtor que
inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça
um método displayData que exibe o dia, o mês e o ano separados por barras
normais ( / ).
Escreva um aplicativo de teste chamado DataTeste que demonstra as
capacidades da classe Data.
*/
package com.mycompany.poo.atividade8;

import javax.swing.JOptionPane;

public class Data {
    
    private int mes;
    private int dia;
    private int ano;
    
    public void setMes(int m) {
        this.mes = m;
    }
    
    public int getMes() {
        
        return this.mes;
    }
   
    public void setDia(int d) {
        this.dia = d;
    }
    
    public int getDia() {
    
        return this.dia;
    }
    
    public void setAno(int a) {
        this.ano = a;
    }
    
    public int getAno() {
    
        return this.ano;
    }
    
    public void displayData() {
        
        JOptionPane.showMessageDialog(null, "DataTeste\n\nA data digitada foi: " + dia + "/" + this.mes + "/" + this.ano);
    }
    
    Data() {
        this.mes = 0;
        this.dia = 0;
        this.ano = 0;   
    }
    
}
