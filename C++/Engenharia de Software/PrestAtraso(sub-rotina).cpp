#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

/*
Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
PRESTACAO = VALOR + (VALOR * TAXA/100) * TEMPO).
*/

float inserirValor();
float inserirTaxa();
float inserirTempo();

int main() {

    system("cls");
    setlocale(LC_ALL, "portuguese");

    void calculoPrest(float valor, float taxa, float tempo);

    float valor = inserirValor();
    float taxa = inserirTaxa();
    float tempo = inserirTempo();

    calculoPrest(valor, taxa, tempo);
}

float inserirValor(){
    float valor;

    cout << "-- PRESTACAO EM ATRASO --" << endl;
    cout << "Digite o valor da prestacao(R$): ";
    cin >> valor;

    system("cls");
    return valor;
}

float inserirTaxa(){
    float taxa;

    cout << "-- PRESTACAO EM ATRASO --" << endl;
    cout << "Digite o valor da taxa(%): ";
    cin >> taxa;

    system("cls");
    return taxa;
}

float inserirTempo(){
    float tempo;

    cout << "-- PRESTACAO EM ATRASO --" << endl;
    cout << "Digite o valor do tempo(hr): ";
    cin >> tempo;

    system("cls");
    return tempo;
}

void calculoPrest(float valor, float taxa, float tempo){
    float prestacao = valor + (valor * taxa/100) * tempo;

    cout << "-- PRESTACAO EM ATRASO --" << endl;
    cout << "Valor(R$): " << valor << endl;
    cout << "Taxa(%): " << taxa << endl;
    cout << "Tempo(hr): " << tempo << endl;
    cout << "Valor total da prestacao: R$ " << prestacao << endl << endl;

    return;
}