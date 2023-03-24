import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int x = sc.nextInt();

        String[] menores = new String[x];

        double alturaMedia = 0.0, porcentagem = 0.0;
        for (int i = 1; i <= x; i++) {
            System.out.println("Dados da " + i + "a pessoa");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Alturas: ");
            double altura = sc.nextDouble();

            if (idade < 16) {
                menores[i] = nome;
                porcentagem++;
            }

            alturaMedia += altura;
        }

        alturaMedia = alturaMedia / x;
        porcentagem = porcentagem * 100 / x;

        System.out.println("\nAltura media: " + String.format("%.2f", alturaMedia));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
        
        for (int i = 0; i < x; i++) {
            if (menores[i] != null) {
                System.out.println(menores[i]);
            }
        }

        sc.close();
    }
}