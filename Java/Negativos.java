import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int x = sc.nextInt();

        int[] numeros = new int[x];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int negativos : numeros) {
            if (negativos < 0) {
                System.out.println(negativos);
            }
        }

        sc.close();
    }
}