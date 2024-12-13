/* Faça o código fonte dos programas A, B da página 26 do livro Estudo dirigido de 
Algoritmos. a) Os dados de entrada e saída deverão ser armazenados em um struct com 
várias colunas; b) Deverá conter menu com switch case, funções para leitura dos dados 
de entrada e as respectivas funções para calcular os dados de saída; c) Tanto os dados 
de entrada quando os dados de saída deverão ser armazenados dentro de structs. */

#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

/* Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C
e D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro
valor, e o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma
(variável S) do segundo com o quarto valor. */

int const tam = 1;
struct variaveis {
    int a[tam];
    int b[tam];
    int c[tam];
    int d[tam];
    int p[tam];
    int s[tam];
};

struct variaveis tb;

int entradaVariavel(string letra){
    int num;
    
    cout << "Digite o numero " << letra << ": ";
    cin >> num;

    return num;
}

void mostrarVariaveis(){
    cout << "Numero A: " << tb.a[0] << endl;
    cout << "Numero B: " << tb.b[0] << endl;
    cout << "Numero C: " << tb.c[0] << endl;
    cout << "Numero D: " << tb.d[0] << endl;
}

int multiVariavel(int a, int c){
    int produto;
    produto = a * c;

    return produto;
}

int somarVariavel(int b, int d){
    int soma;
    soma = b + d;

    return soma;
}

void menu() {
    int escolha; 

    system("cls");
    cout << "-- SOMA e PRODUTO --" << endl << endl;
    cout << "1 - Adicionar dados" << endl;
    cout << "2 - Mostrar dados" << endl;
    cout << "3 - Mostrar resultados" << endl;
    cout << "0 - Sair" << endl << endl;

    cout << "Digite uma opcao: ";
    cin >> escolha;

    switch(escolha){
        case 1:
            system("cls");

            cout << "-- ENTRADA VARIAVEL --" << endl << endl;
            tb.a[0] = entradaVariavel("A");
            tb.b[0] = entradaVariavel("B");
            tb.c[0] = entradaVariavel("C");
            tb.d[0] = entradaVariavel("D");

            cout << endl << "Dados registrados com sucesso!!" << endl << endl;
            system("pause");

            menu();
            break;

        case 2:
            system("cls");

            cout << "-- MOSTRAR DADOS --" << endl << endl;
            mostrarVariaveis();

            cout << endl;
            system("pause");

            menu();
            break;

        case 3:
            system("cls");

                tb.p[0] = multiVariavel(tb.a[0], tb.c[0]);
                tb.s[0] = somarVariavel(tb.b[0], tb.d[0]);

            cout << "-- MOSTRAR RESULTADOS --" << endl << endl;

            cout << "Produto -> " << tb.a[0] << " x " << tb.c[0] << " = " << tb.p[0]  << endl;
            cout << "Soma -> " << tb.b[0] << " + " << tb.d[0] << " = " << tb.s[0] << endl << endl;
            system("pause");

            system("cls");

            menu();
            break;

        case 0:
            system("cls");

            cout << "PROGRAMA FINALIZADO!" << endl << endl;
            system("pause");
            break;

        default:
            menu();
    }
}

int main() {

    system("cls");
    setlocale(LC_ALL, "portuguese");

    menu();

    return 0;
}