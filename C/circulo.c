#include <stdio.h>
#include <math.h>

int main() {

    double x, area;

    printf("Digite o valor do raio do circulo: ");
    scanf("%lf", &x);

    area = pow(x, 2) * M_PI;

    printf("AREA = %.3lf", area);

    return 0;
}
