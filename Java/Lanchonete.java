import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valor;

        System.out.print("Codigo do produto comprado: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            valor = 5.00 * quantidade;
        }
        else if (codigo == 2) {
            valor = 3.50 * quantidade;
        }
        else if (codigo == 3) {
            valor = 4.80 * quantidade;
        }
        else if (codigo == 4) {
            valor = 8.90 * quantidade;
        }
        else {
            valor = 7.32 * quantidade;
        }

        System.out.printf("Valor a pagar: R$ %.2f", valor);

        sc.close();
    }
}