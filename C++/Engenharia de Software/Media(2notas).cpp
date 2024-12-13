#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    double nota1, nota2, media;
    
    system("cls");
    
    setlocale(LC_ALL, "portuguese");
    
    cout << "Digite a 1 Nota: ";
    cin >> nota1;
    
    cout << "Digite a 2 Nota: ";
    cin >> nota2;
    
    media = (nota1 + nota2) /2;
    
    cout << "O valor da Media eh: " << media << endl;
    
    string msg = "";
    
    if (media <= 3) {
       msg = "Aluno REPROVADO!";
    } else if (media <= 6) {
       msg = "Aluno de RECUPERACAO!";
    } else {
       msg = "Aluno APROVADO!";
    }
    
    cout << msg << endl;
    
    system("pause");
}
