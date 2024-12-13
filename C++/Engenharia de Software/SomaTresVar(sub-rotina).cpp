#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

/*
Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
soma dos quadrados dos três valores lidos.
*/

int insValor(string letra);

void calcSoma(int valorA, int valorB, int valorC);

int main(){

    system("cls");
    setlocale(LC_ALL, "portuguese");

    int valorA = insValor("A");
    int valorB = insValor("B");
    int valorC = insValor("C");

    calcSoma(valorA, valorB, valorC);
}

int insValor(string letra){
    int valor;

    cout << "-- SOMA DA POTENCIA --" << endl;
    cout << "Digite o valor do numero " << letra << ": ";
    cin >> valor;

    system("cls");
    return valor;
}

void calcSoma(int valorA, int valorB, int valorC){
    int valorTotal = (valorA * valorA) + (valorB * valorB) + (valorC * valorC);

    cout << "-- SOMA DA POTENCIA --" << endl;
    cout << "Numero A: " << valorA << endl;
    cout << "Numero B: " << valorB << endl;
    cout << "Numero C: " << valorC << endl;
    cout << "Valor Total: " << valorTotal << endl << endl;

    return;
}