import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("FATORIAL = " + fatorial);

        sc.close();
    }
}