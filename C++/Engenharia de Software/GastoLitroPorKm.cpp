#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    double velocidade, litro, distancia, tempo;
    
    system("cls");
    setlocale(LC_ALL, "portuguese");

    cout << "-- GASTO DE LITRO POR QUILOMETRO --" << endl;
    cout << "Digite o tempo gasto na viagem(hr): ";
    cin >> tempo;
    cout << "Digite a velocidade media percorrida(km/h): ";
    cin >> velocidade;

    distancia = tempo * velocidade;
    litro = distancia / 12;

    cout << endl;
    cout << "Velocidade Media(Km/h): " << velocidade << endl;
    cout << "Tempo(hr): " << tempo << endl;
    cout << "Distancia(Km): " << distancia << endl;
    cout << "Litros: " << litro << endl;
    cout << endl;

    system("pause");
}