/*
#include "iostream"
#include "cstdlib"

using namespace std;

int main(){
   int x = 20;
   cout << "Valor de x: " << x << endl;
   cout << "Valor de x em bytes: " << sizeof(x);

   return 0;
}
*/

/*
#include "iostream"
#include "cstdlib"

using namespace std;

int main(){
   int * x = (int *) malloc(sizeof(int));
   cout << "Endereco de x: " << x << endl;

   *x = 20;
   cout << "Valor de x: " << *x;

   return 0;
}
*/

#include "iostream"
#include "cstdlib"
#include "stdio.h"
#include "time.h"

using namespace std;

int main(){
    srand (time (NULL));

    int n = 5;

    int *vNum = (int *) calloc(n, sizeof(int));

    for (int i = 0; i < n; i++){
        vNum[i] = rand() % 10;
        cout << vNum[i] << " ";
    }
}