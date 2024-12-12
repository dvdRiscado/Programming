/*
Criar um programa que retorne o fatorial de um número, usando um método que receba 
um valor e retorne o fatorial desse valor.
Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120

*/
package poo.listaexercicio04;

public class Exerc07 {
    
    public int funExerc07(int num) {
        int res = 1;
        
        for (int i = num; i > 0; i--) {
            res = res * i;
        }
        
        return res;
    }
}
