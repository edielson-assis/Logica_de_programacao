#include <stdio.h>

int main() {

    double salario, novoSalario, aumento; 
    int porcentagem;

    printf("Digite o salario da pessoa: ");
    scanf("%lf", &salario);

    if (salario <= 1000.00) { 
        aumento = salario * 0.20; 
        porcentagem = 20;
    }
    else if (salario <= 3000.00) {
        aumento = salario * 0.15;
        porcentagem = 15;
    }
    else if (salario <= 8000.00) {
        aumento = salario * 0.10;
        porcentagem = 10;
    }
    else {
        aumento = salario * 0.05;
        porcentagem = 5;
    }

    novoSalario = aumento + salario;

    printf("Novo salario = R$ %.2lf", novoSalario);
    printf("\nAumento = R$ %.2lf", aumento);
    printf("\nPorcentagem = %d %%", porcentagem);

    return 0;
}