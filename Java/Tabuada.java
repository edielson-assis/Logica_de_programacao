import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int total = numero * i;
            System.out.println(numero + " x " + i + " = " + total);
        }

        sc.close();
    }
}