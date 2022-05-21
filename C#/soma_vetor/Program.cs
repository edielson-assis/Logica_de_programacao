using System;
using System.Globalization;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            double soma, media;
            int N, i;

            System.Console.Write("Quantos numeros voce vai digitar: ");
            N = int.Parse(Console.ReadLine());

            double[] vet = new double[N];

            for (i = 0; i < N; i++) {
                System.Console.Write("Digite um numero: ");
                vet[i] = double.Parse(Console.ReadLine(), CI);
            }

            System.Console.Write("\nVALORES = ");
            for (i = 0; i < N; i++) {
                System.Console.Write(vet[i].ToString("F1", CI) + "  ");
            }

            soma = 0;
            for (i = 0; i < N; i++) {
                soma = soma + vet[i];
            }

            System.Console.Write("\nSOMA = " + soma.ToString("F2", CI));

            media = soma / N;
            System.Console.Write("\nMEDIA = " + media.ToString("F2", CI));
        }
    }
}