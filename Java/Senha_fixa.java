import java.util.Scanner;

public class Senha_fixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2312) {
            System.out.print("Senha Invalida! Tente novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}