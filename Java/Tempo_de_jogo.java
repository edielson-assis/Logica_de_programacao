import java.util.Scanner;

public class Tempo_de_jogo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.print("Hora Inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora Final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}