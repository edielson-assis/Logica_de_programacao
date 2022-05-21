using System;
using System.Globalization;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;
            double largura, comprimento, valor, area, preco;

            System.Console.Write("Digite a largura do terreno: ");
            largura = double.Parse(Console.ReadLine(), CI);
            System.Console.Write("Digite o comprimento do terreno: ");
            comprimento = double.Parse(Console.ReadLine(), CI);
            System.Console.Write("Digite o valor do metro quadrado: ");
            valor = double.Parse(Console.ReadLine(), CI);

            area = largura * comprimento;
            preco = area * valor;

            System.Console.WriteLine("Area do terreno = " + area.ToString("F2", CI));
            System.Console.WriteLine("Preco do terreno = " + preco.ToString("F2", CI));

        }
    }
}