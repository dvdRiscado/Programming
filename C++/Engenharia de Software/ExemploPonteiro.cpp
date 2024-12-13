#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main(){
    system("clear");
    setlocale(LC_ALL, "portuguese");

    /*
    int numero = 10; // Variável inteira
    int *ponteiro;   // Declaração do ponteiro

    ponteiro = &numero; // Atribuição do endereço da variável "numero" ao ponteiro

    // Acessando o conteúdo da variável usando o ponteiro
    cout << "Conteúdo da variável numero: " << *ponteiro << endl;
    */

    int num1 = 10;
    int num2 = 5;

    int *pNum1; 
    pNum1 = &num1;

    int *pNum2;
    pNum2 = &num2;

    cout << "Soma dos ponteiros: " << *pNum1 + *pNum2;

    return 0;
}