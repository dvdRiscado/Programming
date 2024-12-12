/*
A fim de representar empregados em uma firma, crie uma classe chamada
Empregado que inclui as três informações a seguir como atributos:
• um primeiro nome,
• um sobrenome, e
• um salário mensal.
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um
 método set e get para cada atributo.
Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie
duas instâncias da classe e exiba o salário anual de cada instância.
Então dê a cada empregado um aumento de 10% e exiba novamente o salário
 anual de cada empregado.
*/

package com.mycompany.poo.atividade8;

public class Empregado {
    
    private String nomeEmpre;
    private String sobrenomeEmpre;
    private double salarioEmpre;
    
    public void setNomeEmpre(String nome) {
        this.nomeEmpre = nome;
    }
    
    public String getNomeEmpre() {
    
        return this.nomeEmpre;
    }
    
    public void setSobrenomeEmpre(String sobrenome) {
        this.sobrenomeEmpre = sobrenome;
    }
    
    public String getSobrenomeEmpre() {
    
        return this.sobrenomeEmpre;
    }
    
    public void setSalarioEmpre(double salario) {
        this.salarioEmpre = salario;
    }
    
    public double getSalarioEmpre() {
    
        return this.salarioEmpre;
    }
    
    Empregado() {
        this.nomeEmpre = "";
        this.sobrenomeEmpre = "";
        this.salarioEmpre = 0;
    }
}
