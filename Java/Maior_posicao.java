import java.util.Scanner;

public class Maior_posicao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto numeros voce vai digitar? ");
        int x = sc.nextInt();

        double[] elementos = new double[x];

        for (int i = 0; i < elementos.length; i ++) {
            System.out.print("Digite um numero: ");
            elementos[i] = sc.nextDouble();
        }

        double maiorValor = 0; 
        int posicao = 0;
        for (int i = 0; i < elementos.length; i ++) {
            if (elementos[i] >  maiorValor) {
                maiorValor = elementos[i];
                posicao = i;
            }
        }

        System.out.println("\nMAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}