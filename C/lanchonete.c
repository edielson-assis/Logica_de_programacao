#include <stdio.h>

int main() {

    int codigo, quantidade;
    double valor;

    printf("Codigo do produto: ");
    scanf("%d", &codigo);
    printf("Quantidade comprada: ");
    scanf("%d", &quantidade);

    switch (codigo) {
        case 1:
            valor = 5.00 * quantidade;
            break;
        case 2:
            valor = 3.50 * quantidade;
            break;
        case 3:
            valor = 4.80 * quantidade;
            break;
        case 4:
            valor = 8.90 * quantidade;
            break;
        default:
            valor = 7.32 * quantidade;
            break;
    }

    printf("Valor a pagar: R$ %.2lf", valor);

    return 0;
}