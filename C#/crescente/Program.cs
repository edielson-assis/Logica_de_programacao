using System;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            int x, y;

            System.Console.WriteLine("Digite dois numeros: ");
            x = int.Parse(Console.ReadLine());
            y = int.Parse(Console.ReadLine());

            while (x != y) {
                if (x < y) {
                    System.Console.WriteLine("CRESCENTE!");
                }
                else {
                    System.Console.WriteLine("DECRESCENTE!");
                }

                System.Console.WriteLine("Digite outros dois numeros:");
                x = int.Parse(Console.ReadLine());
                y = int.Parse(Console.ReadLine());
            }
        }
    }
}