import java.util.Locale;
import java.util.Scanner;

public class Troco_verificado {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, dinheiro, troco, total;
        int quantidade;

        System.out.print("Preco unitario do produto: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        total = preco * quantidade;

        System.out.printf("TOTAL = %.2f\n", total);
        System.out.printf("Dinheiro reecebido: ");
        dinheiro = sc.nextDouble();

        if (dinheiro < total) {
            troco = total - dinheiro;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", troco);
        }
        else {
            troco = dinheiro - total;
            System.out.printf("TROCO = %.2f", troco);
        } 

        sc.close();
    }
}