import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int coelho = 0, rato = 0, sapo = 0;
        double percentualCoelho, percentualRato, percentualSapo;

        System.out.print("Quantos casos de teste serao digitados? ");
        int x = sc.nextInt();

        int totalCobaias = 0;
        for (int i = 0; i < x; i++) {

            System.out.print("Quantidade de cobaias: ");
            int quantidadeCobaias = sc.nextInt();
            totalCobaias += quantidadeCobaias;

            System.out.print("Tipo de cobaia: ");
            char tipoCobaias = sc.next().charAt(0);

            if (tipoCobaias == 'C') {
                coelho += quantidadeCobaias;
            }
            else if (tipoCobaias == 'R') {
                rato += quantidadeCobaias;
            }
            else {
                sapo += quantidadeCobaias;
            }
        }

        percentualCoelho = coelho * 100 / (double) totalCobaias;
        percentualRato = rato * 100 / (double) totalCobaias;
        percentualSapo = sapo * 100 / (double) totalCobaias;

        System.out.println("\nRELATORIO FINAL:");
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.println("Percentual de coelhos: " + String.format("%.2f",percentualCoelho));
        System.out.println("Percentual de ratos: " + String.format("%.2f",percentualRato));
        System.out.println("Percentual de sapos: " + String.format("%.2f", percentualSapo));

        sc.close();
    }
}