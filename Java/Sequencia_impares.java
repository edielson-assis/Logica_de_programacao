import java.util.Scanner;

public class Sequencia_impares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}