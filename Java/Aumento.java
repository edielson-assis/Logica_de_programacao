import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario, aumento;
        int porcentagem;

        System.out.print("Digite o salario da pessoa: ");
        salario = sc.nextDouble();
        
        if (salario <= 1000.00) { 
            aumento = salario * 0.20; 
            porcentagem = 20;
        }
        else if (salario <= 3000.00) {
            aumento = salario * 0.15;
            porcentagem = 15;
        }
        else if (salario <= 8000.00) {
            aumento = salario * 0.10;
            porcentagem = 10;
        }
        else {
            aumento = salario * 0.05;
            porcentagem = 5;
        }
    
        novoSalario = aumento + salario;

        System.out.printf("Novo Salario = R$ %.2f\n", novoSalario);
        System.out.printf("Aumento = R$ %.2f\n", aumento);
        System.out.println("Porcentagem = " + porcentagem + " %%");
      
        sc.close();
    }
}