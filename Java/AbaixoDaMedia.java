import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int x = sc.nextInt();

        double[] elementos = new double[x];

        double cont = 0;
        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Digite um numero: ");
            elementos[i] = sc.nextDouble();
            cont += elementos[i];
        }

        double media = cont / x;
        System.out.print("\nMEDIA DO VETOR = " + String.format("%.3f", media));

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < elementos.length; i ++) {
            if (elementos[i] < media) {
                System.out.println(elementos[i]);
            }
        }

        sc.close();
    }
}