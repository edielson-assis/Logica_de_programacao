import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {

            if (x < y) {
                System.out.println("CRESCENTE!");
            } else {
                System.out.println("DECRESCENTE!");
            }

            System.out.println("Digite outros dois numeros:");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}