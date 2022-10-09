import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite dois numeros inteiros:");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}