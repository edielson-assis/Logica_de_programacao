import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores das coordenadas X e Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE Q1");
            }
            else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE Q2");
            }
            else if (x < 0 && y < 0) {
                System.out.println("QUADRANTE Q3");
            }
            else if (x > 0 && y < 0) {
                System.out.println("QUADRANTE Q4");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}