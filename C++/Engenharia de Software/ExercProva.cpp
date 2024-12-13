#include "iostream"
#include "cstdlib"
#include "math.h"

using namespace std;

double somaFat(double x){
    int i, j, fat = 1, soma = 0;

    for (i = 0; i <= x; i++){
        for (j = 1; j <= i; j++){
            fat = fat * j;
            soma = soma + fat;
        }
    }

    return soma;
}

int main(){
    cout << somaFat(2) << endl;
}