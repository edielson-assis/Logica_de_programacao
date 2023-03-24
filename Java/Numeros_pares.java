import java.util.Scanner;

public class Numeros_pares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int x = sc.nextInt();

        int[] pares = new int[x];

        for (int i = 0; i < pares.length; i++) {
            System.out.print("Digite um numero: ");
            pares[i] = sc.nextInt();
        }

        int cont = 0;
        System.out.println("\nNUMEROS PARES:");
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 == 0) {
                System.out.print(pares[i] + " ");
                cont++;
            }
        }

        System.out.print("\n\nQUANTIDADE DE PARES = " + cont);

        sc.close();
    }
}