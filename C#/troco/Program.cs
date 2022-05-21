using System;
using System.Globalization;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            double preco, dinheiro, total, troco;
            int quantidade;

            System.Console.Write("Preco unitario do produto: ");
            preco = double.Parse(Console.ReadLine(), CI);
            System.Console.Write("Quantidade comprada: ");
            quantidade = int.Parse(Console.ReadLine());

            total = preco * quantidade;

            System.Console.WriteLine("TOTAL = " + total.ToString("F2", CI));

            System.Console.Write("Dinheiro recebido: ");
            dinheiro = double.Parse(Console.ReadLine(), CI);

            troco = dinheiro - total;

            System.Console.WriteLine("TROCO = " + troco.ToString("F2", CI));
        }
    }
}