#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    double celsius, fahren;

    system("cls");
    setlocale(LC_ALL, "portuguese");

    cout << "-- CONVERSAO DE TEMPERATURA --" << endl;
    cout << "Digite a temperatura em celsius: ";
    cin >> celsius;

    fahren =  (9 * celsius + 160) / 5;

    cout << endl;
    cout << "Celsius: " << celsius << "C " <<  endl;
    cout << "Fahrenheit: "  << fahren << "F " << endl;
    cout << endl;

    system("pause");
}