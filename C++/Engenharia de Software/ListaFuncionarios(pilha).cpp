#include <iostream>
#include <cstdlib>
#include <stdlib.h>

using namespace std;

typedef struct pilha pFunc;
struct pilha {
    char nome;
    float salario;
    pFunc *ant;
};

pFunc *topo;

void construtor();
bool push(char nome, float salario);
void exibirPilha();
bool vazia();

void menu();

int main(){
    system("cls");
    setlocale(LC_ALL, "portuguese");

    construtor();
    menu();

    return 0;
}

void menu(){
    system("cls");

    bool esc;
    char escolha;

    cout << "-- GERENCIAMENTO DE FUNCIONARIOS --" << endl << endl;
    cout << "1 - Cadastrar Funcionarios" << endl;
    cout << "2 - Mostrar Funcionarios" << endl;
    cout << "0 - Sair" << endl << endl;

    cout << "Digite uma opcao: ";
    cin >> escolha;

    switch(escolha){
        case '1':
            system("cls");

            char nome;
            float salario;

            cout << "-- CADASTRAR NOVOS FUNCIONARIOS --" << endl << endl;
            cout << "Digite o nome: ";
            cin >> nome;
            cout << "Digite o salario: ";
            cin >> salario;

            esc = push(nome, salario);

            if (esc) {
                cout << endl << "Funcionario cadastrado com sucesso!" << endl << endl;
            } else {
                cout << endl << "ERRO: cadastro interrompido! Tente novamente!" << endl << endl;
            }

            system("pause");
            menu();
            break;

        case '2':
            system("cls");

            cout << "-- MOSTRAR USUARIOS --" << endl << endl;

            esc = vazia();
            if (!esc) {
                exibirPilha();
            } else {
                cout << "A lista esta vazia!" << endl << endl;
            }

            system("pause");
            menu();
            break;

        case '0':
            system("cls");

            cout << "Programa finalizado!" << endl << endl;
            break;

        default:
            system("cls");

            menu();
            break;
    }

}

void construtor(){
    topo = NULL;
}

bool push(char nome, float salario){
    pFunc *newFunc = (pFunc*) malloc(sizeof(pFunc));

    if (newFunc == NULL) return false;

    newFunc -> nome = nome;
    newFunc -> salario = salario;
    newFunc -> ant = topo;

    topo = newFunc;

    return true;
}

void exibirPilha(){
    pFunc *temp;
    temp = topo;

    while (temp -> ant != NULL) {
        cout << "Nome: " << temp -> nome <<  " - Salario: " << temp -> salario << endl << endl;
        temp = temp -> ant;
    }
    cout << "Nome: " << temp -> nome <<  " - Salario: " << temp -> salario << endl << endl;
};

bool vazia(){
    if (topo == NULL) return true;
    else return false;
};