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

/* Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do
percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS). */

int const tam = 1;

struct variaveis {
    float sm[tam];
    float pr[tam];
    float ns[tam];
};

struct variaveis tb;

float entradaSalMensal();
float entradaPercAjuste();

float gerarNovoSalario(float sal, float perc);

void mostrarSalarios(float sal, float perc, float newSal);

void menu();

int main(){
    system("cls");
    setlocale(LC_ALL, "portuguese");

    menu();

    return 0;    
}

void menu(){
    system("cls");

    char escolha;

    cout << "-- REAJUSTE SALARIAL --" << endl << endl;
    cout << "1 - Inserir salario e percentual" << endl;
    cout << "2 - Mostrar novo salario" << endl;
    cout << "0 - Sair" << endl << endl;

    cout << "Digite uma opcao: ";
    cin >> escolha;

    switch(escolha){
        case '1':
            system("cls");
            cout << "-- INSERIR SALARIO E PERCENTUAL --" << endl << endl;
            tb.sm[0] = entradaSalMensal();
            tb.pr[0] = entradaPercAjuste();

            tb.ns[0] = gerarNovoSalario(tb.sm[0], tb.pr[0]);

            cout << endl << "Dados salvos com sucesso!" << endl;
            system("pause");

            menu();
            break;

        case '2':
            system("cls");
            cout << "-- MOSTRAR NOVO SALARIO  --" << endl << endl;
            mostrarSalarios(tb.sm[0], tb.pr[0], tb.ns[0]);

            cout << endl << endl;
            system("pause");

            menu();
            break;
        
        case '0':
            system("cls");
            cout << "Programa finalizado!" << endl;
            system("pause");
            break;
        
        default:
            menu();
            break;
    }

    return;
}

float entradaSalMensal(){
    float sal;
    cout << "Digite o valor do salario mensal (R$): ";
    cin >> sal;

    return sal;
}

float entradaPercAjuste(){
    float perc;
    cout << "Digite o percentual de ajuste (%): ";
    cin >> perc;

    return perc;
}

float gerarNovoSalario(float sal, float perc){
    float newSal;
    newSal = sal + (sal * (perc * 0.01));

    return newSal;
}

void mostrarSalarios(float sal, float perc, float newSal){
    cout << "Salario Mensal (R$): " << sal << endl;
    cout << "Percentual de Ajuste (%): " << perc << endl;
    cout << "Novo Salario (R$): " << newSal;
}