#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

bool boot = true;

float const pi = 3.14;

float insComprimento();

void calcArea(float comprimento);
void acessMenu();

int main() {

    system("cls");
    setlocale(LC_ALL, "portuguese");

    cout << "-- CALCULAR AREA DO CIRCULO --" << endl;
    acessMenu();

}

float insComprimento(){
    float compr;

    cout << "-- CALCULAR AREA DO CIRCULO --" << endl << endl;
    cout << "Digite o comprimento do circulo(m): ";
    cin >> compr;

    return compr;
}

void calcArea(float comprimento){
    float diametro = comprimento / pi;
    float area = pi * ((diametro / 2) * (diametro / 2));

    cout << "-- CALCULAR AREA DO CIRCULO --" << endl << endl;
    cout << "Comprimento: " << comprimento << " m" << endl;
    cout << "Diametro: " << diametro << " m" << endl;
    cout << "Raio: " << diametro / 2 << " m" << endl;
    cout << "Area: " << area << " m^2" << endl;

    acessMenu();

    return;
}

void acessMenu(){
    int tecla;

    cout << endl << "1 - Iniciar novo calculo." << endl;
    cout << "0 - Sair." << endl << endl;

    cout << "Digite uma opcao: ";
    cin >> tecla;

    switch (tecla){
        case 1: {
            system("cls");

            float comprimento = insComprimento();
            calcArea(comprimento);
            break;
        }
        
        case 0: {
            system("cls");
            cout << "SISTEMA FINALIZADO!" << endl << endl;

            break;
        }
            
        default: {
            system("cls");

            cout << "-- CALCULAR AREA DO CIRCULO --" << endl << endl;
            acessMenu();

            break;
        }         
    }
    return;
}