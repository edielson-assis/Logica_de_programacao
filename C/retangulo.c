#include <stdio.h>
#include <math.h>

int main() {

    double base, altura, area, periemtro, diagonal;

    printf("Base do retangulo: ");
    scanf("%lf", &base);
    printf("Altura do retangulo: ");
    scanf("%lf", &altura);

    area = base * altura;
    periemtro = 2 * (base + altura); 
    diagonal =  sqrt(pow(base, 2) + pow(altura, 2));

    printf("\nAREA = %.4lf", area);
    printf("\nPERIMETRO = %.4lf", periemtro);
    printf("\nDIAGONAL = %.4lf", diagonal);

    return 0;
}