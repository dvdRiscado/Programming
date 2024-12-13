#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int const tam = 5;

int linha = 0;

struct usuario {
    string nome[tam];
    int idade[tam];
    string sexo[tam];
    float salario[tam];
    float salarioNovo[tam];
};

typedef struct usuario tbUsu;

tbUsu tbUsuario;
tbUsu *pTbUsuario = &tbUsuario;

void menu();

void novaLinhaStruct(string vNom, int vIda, string vSex, float vSal, float vNovSal);
void mostrarLinhasStruct();
string lerNome();
int lerIdade();
string lerSexo();
float lerSalario();

float getAumento(float *salario); // Aumento de 10% sobre o salário atual

int main(){
    system("cls");
    setlocale(LC_ALL, "portuguese");

    menu();

    return 0;
}

void menu(){
    system("cls");

    char tecla;

    cout << "-- REAJUSTE SALARIAL --" << endl << endl;
    cout << "1 - ler nova linha" << endl;
    cout << "2 - mostras linhas" << endl;
    cout << "3 - sair" << endl << endl;
    
    cout << "Digite uma opcao: ";
    cin >> tecla;

    switch(tecla) {
        case '1':
            system("cls");
            cout << "-- LER NOVA LINHA --" << endl << endl;

            if (linha < tam){
                string vNome = lerNome();
                int vIdade = lerIdade();
                string vSexo = lerSexo();
                float vSalario = lerSalario();
                float vNovoSalario = getAumento(&vSalario);

                novaLinhaStruct(vNome, vIdade, vSexo, vSalario, vNovoSalario);

                cout << endl << "Nova linha cadastrada com sucesso!" << endl;
            } else {
                cout << "ERRO: Limite de linhas atingido!" << endl;
            }
            
            system("pause");

            menu();
            break;

        case '2':
            system("cls");
            cout << "-- MOSTRAR LINHAS --" << endl << endl;
            mostrarLinhasStruct();

            cout << endl;
            system("pause");

            menu();
            break;

        case '3':
            system("cls");
            cout << "PROGRAMA FINALIZADO!" << endl;
            system("pause");
            break;

        default:
            menu();
            break;
    } 

    return;
}

string lerNome() {
    string nome;

    cout << "Digite o nome: ";
    cin >> nome;

    return nome;
}

int lerIdade() {
    int idade;

    cout << "Digite a idade: ";
    cin >> idade;

    return idade;
}

string lerSexo() {
    string sexo;

    cout << "Digite o sexo: ";
    cin >> sexo;

    return sexo;
}

float lerSalario() {
    float salario;

    cout << "Digite o salario: ";
    cin >> salario;

    return salario;
}

float getAumento(float *salario) {
    float novoSalario;

    novoSalario = *salario + (*salario * 0.10);
    cout << "Salario reajustado em 10%: " << novoSalario << endl;

    return novoSalario;
}

void novaLinhaStruct(string vNom, int vIda, string vSex, float vSal, float vNovSal){
    pTbUsuario->nome[linha] = vNom;
    pTbUsuario->idade[linha] = vIda;
    pTbUsuario->sexo[linha] = vSex;
    pTbUsuario->salario[linha] = vSal;
    pTbUsuario->salarioNovo[linha] = vNovSal;

    linha += 1;

    return;
}

void mostrarLinhasStruct(){
    for (int i = 0; i < linha; i++) {
        cout << "Nome: " << pTbUsuario->nome[i] << " - Idade: " << pTbUsuario->idade[i] << " - Sexo: " << pTbUsuario->sexo[i] << " - Salario: " << pTbUsuario->salario[i] << " - Novo Salario: " << pTbUsuario->salarioNovo[i] << endl;
    }

    return;
}