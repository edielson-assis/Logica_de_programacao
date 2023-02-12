import java.util.Scanner;

public class Dentro_fora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int x = sc.nextInt();

        int dentro = 0, fora = 0;
        for (int i = 0; i < x; i++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro++;
            }
            else {
                fora++;
            }
        }

        System.out.println(dentro + " DENTRO");
        System.out.println(fora + " FORA");

        sc.close();
    }
}