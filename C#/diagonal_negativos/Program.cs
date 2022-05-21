using System;
using System.Globalization;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            int N, i, j, negativos;

            System.Console.Write("Qual a ordem da matriz : ");
            N = int.Parse(Console.ReadLine());

           int[,] mat = new int[N, N];

            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    System.Console.Write("Elemento [" + i + "," + j + "]:");
                    mat[i, j] = int.Parse(Console.ReadLine());
                }
            }

            System.Console.WriteLine("DIAGONAL PRINCIPAL: ");
            for (i = 0; i < N; i++) {
                System.Console.Write(mat[i, i] + " ");
            }

            negativos =0;
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    if (mat[i, j] < 0) {
                        negativos++;
                    }
                }
            }

            System.Console.WriteLine("\nQUANTIDADE DE NEGATIVOS = " + negativos);
        }
    }
}