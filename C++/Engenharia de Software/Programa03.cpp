#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int linha = -1;

string nome [4];
int idade [4];
double salario [4];

string lerNome();
int lerIdade();
double lerSalario();

void guardarDados(string nom, int ida, double sal);
void listar();

int main() {
    string nome_;
    int idade_;
    double salario_;

    int tecla;

    MENU:
        system("cls");
        cout << "* Menu *" << endl;
        cout << "1 - ler" << endl;
        cout << "2 - exibir" << endl;
        cout << "3 - sair \n" << endl;
        cout << "Digite uma opcao: ";
        cin >> tecla;

        switch(tecla) {
            case 1:
                nome_ = lerNome();
                idade_ = lerIdade();
                salario_ = lerSalario();
                guardarDados (nome_, idade_, salario_);
                break;
            
            case 2:
                listar();
                break;

            case 3:
                exit(0);
                break;
        }

        goto MENU;

    return 0;
}

string lerNome() {
    string nome;
    cout << "\nNome: ";
    cin.ignore();
    getline(cin, nome);

    return nome;
}

int lerIdade() {
    int idade;
    cout <<"\nIdade: ";
    cin >> idade;

    return idade;
}

double lerSalario() {
    double sal;
    cout << "\nSalario: ";
    cin >> sal;

    return sal;
}

void guardarDados(string nom, int ida, double sal) {
    linha ++;
    nome[linha] = nom;
    idade[linha] = ida;
    salario[linha]= sal;
}

void listar() {
    for (int i = 0; i <= linha; i++) {
        cout << nome[i] << " - " << idade[i] << " - " << salario[i] << endl;
    }

    system("pause");
}