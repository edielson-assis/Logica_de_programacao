import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Serao digitados dados de quantos produtos? ");
        int x = sc.nextInt();

        double[] compra = new double[x];
        double[] venda = new double[x];
        double[] lucros = new double[x];

        for (int i = 0; i < x; i ++) {
            System.out.println("Produto " + (i+1) + ":");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Preco de compra: ");
            compra[i] = sc.nextDouble();
            System.out.print("Preco de venda: ");
            venda[i] = sc.nextDouble();
        }

        int menorQueDez = 0, maiorQueVinte = 0, entreDezEVinte = 0;
        double totalCompra = 0, totalVenda = 0, lucroTotal;

        for (int i = 0; i < x; i++) {
            lucros[i] = (venda[i] - compra[i]) * 100 / compra[i];
            if (lucros[i] >= 10 && lucros[i] <= 20) {
                entreDezEVinte++;
            }
            else if (lucros[i] < 10) {
                menorQueDez++;
            }
            else {
                maiorQueVinte++;
            }

            totalCompra += compra[i];
            totalVenda += venda[i]; 
        }

        lucroTotal = totalVenda - totalCompra;

        System.out.println("\nRELATORIO:");
        System.out.print("Lucro abaixo de 10%: " + menorQueDez);
        System.out.print("\nLucro entre 10% e 20%: " + entreDezEVinte);
        System.out.print("\nLucro acima de 20%: " + maiorQueVinte);
        System.out.printf("\nValor total de compra: %.2f", totalCompra);
        System.out.printf("\nValor total de venda: %.2f", totalVenda);
        System.out.printf("\nLucro total: %.2f", lucroTotal);

        sc.close();
    }
}