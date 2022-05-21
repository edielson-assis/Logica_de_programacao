#include <stdio.h>

int main() {

    double a, b, c, areaQuadrado, areaTriangulo, areaTrapezio;

    printf("Digite a medida A: ");
    scanf("%lf", &a);
    printf("Digite a medida B: ");
    scanf("%lf", &b);
    printf("Digite a medida C: ");
    scanf("%lf", &c);

    areaQuadrado = a * a;
    areaTriangulo = (a * b) / 2;
    areaTrapezio = (a + b) * c / 2;

    printf("AREA QUADRADO = %.4lf", areaQuadrado);
    printf("\nAREA TRIANGULO = %.4lf", areaTriangulo);
    printf("\nAREA TRAPEZIO = %.4lf", areaTrapezio);

    return 0;
}