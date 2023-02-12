import java.util.Scanner;

public class Media_ponderada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.print("Quantos casos voce vai digitar? ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            System.out.println("Digite tres numeros:");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

            System.out.println("MEDIA = " + String.format("%.1f", media));
        }

        sc.close();
    }
}