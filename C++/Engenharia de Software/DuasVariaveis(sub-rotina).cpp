#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

/*
Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
segundo.
*/

int insValor(string letra);

void calcDiferenca(int numA, int numB);

int main() {

    system("cls");
    setlocale(LC_ALL, "portuguese");

    int numA = insValor("A");
    int numB =  insValor("B");

    calcDiferenca(numA, numB);
}

int insValor(string letra){
    int num;

    cout << "-- O QUADRADO DA DIFERENCA --" << endl;
    cout << "Digite o valor do numero " << letra << ": ";
    cin >> num;

    system("cls");
    return num;
}

void calcDiferenca(int numA, int numB){
    int diferenca = (numA - numB) * (numA - numB);

    cout << "-- O QUADRADO DA DIFERENCA --" << endl;
    cout << "Numero A: " << numA << endl;
    cout << "Numero B: " << numB << endl;
    cout << "Resultado: " << diferenca << endl << endl;

    return;
}