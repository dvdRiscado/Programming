#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

/*
Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
disponível com o usuário, para que seja apresentado o valor em moeda brasileira.
*/

float insValorDolar();
float insCotacaoDolar();

void convReal(float cotacaoDolar, float valorDolar);

int main() {

    system("cls");
    setlocale(LC_ALL, "portuguese");

    float valorDolar = insValorDolar();
    float cotacaoDolar = insCotacaoDolar();

    convReal(cotacaoDolar, valorDolar);
}

float insCotacaoDolar(){
    float cotacaoDolar;

    cout << "-- CONVERTER DOLAR PRO REAL --" << endl;
    cout << "Digite a cotacao atual do dolar pro real: ";
    cin >> cotacaoDolar;

    system("cls");
    return cotacaoDolar;
}

float insValorDolar(){
    float valorDolar;

    cout << "-- CONVERTER DOLAR PRO REAL --" << endl;
    cout << "Digite o valor em dolar: ";
    cin >> valorDolar;

    system("cls");
    return valorDolar;
}

void convReal(float cotacaoDolar, float valorDolar){
    float valorReal = cotacaoDolar * valorDolar;

    cout << "-- CONVERTER DOLAR PRO REAL --" << endl;
    cout << "Cotacao de dolar pro real: R$ " << cotacaoDolar << endl;
    cout << "Valor em dolar: $ " << valorDolar << endl;
    cout << "Conversão em real: R$ " << valorReal << endl << endl;

    return;
}