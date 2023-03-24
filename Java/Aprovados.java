import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int x = sc.nextInt();

        String[] nomes = new String[x];
        double[] nota1 = new double[x];
        double[] nota2 = new double[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < x; i++) {
            if ((nota1[i] + nota2[i]) / 2 >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}