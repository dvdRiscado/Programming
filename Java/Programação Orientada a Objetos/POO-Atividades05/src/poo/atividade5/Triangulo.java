/*
Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um 
triângulo. Na classe definir um método para leitura da base e altura, um método construtor e 
um método para Calcular a área do triângulo (Area=Base * Altura)/2.

No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar 
e atribuir os valores da base e altura e invocar o método que calcula a área a partir do objeto 
criado.
*/

package poo.atividade5;

public class Triangulo {
    
    float base;
    float altura;
    
    // Função: Calcular Área do Triângulo
    public float calcArea() {
        
        return (base * altura)/2;
    }
    
    // Função: Leitura da Base e Altura
    public void setDados(float varBase, float varAltura) {
        base = varBase;
        altura = varAltura;
    }
    
    // Constructor: Triângulo
    Triangulo() {
        base = 0;
        altura = 0;
    }
}
