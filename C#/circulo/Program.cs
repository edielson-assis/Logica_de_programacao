using System;
using System.Globalization;

namespace Programa {
    class Programa {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;
            double area;

            System.Console.Write("Digite o valor do raio do circulo: ");
            area = double.Parse(Console.ReadLine(), CI);

            area  = Math.Pow(area, 2) * Math.PI;

            System.Console.WriteLine("AREA = " + area.ToString("F3", CI));            
        }
    }
}