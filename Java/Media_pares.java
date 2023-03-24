import java.util.Scanner;

public class Media_pares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int x = sc.nextInt();

        int[] numeros = new int[x];

        int cont = 0, pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares += numeros[i];
                cont++;
            } 
        }

        if (cont == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            double media = (double) pares / cont;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }

        sc.close();
    }
}