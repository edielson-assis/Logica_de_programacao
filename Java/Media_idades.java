import java.util.Scanner;

public class Media_idades {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as idades:");
        int idade = sc.nextInt();

        int soma = 0;
        int cont = 0;
        while (idade >= 0) {
            
            soma += idade;
            cont++; 

            idade = sc.nextInt();         
        }

        if (cont == 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        }
        else {
            double media = soma / (double) cont;
            System.out.printf("MEDIA = %.2f", media);
        }

        sc.close();
    }
}