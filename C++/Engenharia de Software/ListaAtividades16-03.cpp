#include "cstdlib"
#include "iostream"
#include "math.h"
#include "stdio.h"
#include "string"

using namespace std;

void menu();

void exercA();
void exercB();
void exercC();
void exercD();
void exercE();
void exercF();
void exercG();

int main() {
  setlocale(LC_ALL, "portuguese");
  system("cls"); // cls - Windows - clear - Linux

  menu();

  return 0;
}

void menu() {
  char escolha;

  cout << "-- MENU DE ATIVIDADES --" << endl << endl;
  cout << "A - Elementos do Vetor" << endl;
  cout << "B - Elementos Multiplicados por 3" << endl;
  cout << "C - Subtracao de Elementos" << endl;
  cout << "D - Elementos ao Quadrado" << endl;
  cout << "E - Juncao de Vetores (30)" << endl;
  cout << "F - Juncao de Vetores (50)" << endl;
  cout << "G - Inversao de Vetores" << endl << endl;
  cout << "S - Sair" << endl << endl;

  cout << "Digite uma opcao: ";
  cin >> escolha;

  switch (towlower(escolha)){
    case 'a':
      system("cls");
      exercA();
      break;

    case 'b':
      system("cls");
      exercB();
      break;

    case 'c':
      system("cls");
      exercC();
      break;

    case 'd':
      system("cls");
      exercD();
      break;

    case 'e':
      system("cls");
      exercE();
      break;

    case 'f':
      system("cls");
      exercF();
      break;

    case 'g':
      system("cls");
      exercG();
      break;

    case 's':
      system("cls");
      cout << "PROGRAMA FINALIZADO!" << endl << endl;
      break;

    default:
      system("cls");
      menu();
      break;
  }

  return;
}

void exercA() {
  string vetor[] = {"coxinha",       "biscoito", "pão de queijo", "café",
                    "suco de manga", "uva",      "macarrão",      "brigadeiro",
                    "rosquinha",     "pavê"};
  int tamVetor = sizeof(vetor) / sizeof(string);

  cout << "-- Elementos do Vetor --" << endl << endl;
  for (int i = 0; i < tamVetor; i++) {
    cout << vetor[i] << " ";
  }

  cout << endl << endl;
  system("pause");
  menu();

  return;
}

void exercB() {
  int vetorA[] = {7, 9, 2, 3, 4, 0, 1, 6};
  int tamVetor = sizeof(vetorA) / sizeof(int);
  int vetorB[tamVetor];

  cout << "-- Elementos multiplicados por 3 --" << endl << endl;
  cout << "Vetor A -> ";
  for (int i = 0; i < tamVetor; i++) {
    cout << vetorA[i] << "  ";
    vetorB[i] = vetorA[i] * 3;
  }

  cout << endl << "Vetor B -> ";
  for (int i = 0; i < tamVetor; i++) {
    cout << vetorB[i] << "  ";
  }

  cout << endl << endl;
  system("pause");
  menu();
  
  return;
}

void exercC() {
  int vetorA[] = {7, 8, 5, 10, 4, 3, 1, 8, 2, 9, 5, 7, 6, 0, 7, 5, 4, 3, 2, 8};
  int vetorB[] = {6, 1, 2, 3, 11, 4, 9, 6, 5, 3, 6, 8, 2, 4, 9, 1, 4, 7, 4, 10};
  int vetorC[20];
  int tamVetor = sizeof(vetorA) / sizeof(int);

  cout << "-- Subtracao de Elementos --" << endl << endl;
  cout << "Vetor A -> ";
  for (int i = 0; i < tamVetor; i++) {
    cout << vetorA[i] << "  ";
  }

  cout << endl << "Vetor B -> ";
  for (int i = 0; i < tamVetor; i++) {
    cout << vetorB[i] << "  ";
  }

  cout << endl << "Vetor C -> ";
  for (int i = 0; i < tamVetor; i++) {
    vetorC[i] = vetorA[i] - vetorB[i];
    cout << vetorC[i] << "  ";
  }

  cout << endl << endl;
  system("pause");
  menu();
  
  return;
}

void exercD() {
  int vetorA[] = {2, 5, 7, 3, 4, 8, 9, 1, 5, 0, 3, 2, 9, 5, 6};
  int tamVetor = sizeof(vetorA) / sizeof(int);
  int vetorB[tamVetor];

  cout << "-- Elementos ao Quadrado --" << endl << endl;
  cout << "Vetor A -> ";
  for (int i = 0; i < tamVetor; i++) {
    vetorB[i] = vetorA[i] * vetorA[i];
    cout << vetorA[i] << "  ";
  }

    cout << endl << "Vetor B -> ";
  for (int i = 0; i < tamVetor; i++) {
    cout << vetorB[i] << "  ";
  }

  cout << endl << endl;
  system("pause");
  menu();
  
  return;
}

void exercE() {
  int vetorA[] = {2, 5, 7, 3, 4, 8, 9, 1, 5, 0, 3, 2, 9, 5, 6};
  int vetorB[] = {4, 7, 1, 5, 9, 0, 1, 5, 2, 7, 8, 6, 4, 3, 5};
  int tamVetor = sizeof(vetorA) / sizeof(int);
  int vetorC[tamVetor * 2];

  cout << "-- Juncao de Vetores (30) --" << endl << endl;
  cout << "Vetor A -> ";
  for (int i = 0; i < tamVetor; i++) {
      cout << vetorA[i] << "  ";
      vetorC[i] = vetorA[i];
  }

  cout << endl << "Vetor B -> ";
  for (int i = 0; i < tamVetor; i++) {
      cout << vetorB[i] << "  ";
      vetorC[tamVetor + i] = vetorB[i];
  }

  cout << endl << "Vetor C -> ";
  for (int i = 0; i < tamVetor * 2; i++) {
      cout << vetorC[i] << "  ";
  }

  cout << endl << endl;
  system("pause");
  menu();
  
  return;
}

void exercF() {
  int vetorA[20] = {2, 5, 7, 3, 4, 8, 9, 1, 5, 0, 3, 2, 9, 5, 6, 5, 4, 3, 9, 0};
  int vetorB[30] = {4, 7, 1, 5, 9, 0, 1, 5, 2, 7, 8, 6, 4, 3, 5, 4, 7, 2, 1, 9, 2, 5, 7, 3, 4, 8, 9, 1, 5, 0};
  int tamVetorA = sizeof(vetorA)/sizeof(int);
  int tamVetorB = sizeof(vetorB)/sizeof(int);
  int vetorC[tamVetorA + tamVetorB];

  cout << "-- Juncao de Vetores (50) --" << endl << endl;
  cout << "Vetor A -> ";
  for (int i = 0; i < tamVetorA; i++) {
    vetorC[i] = vetorA[i];
    cout << vetorA[i] << "  ";
  }

  cout << endl << "Vetor B -> ";
  for (int i = 0; i < tamVetorB; i++) {
    vetorC[tamVetorA + i] = vetorB[i];
    cout << vetorB[i] << "  ";
  }

  cout << endl << "Vetor C -> ";
  for (int i = 0; i < (tamVetorA + tamVetorB); i++) {
    cout << vetorC[i] << "  ";
  }

  cout << endl << endl;
  system("pause");
  menu();
  
  return;
}

void exercG() {
  int vetorA[20] = {2, 5, 7, 3, 4, 8, 9, 1, 5, 0, 3, 2, 9, 5, 6, 5, 4, 3, 9, 0};
  int vetorB[20];
  int tamVetor = sizeof(vetorA)/sizeof(int);

  cout << "-- Inversao de Vetores --" << endl << endl;
  cout << "Vetor A -> ";
  for (int i = 0; i < tamVetor; i++) {
    vetorB[(tamVetor - 1) - i] = vetorA[i];
    cout << vetorA[i] << "  ";
  }

  cout << endl << "Vetor B -> ";
  for (int i = 0; i < tamVetor; i++) {
    cout << vetorB[i] << "  ";
  }

  cout << endl << endl;
  system("pause");
  menu();
  
  return;
}