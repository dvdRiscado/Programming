/*
Criar um programa que verifique se um número é primo ou não, através de um método. 
Número primo é divisível somente por 1 e por ele mesmo
*/
package poo.listaexercicio04;

public class Exerc08 {
    
    public boolean funExerc08(int num) {
        boolean primo = true;
        
        if (num == 0 || num == 1) {
            
            primo = false;
        
        } else if (num != 2 || num != 3) {
            
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                }
            }
        }
        
        return primo;
    }
}
