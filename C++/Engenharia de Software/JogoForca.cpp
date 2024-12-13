#include <iostream>
#include <math.h>
#include <cstdlib>
#include <ctime>
#include <String>
#include <time.h>
 
using namespace std;

void menu();
void game();
void final(string palavra, int vida);
 
int main() {
    srand(time(0));
    system("cls");
    setlocale(LC_ALL, "portuguese");

    menu();

    return 0;
}

void menu(){
    int escolha;

    cout << "-- JOGO DA VELHA --" << endl << endl;
    cout << "0 - Jogar" << endl;
    cout << "1 - Sair" << endl << endl;
    cout << "Digite uma opcao: " << endl;
    cin >> escolha;

    switch(escolha){
        case 0:
            system("cls");
            game();

            break;

        case 1:
            system("cls");
            cout << "-- PROGRAMA FINALIZADO! --" << endl << endl;
            system("pause");

            break;

        default:
            menu();
    }

    return;
}

void game(){
    srand(time(0));

    int vida = 9;

    string arrayPalavra[] = {"caixa", "bolacha", "helicoptero", "rainha", "abacate", "chocolate"}; // Array Palavras
    int qtdPalavra = sizeof(arrayPalavra) / sizeof(string); // Var Quantidade Palavras
    // cout << "Quantidade de palavras: " << qtdPalavra << endl; // Retorno tela

    string palavra = arrayPalavra[rand() % qtdPalavra]; // Var Palavra escolhida
    // cout << "Palavra escolhida: " << palavra << endl; // Retorno tela 

    int qtdLetras = palavra.length(); // Var Quantidade Letras na Palavra
    // cout << "Quantidade de letras: " << qtdLetras << endl; // Retorno tela

    string arrayTentativa[qtdLetras]; // Array Tentativa
    string tentativa = ""; // Var Tentativa

    for (int i = 0; i < qtdLetras; i++){
        arrayTentativa[i] = "_";
        tentativa += "_";
        // cout << arrayTentativa[i] << " "; // Retorno Tela
    }
    // cout << endl << tentativa << endl; // Retorno Tela

    while (tentativa != palavra && vida > 0){
        cout << "-- JOGO DA FORCA --" << endl;
        cout << "Vida: " << vida << endl << endl;
        for (int i = 0; i < qtdLetras; i++){
            cout << arrayTentativa[i] << " ";
        }
        string letra = "";
        cout << endl << endl << "Digite uma letra: ";
        cin >> letra;

        while (letra.length() != 1){
            system("cls");

            cout << "-- JOGO DA FORCA --" << endl;
            cout << "Vida: " << vida << endl << endl;
            for (int i = 0; i < qtdLetras; i++){
                cout << arrayTentativa[i] << " ";
            }
            cout << endl << endl << "ERRO - quantidade de letra invalida!";
            cout << endl << "Digite uma letra: ";
            cin >> letra;
        }

        tentativa = "";
        bool acerto = false;
        for (int i = 0; i < qtdLetras; i++){
            if (towlower(letra[0]) == palavra[i]){ 
                
                arrayTentativa[i] = towlower(letra[0]);
                acerto = true;
            }
            tentativa += arrayTentativa[i];
        }

        if (acerto == false){
            vida -= 1;
        }

        system("cls");
    }

    final(palavra, vida);
    system("cls");

    return;
}

void final(string palavra, int vida){
    int escolha;

    if (vida > 0){
        cout << "-- PARABENS! --" << endl << endl;
        cout << "A Palavra era: " << palavra << endl;
        cout << "Vidas restantes: " << vida << endl << endl;

    } else {
        cout << "-- GAME-OVER --" << endl << endl;
        cout << "A Palavra era: " << palavra << endl;
        cout << "Vidas restantes: " << vida << endl << endl;
    }

    cout << "0 - Jogar novamente" << endl;
    cout << "1 - Sair" << endl << endl;
    cout << "Digite uma opcao: ";
    cin >> escolha;

    switch(escolha){
        case 0:
            system("cls");
            game();

            break;

        case 1:
            system("cls");
            cout << "-- PROGRAMA FINALIZADO! --" << endl << endl;
            system("pause");

            break;

        default:
            final(palavra, vida);
    }

    return;
}

/*
TALVEZ..
- Sistema de Chute (ERRO: -2 vidas)
*/