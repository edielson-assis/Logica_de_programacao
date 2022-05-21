#include <bits/stdc++.h>

using namespace std;

int main() {

    double largura, comprimento, valor, area, preco;

    cout << "Digite a largura do terreno: ";
    cin >> largura;
    cout << "Digite o comprimento do terreno: ";
    cin >> comprimento;
    cout << "Digite o valor do metro quadrado: ";
    cin >> valor;

    area = largura * comprimento;
    preco = area * valor;

    cout << fixed << setprecision(2);
    cout << "Area do terreno = " << area << endl;
    cout << "Preco do terreno = " << preco;

    return 0;
}