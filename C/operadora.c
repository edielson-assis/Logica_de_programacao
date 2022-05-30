#include <stdio.h>

int main() {

    int minutos;
    double custo;

    printf("Digite a quantidade de minutos: ");
    scanf("%d", &minutos);

    if (minutos <= 100) {
        custo = 50.00;
    }
    else {
        custo = (minutos - 100) * 2 + 50.00;
    }

    printf("Valor a pagar: R$ %.2lf", custo);

    return 0;
}