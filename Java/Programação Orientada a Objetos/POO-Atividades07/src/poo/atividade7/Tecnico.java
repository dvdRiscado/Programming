
package poo.atividade7;

public class Tecnico extends Superior {
    
    public double calculaMedia() {
    
        double media =  (getNota1() + (getNota2() * 2) + (getNota3() * 2))/5; 
        return media;
    }
}
