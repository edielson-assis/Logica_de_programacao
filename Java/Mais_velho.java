import java.util.Scanner;

public class Mais_velho {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int x = sc.nextInt();

        int[] idades = new int[x];
        String[] nomes = new String[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int idade = 0;
        String nome = "";
        for (int i = 0; i < x; i++) {
            if (idades[i] > idade) {
                idade = idades[i];
                nome = nomes[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome);

        sc.close();
    }
}