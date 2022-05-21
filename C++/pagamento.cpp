#include <bits/stdc++.h>

using namespace std;

int main() {

    string nome; 
    double valorHora, pagamento;
    int horasTrabalhadas;

    cout << "Nome: ";
    getline(cin, nome);
    cout << "Valor por hora: ";
    cin >> valorHora;
    cout << "Horas trabalhadas: ";
    cin >> horasTrabalhadas;

    pagamento = valorHora * horasTrabalhadas;

    cout << fixed << setprecision(2);
    cout << "O pagamento para " << nome << " deve ser " << pagamento;

    return 0;
}