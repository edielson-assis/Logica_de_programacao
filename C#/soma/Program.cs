using System;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            int x, y, soma;

            System.Console.Write("Digite o valor de X: ");
            x = int.Parse(Console.ReadLine());
            System.Console.Write("Digite o valor de Y: ");
            y = int.Parse(Console.ReadLine());

            soma = x + y;

            System.Console.WriteLine("SOMA = " + soma);            
        }
    }
}