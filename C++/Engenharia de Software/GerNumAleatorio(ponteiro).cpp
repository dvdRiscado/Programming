#include "iostream"
#include "cstdlib"
#include "stdio.h"
#include "time.h"

using namespace std;

int qtd;
int *vNum;

int soma;
float media;
int maiorNum = 0;
int menorNum = 100;

void menu();

int main() {
    system("cls");

    setlocale(LC_ALL, "portuguese");
    srand(time(NULL));

    menu();

    return 0;
}

void menu(){
    system("cls");
    char escolha;

    cout << "-- GERADOR DE NUMEROS ALEATORIOS --" << endl << endl;
    cout << "1 - Gerar novos numeros" << endl;
    cout << "2 - Mostrar resultados" << endl;
    cout << "3 - Sair" << endl << endl;

    cout << "Escolha uma opcao: ";
    cin >> escolha;

    switch(escolha){
        case '1':
            system("cls");
            cout << "-- GERAR NOVO NUMERO --" << endl << endl;

            qtd = rand() % 50;
            vNum = (int *) calloc(qtd, sizeof(int));

            cout << "Quantidade de numeros: " << qtd << endl;
            cout << "Numeros gerados: ";
            for (int i = 0; i < qtd; i++){
                vNum[i] = rand() % 100;
                for(int k = 0; k < i; k++){
                    while(vNum[i] == vNum[k]){
                        vNum[i] = rand() % 100;
                    }
                }             
                cout << vNum[i] << " ";
            }
            cout << endl << endl;

            system("pause");

            menu();
            break;

        case '2':
            system("cls");
            cout << "-- MOSTRAR RESULTADOS --" << endl << endl;

            for (int i = 0; i < qtd; i++){
                soma += vNum[i];

                if (maiorNum < vNum[i] || maiorNum == 0){
                    maiorNum = vNum[i];
                }
                if (menorNum > vNum[i]){
                    menorNum = vNum[i];
                }
            }

            media = soma/qtd;

            cout << "Soma: " << soma << endl;
            cout << "Media: " << media << endl;
            cout << "Maior Numero: " << maiorNum << endl;
            cout << "Menor Numero: " << menorNum << endl << endl;

            system("pause");

            menu();
            break;

        case '3':
            system("cls");
            cout << "-- PROGRAMA FINALIZADO --" << endl << endl;

            break;

        default:
            system("cls");

            menu();
            break;
    }

    return;
}