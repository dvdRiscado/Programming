#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    double volume, comprimento, largura, altura;
    
    system("cls");
    setlocale(LC_ALL, "portuguese");

    cout << "-- VOLUME DE UMA CAIXA --" << endl;
    cout << "Digite o comprimento(m): ";
    cin >> comprimento;
    cout << "Digite a largura(m): ";
    cin >> largura;
    cout << "Digite a altura(m): ";
    cin >> altura;

    volume = comprimento * largura * altura;

    cout << endl;
    cout << "Volume: " << volume << " m^3" << endl;
    cout << endl;

    system("pause");
}