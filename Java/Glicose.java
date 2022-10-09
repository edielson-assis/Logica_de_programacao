import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double medida;

        System.out.print("Digite a medida da glicose: ");
        medida = sc.nextDouble();

        if (medida <= 100) {
            System.out.println("Normal");
        } else if (medida <= 140) {
            System.out.println("Elevado");
        } else {
            System.out.println("Diabetes");
        }

        sc.close();

    }
}