import java.util.Scanner;

public class Dados_pessoas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int x = sc.nextInt();

        double[] alturas = new double[x];
        char[] generos = new char[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            generos[i] = sc.next().charAt(0);
        }

        double maiorAltura = alturas[0], media, alturaMulheres = 0.0;
        double menorAltura = alturas[0];
        int homens = 0, cont = 0;
        
        for (int i = 0; i < x; i ++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            if (generos[i] == 'M') {
                homens++;
            }
            else {
                alturaMulheres += alturas[i];
                cont++;
            }
        }

        media = alturaMulheres / cont;

        System.out.printf("Menor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);
        System.out.printf("\nMedia das alturas das mulheres = %.2f", media);
        System.out.print("\nNumero de homens = " + homens);

        sc.close();
    }
}