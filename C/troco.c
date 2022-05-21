#include <stdio.h>

int main() {

    double preco, dinheiro, troco, total;
    int quantidade;

    printf("Preco unitario do produto: ");
    scanf("%lf", &preco);
    printf("Quantidade do produto: ");
    scanf("%d", &quantidade);

    total = preco * quantidade;

    printf("Total: %.2lf", total);
    printf("\nDinheiro recebido: ");
    scanf("%lf", &dinheiro);

    troco = dinheiro - total;

    printf("TROCO = %.2lf", troco);

    return 0;
}