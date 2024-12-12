
package poo.atividade7;

import javax.swing.JOptionPane;

public class Superior {
    
    private float n1;
    private float n2;
    private float n3;
    
    // Método Recebe Notas
    public void setNotas(float nota1, float nota2, float nota3) {
        
        n1 = nota1;
        n2 = nota2;
        n3 = nota3;
    }
    
    // Método Calcula a Média
    public double calculaMedia() {
        
        double media = (n1 * 0.35) + (n2 * 0.5) + (n3 * 0.15);
        return media;
    }
    
    public float getNota1() {
        
        return n1;
    }
    
    public float getNota2() {
        
        return n2;
    }
    
    public float getNota3() {
        
        return n3;
    }
        
    // Método Constructor
    Superior() {
        
        n1 = 0;
        n2 = 0;
        n3 = 0;
    }
}
