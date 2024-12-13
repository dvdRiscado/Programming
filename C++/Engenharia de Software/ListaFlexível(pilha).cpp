#include <iostream>
#include <cstdlib>
#include <stdlib.h>

using namespace std;

typedef struct nopilha pilha;
struct nopilha {
    int valor;
    pilha *ant;
};

int cont; 
pilha *topo;

void construtor();
bool push(int valor);
bool pop();
void exibirpilha();
bool vazia();
void destrutor();
int total();

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

    char escolha;
    bool res;

    cout << "-- GERENCIADOR DE LIFO(PILHA) --" << endl << endl;
    cout << "1 - Funcao PUSH" << endl;
    cout << "2 - Funcao POP" << endl;
    cout << "3 - Funcao EXIBIR" << endl;
    cout << "4 - Funcao QUANTIDADE" << endl;
    cout << "5 - Funcao POP ALL" << endl;
    cout << "0 - Sair" << endl << endl;

    cout << "Digite uma opcao: ";
    cin >> escolha;

    switch(escolha){
        case '1':
            system("cls");
            cout << "-- Funcao PUSH --" << endl << endl;

            int val;
            cout << "Digite um valor: ";
            cin >> val;

            
            res = push(val);

            if (res) {
                cout << endl << "VALOR ARQUIVADO COM SUCESSO!" << endl << endl;
            } else {
                cout << endl << "ERRO: tente novamente!" << endl << endl;
            }

            system("pause");
            menu();
            break;

        case '2':
            system("cls");
            cout << "-- Funcao POP --" << endl << endl;

            res = vazia();

            if (!res) {
                res = pop();

                if (res) {
                    cout << "VALOR DELETADO COM SUCESSO!" << endl << endl;
                } else {
                    cout << "ERRO: Tente novamente!" << endl << endl;    
                }
            } else {
                cout << "ERRO: A pilha esta vazia!" << endl << endl;
            }

            system("pause");
            menu();
            break;

        case '3':
            system("cls");
            cout << "-- Funcao EXIBIR --" << endl << endl;

            res = vazia();

            if (!res) {
                exibirpilha();
                cout << endl;
            } else {
                cout << "ERRO: A pilha esta vazia!" << endl << endl;
            }

            system("pause");
            menu();
            break;

        case '4':
            system("cls");
            cout << "-- Funcao QUANTIDADE --" << endl << endl;

            cout << "A quantidade de numeros e: " << total() << endl << endl;

            system("pause");
            menu();
            break;

        case '5':
            system("cls");
            cout << "-- Funcao POP ALL --" << endl << endl;

            char sin;
            cout << "Toda a lista sera apagada, tem certeza que quer continuar? S/N - ";
            cin >> sin;

            if (sin == 'S') {
                cout << endl;

                destrutor();
                system("pause");
                menu();
            } else {
                cout << endl;
                system("pause");
                menu();
            }
            break;

        case '0':
            system("cls");
            cout << "PROGRAMA FINALIZADO COM SUCESSO!" << endl << endl;
            break;

        default:
            menu();
            break;
    }
}

void construtor(){
    topo = NULL;
    cont = 0;
}

bool push(int valor){
    pilha *newpilha = (pilha*) malloc(sizeof(pilha));

    if (newpilha == NULL) return false;

    newpilha -> valor = valor;
    newpilha -> ant = topo;
    topo = newpilha;

    cont ++;

    return true;
}

bool pop(){
    int valor;
    pilha *temp;

    temp = topo;
    valor = topo -> valor;
    topo = topo -> ant;

    free(temp);
    cout << "O valor removido foi: " << valor << endl << endl;

    return true;
}

void exibirpilha(){
    pilha *temp;
    temp = topo;

    while (temp -> ant != NULL) {
        cout << temp -> valor << endl;
        temp = temp -> ant;
    }
    cout << temp -> valor << endl;
}

bool vazia() {
    if (topo == NULL) return true;
    else return false;
}

void destrutor(){
    pilha *temp;

    while (topo != NULL) {
        temp = topo;
        topo = topo -> ant;
        free(temp);
        cont --;
    }

    free(topo);

    cout << "A PILHA FOI DESTRUIDA COM SUCESSO!" << endl << endl;
}

int total(){
    pilha *temp;
    temp = topo;
    int cont = 0;

    while (temp != NULL) {
        cont ++;
        temp = temp -> ant;
    }

    return cont;
}