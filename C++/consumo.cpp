#include <bits/stdc++.h>

using namespace std;

int main() {

    double distancia, combustivel, consumo;

    cout << "Distancia percorrida: ";
    cin >> distancia;
    cout << "Combustivel gasto: ";
    cin >> combustivel;

    consumo = distancia / combustivel;

    cout << fixed << setprecision(3);
    cout << "Consusmo medio = " << consumo << endl;

    return 0;
}