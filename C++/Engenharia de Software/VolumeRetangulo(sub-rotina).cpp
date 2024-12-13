#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

/*
Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
VOLUME = COMPRIMENTO * LARGURA * ALTURA.
*/

float insComprimento();
float insLargura();
float insAltura();

void calcVolume(float comprimento, float largura, float altura);

int main() {
    
    system("cls");
    setlocale(LC_ALL, "portuguese");

    float comprimento = insComprimento();
    float largura = insLargura();
    float altura = insAltura();

    calcVolume(comprimento, largura, altura);
}

float insComprimento(){
    float comprimento;

    cout << "-- CALCULAR VOLUME DO RETANGULO --" << endl;
    cout << "Digite o comprimento(metros): ";
    cin >> comprimento;

    system("cls");
    return comprimento;
}

float insLargura(){
    float largura;

    cout << "-- CALCULAR VOLUME DO RETANGULO --" << endl;
    cout << "Digite a largura(metros): ";
    cin >> largura;

    system("cls");
    return largura;
}

float insAltura(){
    float altura;
    
    cout << "-- CALCULAR VOLUME DO RETANGULO --" << endl;
    cout << "Digite a altura(metros): ";
    cin >> altura;

    system("cls");
    return altura;
}

void calcVolume(float comprimento, float largura, float altura){
    float volume = comprimento * largura * altura;

    cout << "-- CALCULAR VOLUME DO RETANGULO --" << endl;
    cout << "Comprimento: " << comprimento << " m" << endl;
    cout << "Largura: " << largura << " m" << endl;
    cout << "Altura: " << altura << " m" << endl;
    cout << "Volume: " << volume << " m^3" << endl << endl;

    return;
}