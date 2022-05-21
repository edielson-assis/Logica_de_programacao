#include <bits/stdc++.h>

using namespace std;

int main() {

    double x, area;

    cout << "Digite o valor do raio do circulo: ";
    cin >> x;

    area = pow(x, 2) * M_PI;

    cout << fixed << setprecision(3);
    cout << "AREA = " << area;

    return 0;
}