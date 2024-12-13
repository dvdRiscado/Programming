#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int linha = -1;

float divina[5];
int dias[5];

float valorMulta[5];
float valorJuros[5];
float valorPagar[5];

float lerDivina();
int lerDias();

void guardarDados(float div, int dia);
void listar();

int main() {
    float divina_;
    int dias_;
    
    char tecla;

    MENU:
        system("cls");
        cout << " -- MENU --" << endl << endl;
        cout << " 1 - ler" << endl;
        cout << " 2 - exibir" << endl;
        cout << " 3 - sair" << endl << endl;

        cout << "Digite uma opcao: ";
        cin >> tecla;

        switch(tecla) {
            case '1':
                divina_ = lerDivina();
                dias_ = lerDias();
                guardarDados(divina_, dias_);

                break;

            case '2':
                listar();

                break;

            case '3':
                exit(0);

                break;
        }

        goto MENU;

    return 0;
}

float lerDivina() {
    float divina;
    cout << endl << "Valor da divida: ";
    cin >> divina;

    return divina;
}

int lerDias() {
    int dias;
    cout << endl << "Dias em atraso: ";
    cin >> dias;

    return dias;
}

void guardarDados(float div, int dia) {
    linha ++;
    divina[linha] = div;
    dias[linha] = dia;
    int mes = dia/31;
    valorMulta[linha] = div * 0.02;
    valorJuros[linha] = div * 0.01;
    valorPagar[linha] = div + (div * 0.02) + ((div * 0.01) * mes);
}

void listar() {
    cout << endl << "Valor Empréstimo - Dias - Valor Multa - Valor Juros - Valor Pagar" << endl; 
    for (int i = 0; i <= linha; i++) {
        cout << divina[i] << " - " << dias[i] << " - " << valorMulta[i] << " - " << valorJuros[i] << " - " << valorPagar[i] << endl;
    }

    system("pause");
}