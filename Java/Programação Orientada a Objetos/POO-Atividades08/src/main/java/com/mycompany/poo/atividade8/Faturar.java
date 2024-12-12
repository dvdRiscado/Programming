/*
Crie uma classe chamada Faturar que possa ser utilizado por uma loja de
 suprimentos de informática para representar uma fatura de um item vendido na
 loja. Uma fatura deve incluir as seguintes informações como atributos: 
• o número do item faturado,
• a descrição do item,
• a quantidade comprada do item e
• o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos.
Forneça um método set e um método get para cada variável de instância. Além
 disso, forneça um método chamado getFaturarTotal que calcula o valor da fatura
 (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como
um double.
Escreva um aplicativo de teste que demonstra as capacidades da classe Faturar.
*/

package com.mycompany.poo.atividade8;

public class Faturar {
    
    private int numItem;
    private String descItem;
    private int qtdItem;
    private double valorItem;
    
    public void setNumItem(int num) {
        this.numItem = num;
    }
    
    public int getNumItem() {
        
        return this.numItem;
    }
    
    public void setDescItem(String desc) {
        this.descItem = desc;
    }
    
    public String getDescItem() {
    
        return this.descItem;
    }
    
    public void setQtdItem(int qtd) {
        this.qtdItem = qtd;
    }
    
    public int getQtdItem() {
    
        return this.qtdItem;
    }
    
    public void setValorItem(double valor) {
        this.valorItem = valor;
    }
    
    public double getValorItem() {
        
        return this.valorItem;
    }
    
    public double getFaturaTotal() {
        double total = this.valorItem * this.qtdItem;
    
        return total;
    }
    
    
    Faturar() {
        this.numItem = 0;
        this.descItem = "";
        this.qtdItem = 0;
        this.valorItem = 0;
    }
}
