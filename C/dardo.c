#include <stdio.h>

int main() {

    double d1, d2, d3, maior;

    printf("Digite as tres medidas:\n");
    scanf("%lf", &d1);
    scanf("%lf", &d2);
    scanf("%lf", &d3);

    if (d1 > d2 && d1 > d3) {
        maior = d1;
    }
    else if (d2 > d3) {
        maior = d2;
    }
    else {
        maior = d3;
    }

    printf("MAIOR DISTANCIA = %.2lf", maior);

    return 0;
}