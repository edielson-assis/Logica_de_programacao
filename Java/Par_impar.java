import java.util.Scanner;

public class Par_impar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero % 2 != 0) {
                if (numero > 0) {
                    System.out.println("IMPAR POSITIVO");
                }
                else {
                    System.out.println("IMPAR NEGATIVO");
                }
            }
            else if (numero == 0) {
                System.out.println("NULO");
            }
            else {
                if (numero > 0) {
                    System.out.println("PAR POSITIVO");
                }
                else {
                    System.out.println("PAR NEGATIVO");
                }
            }
        }

        sc.close();
    }
}