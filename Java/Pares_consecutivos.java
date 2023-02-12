import java.util.Scanner;

public class Pares_consecutivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        while (numero != 0) {

            if (numero % 2 != 0) {
                numero++;
            }

            int soma = 5 * numero + 20;
            System.out.println("SOMA = " + soma);

            System.out.print("Digite um numero inteiro: ");
            numero = sc.nextInt();
        }

        sc.close();
    }
}