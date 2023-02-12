import java.util.Scanner;

public class Validacao_de_nota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota1 = sc.nextDouble();
        }

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota2 = sc.nextDouble();
        }

        double media = (nota1 + nota2) / 2.0;

        System.out.println("MEDIA = " + String.format("%.2f", media));

        sc.close();
    }
}