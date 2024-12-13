#include "iostream"
#include "cstdlib"
#include "Math.h"
#include "String"

using namespace std;

int main() {
    double celsius, fahren;

    system("cls");
    setlocale(LC_ALL, "portuguese");

    cout << "-- CONVERSÃO DE TEMPERATURA --" << endl;
    cout << "Digite a temperatura em fahrenheit: ";
    cin >> fahren;

    celsius = (fahren - 32) * (5/9);

    system("cls");

    cout << "Fahrenheit: "  << fahren << "F " << endl;
    cout << "Celsius: " << celsius << "C " << endl;

    system("pause");
}