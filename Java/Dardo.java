import java.util.Locale;
import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double medida1, medida2, medida3, maior;

        System.out.println("Digite as tres distancias:");
        medida1 = sc.nextDouble();
        medida2 = sc.nextDouble();
        medida3 = sc.nextDouble();

        if (medida1 > medida2 && medida1 > medida3) {
            maior = medida1;
        }
        else if (medida2 > medida3) {
            maior = medida2;
        }
        else {
            maior = medida3;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f", maior);

        sc.close();
    }
}