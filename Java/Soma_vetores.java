import java.util.Scanner;

public class Soma_vetores {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int x = sc.nextInt();
        
        int[] A = new int[x];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < A.length; i ++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[x];

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < B.length; i ++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[x];

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < C.length; i ++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        sc.close();
    }
}