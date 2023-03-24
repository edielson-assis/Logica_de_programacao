import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valorHora, pagamento;
        int horasTrabalhadas;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        pagamento = valorHora * horasTrabalhadas;

        System.out.print("O pagamento para " + nome + " deve ser " + String.format("%.2f",pagamento));

        sc.close();
    }
}