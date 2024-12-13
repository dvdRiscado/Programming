#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

/*
Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
quadrado da soma dos três valores lidos.
*/

int insNumero(string letra);

void calcSoma(int numA, int numB, int numC);

int main() {

    system("cls");
    setlocale(LC_ALL, "portuguese");

    int numA = insNumero("A");
    int numB = insNumero("B");
    int numC = insNumero("C");

    calcSoma(numA, numB, numC);
}

int insNumero(string letra){
    int num;

    cout << "-- SOMA DAS POTENCIAS --" << endl;
    cout << "Digite o numero " << letra << ": ";
    cin >> num;

    system("cls");
    return num;
}

void calcSoma(int numA, int numB, int numC){
    int valorTotal = numA + numB + numC;
    valorTotal = valorTotal * valorTotal;

    cout << "-- SOMA DAS POTENCIAS --" << endl;
    cout << "Numero A: " << numA << endl;
    cout << "Numero B: " << numB << endl;
    cout << "Numero C: " << numC << endl;
    cout<< "Soma Total: " << valorTotal << endl << endl;
}