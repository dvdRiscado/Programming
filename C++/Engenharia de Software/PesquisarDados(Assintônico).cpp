#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "string.h"

using namespace std;

int qtd, aux;
string laux;

void menu(int num[], string nome[]);

int main() {
    setlocale(LC_ALL, "portuguese");
    system("cls");

    cout << "Digite a quantidade de dados: ";
    cin >> qtd;

    int num[qtd];
    string nome[qtd];

    menu(num, nome);

    return 0;
}

void menu(int num[], string nome[]) {
    system("cls");

    char escolha;

    cout << "-- BANCO DE DADOS --" << endl << endl;
    cout << "1 - Adicionar Dados" << endl;
    cout << "2 - Pesquisar Dados" << endl;
    cout << "3 - Mostrar Dados" << endl;
    cout << "4 - Sair" << endl << endl;

    cout << "Escolha uma opcao: ";
    cin >> escolha;

    switch(escolha){
        case '1':
            system("cls");
            
            cout << "-- ADICIONAR DADOS --" << endl;
            cout << "- Numero -" << endl << endl;

            for(int i = 0; i < qtd; i++){
                cout << "Digite o " << i + 1 << "º numero: ";
                cin >> num[i];
            }

            system("cls");

            cout << "--ADICIONAR DADOS --" << endl;
            cout << "- Nome -" << endl << endl;

            for(int i = 0; i < qtd; i++){
                cout << "Digite o " << i + 1 << " nome: ";
                getline (cin, nome[i]);
            }

            cout << endl;

            system("pause");
            menu(num, nome);
            break;

        case '2':
            system("cls");
            char esc;

            cout << "-- PESQUISAR DADOS --" << endl << endl;

            cout << "1 - Numero" << endl;
            cout << "2 - Nome" << endl << endl;

            cout << "Digite uma opcao: ";
            cin >> esc;

            while(esc != '1' && esc != '2'){
                system("cls");

                cout << "-- PESQUISAR DADOS --" << endl << endl;

                cout << "1 - Numero" << endl;
                cout << "2 - Nome" << endl << endl;

                cout << "Digite uma opcao: ";
                cin >> esc;
            }

            system("cls");

            if(esc == '1'){
                int pNum;
                bool res = false;

                cout << "-- PESQUISAR DADOS --" << endl << endl;

                cout << "Digite o número: ";
                cin >> pNum;

                for(int i = 0; i < qtd; i++){
                    if(pNum == num[i]){
                        cout << endl << "Dado encontrado na " << i + 1 << " posicao!" << endl << endl;
                        res = true;
                        break;
                    } 
                }

                if(!res){
                    cout << endl << "Dado não encontrado!" << endl << endl;
                }

            } else if (esc == '2'){
                string pNome;
                bool res = false;

                cout << "-- PESQUISAR DADOS --" << endl << endl;

                cout << "Digite o nome: ";
                cin >> pNome;

                for(int i = 0; i < qtd; i++){
                    if(pNome == nome[i]){
                        cout << endl << "Dado encontrado na " << i + 1 << " posicao!" << endl << endl;
                        res = true;
                        break;
                    }
                }

                if(!res){
                    cout << endl << "Dado não encontrado!" << endl << endl;
                }
            }

            system("pause");
            menu(num, nome);
            break;

        case '3':
            system("cls");

            cout << "-- MOSTRAR DADOS --" << endl << endl;

            cout << "Vetor de numeros (crescente): ";

            int troca = 1;
            while (troca == 1)
            {
                troca = 0;        
                for (int i = 0; i <= 3; i++)
                {
                    if (num[i] > num[i + 1])
                    {
                        troca = 1;
                        aux = num[i];
                        num[i] = num[i + 1];
                        num[i + 1] = aux;
                    }
                }
            }

            for (int i = 0; i <= qtd - 1; i++){
                cout << num[i] << "  ";
            }

            cout << endl << endl << "Vetor de numeros (descrescente): ";

            for (int i = qtd - 1; i >= 0; i--){
                cout << num[i] << "  ";
            }

            cout << endl << endl << "Vetor de nomes (A - Z): ";

            for (int i = 0; i <= qtd - 1; i++){
                cout << nome[i] << "  ";
            }

            cout << endl << endl;

            system("pause");
            menu(num, nome);
            break;

        case '4':
            system("cls");
            
            cout << "-- PROGRAMA FINALIZADO! --" << endl << endl;

            system("pause");
            break;

        default:

            menu(num, nome);
            break;
    }
}