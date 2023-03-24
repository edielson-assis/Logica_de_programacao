import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int x = sc.nextInt();

        double[] numeros = new double[x];

        for (int i = 0; i < numeros.length; i ++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double soma = 0;
        System.out.print("\nVALORES = ");
        for (double total : numeros) {
            System.out.print(String.format("%.1f", total) + " ");
            soma += total;
        }

        double media = soma / x;

        System.out.println("\nSOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}