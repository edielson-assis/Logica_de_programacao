#include <bits/stdc++.h>

using namespace std;

int main() {

    double preco, dinheiro, troco, total;
    int quantidade;

    cout << "Preco unitario do produto: ";
    cin >> preco;
    cout << "Quantidade comprada: ";
    cin >> quantidade;

    total = preco * quantidade;

    cout << fixed << setprecision(2);
    cout << "TOTAL = " << total << endl;

    cout << "Dinheiro recebido: ";
    cin >> dinheiro;

    troco = dinheiro - total;

    cout << "TROCO = " << troco;

    return 0;
}