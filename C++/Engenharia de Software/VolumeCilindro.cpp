#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    double volume, raio, altura;
    
    system("cls");
    
    setlocale(LC_ALL, "portuguese");

    cout << "-- VOLUME DA LATA DE OLEO --" << endl;
    cout << "Digite o raio da lata(cm): ";
    cin >> raio;

    cout << "Digite a altura da lata(cm): ";
    cin >> altura;

    volume = 3.1415 * (raio * raio) * altura;

    cout << endl;
    cout << "Volume da lata: " << volume << " cm^3" << endl;
    cout << endl;

    system("pause");
}