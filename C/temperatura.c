#include <stdio.h>

int main() {

    double C, F;
    char n;

    printf("Voce vai digitar a temperatura em qual escala (C/F)? ");
    scanf("%c", &n);

    if (n == 'C') {
        printf("Digite a temperatura em Celsius: ");
        scanf("%lf", &C);
        F = 9.0 * C / 5.0 + 32.0;
        printf("Temperatura equivalente em Fahrenheit: %.2lf", F);
    }
    else {
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%lf", &F);
        C = 5.0 / 9.0 * (F - 32.0);
        printf("Temperatura equivalente em Celsius: %.2lf", C);
    }

    return 0;
}