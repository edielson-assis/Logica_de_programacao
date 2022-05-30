#include <stdio.h>

int main() {

    int quantidade;
    double preco, dinheiro, troco, total;

    printf("Preco unitario do produto: ");
    scanf("%lf", &preco);
    printf("Quantidade comprada: ");
    scanf("%d", &quantidade);

    total = preco * quantidade;

    printf("TOTAL = %.2lf\n", total);
    printf("Dinheiro reecebido: ");
    scanf("%lf", &dinheiro);

    if (dinheiro < total) {
        troco = total - dinheiro;
        printf("DINHEIRO INSUFICIENTE. FALTAM %.2lf REAIS", troco);
    }
    else {
        troco = dinheiro - total;
        printf("TROCO = %.2lf", troco);
    }

    return 0;
}