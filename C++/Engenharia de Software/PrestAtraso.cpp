#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    double valor, taxa, tempo, prestacao;

    system("cls");
    setlocale(LC_ALL, "portuguese");

    cout << "-- PRESTACAO EM ATRASO --" << endl;
    cout << "Digite o valor da prestacao(R$): ";
    cin >> valor;
    cout << "Digite o valor da taxa(%): ";
    cin >> taxa;
    cout << "Digite o valor do tempo(hr): ";
    cin >> tempo;

    prestacao = valor + (valor * taxa/100) * tempo;

    cout << endl;
    cout << "Valor da prestacao(R$): " << prestacao << endl;
    cout << endl;

    system("pause");
}