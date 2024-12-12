/*
Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A, B 
e C. Na classe definir um método para leitura dos valores, um método construtor e um método 
para calcular as raízes da equação.

R1 = (-b+ (raiz de delta)) / (2*a)
R2 = (-b-(raiz de delta)) / (2*a)

Considerar que:
- Se delta = 0, as raízes são iguais;
- Se delta <0, não existem raízes reais;
- Se delta >0, existem 2 raízes diferentes

No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar 
e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.
*/

package poo.atividade5;

import javax.swing.JOptionPane;

public class Equacao {

    float A, B, C;
    
    // Função: Calcular as Raízes da Equação
    public void calcRaizes() {
        float delta = (B * B) + (- 4 * A * C);
        
        if (delta == 0) {
            double R1 = ((-B)+ Math.sqrt(delta)) / (2 * A);
            
            double R2 = ((-B)- Math.sqrt(delta)) / (2 * A);
            
            JOptionPane.showMessageDialog(null, "As raízes são iguais!\n\nRaíz 1 = " + R1 + "\nRaíz 2 = " + R2);
            
        } else if (delta > 0 ) {
            double R1 = ((-B)+ Math.sqrt(delta)) / (2 * A);
            double R2 = ((-B) - Math.sqrt(delta))/ (2 * A);
            
            JOptionPane.showMessageDialog(null, "As raízes são diferentes!\n\nRaíz 1 = " + R1 + "\nRaíz 2 = " + R2);
        } else {
            JOptionPane.showMessageDialog(null, "Não há raízes!");
        }
    }
    
    // Função: Leitura de A, B e C
    public void SetDados(float varA, float varB, float varC) {
        A = varA;
        B = varB;
        C = varC;
    }
    
    // Constructor: Equação
    Equacao() {
        A = 0;
        B = 0;
        C = 0;
    }
}
