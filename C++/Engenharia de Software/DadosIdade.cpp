#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    setlocale(LC_ALL, "portuguese");
    system("cls");

    string nomeMaiorIdade;
    int maiorIdade = 0;

    string nomeMenorIdade;
    int menorIdade = 0;

    int saldoIdade = 0;

    int qtdPessoas;
    cout << "Digite a quantidade de pessoas: ";
    cin >> qtdPessoas;

    string vetNome[qtdPessoas];
    int vetIdade[qtdPessoas];

    for (int i = 0; i < qtdPessoas; i++) {
        system("cls");
        cout << " -- " << i + 1 << " pessoa -- " << endl << endl;

        cout << "Digite o nome: ";
        cin.ignore();
        getline(cin, vetNome[i]);

        cout << "Digite a idade: ";
        cin >> vetIdade[i];
        saldoIdade += vetIdade[i];

        if (vetIdade[i] > maiorIdade || maiorIdade == 0) {
            nomeMaiorIdade = vetNome[i];
            maiorIdade = vetIdade[i];
        }

        if (vetIdade[i] < menorIdade || menorIdade == 0) {
            nomeMenorIdade = vetNome[i];
            menorIdade = vetIdade[i];
        }
    }

    system("cls");
    cout << "-- RESULTADOS --" << endl << endl;
    cout << "Nome da maior idade: " << nomeMaiorIdade << " - Idade: " << maiorIdade << endl;
    cout << "Nome da menor idade: " << nomeMenorIdade << " - Idade: " << menorIdade << endl;
    float mediaIdade = saldoIdade/qtdPessoas;

    cout << "Media das idades: " << mediaIdade << endl;
    cout << "Saldo das idades: " << saldoIdade << endl << endl;
    cout << "Dados recebidos: " << endl << endl;

    for (int i = 0; i < qtdPessoas; i++) {
        cout << vetNome[i] << " - " << vetIdade[i] << endl;
    }
    
    cout << endl;
    system("pause");
    
}