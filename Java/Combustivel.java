import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        int combustivel = sc.nextInt();

        while (combustivel != 4) {

            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            combustivel = sc.nextInt();

            switch (combustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;
            }
        }

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}