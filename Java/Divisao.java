import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos voce vai digitar? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Entre com o numerador: ");
            double numerador =  sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            double denominador =  sc.nextDouble();

            if (denominador == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            }
            else {
                double divisao = numerador / denominador;
                System.out.println("DIVISAO = " + String.format("%.2f", divisao));
            }
        }

        sc.close();
    }
}