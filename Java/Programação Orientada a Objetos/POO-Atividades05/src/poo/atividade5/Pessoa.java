/*
Criar uma classe Pessoa com as seguintes características: 
• atributos: idade e dia, mês e ano de nascimento, nome da pessoa 

• métodos:
o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e 
armazena no atributo idade a idade atual da pessoa; 
o informaIdade(), que retorna o valor da idade 
o informaNome(), que retorna o nome da pessoa 
o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como 
parâmetros e preenche nos atributos correspondentes do objeto. 

• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 
14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643) 

• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam 
as idades de Einstein e Newton caso estivessem vivos
*/

package poo.atividade5;

import javax.swing.JOptionPane;

public class Pessoa {
    int idade;
    
    int dia;
    int mes;
    int ano;
    
    String nome;
    
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        if (ano > anoAtual) {
            idade = -1;
            
        } else if (ano == anoAtual) {
            if (mes < mesAtual) {
                idade = -1;
                
            } else if (mes == mesAtual) {
                if (dia < diaAtual) {
                idade = -1;
                
                }
            }
        } else if (mes == mesAtual) {
            if (dia >= diaAtual) {
                    idade = anoAtual - ano;
            } else {
                    idade = (anoAtual - ano) -1;
            }
        } else if (mes > mesAtual) {
                idade = anoAtual - ano;
        } else {
                idade = (anoAtual - ano) - 1;
        }
    }
    
    public int informaIdade() {
        
        return idade;
    }
    
    public String informaNome() {
    
        return nome;
    }
    
    public void ajustaDataDeNascimento(int ajusDia, int ajusMes, int ajusAno) {
        dia = ajusDia;
        mes = ajusMes;
        ano = ajusAno;
    }
    
    Pessoa(String vNome) {
        nome = vNome;
    }
}

