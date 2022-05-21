using System;
using System.Globalization;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            int distancia;
            double combustivel, consumo;

            System.Console.Write("Distancia percorrida: ");
            distancia = int.Parse(Console.ReadLine());
            System.Console.Write("Combustivel gasto: ");
            combustivel = double.Parse(Console.ReadLine(), CI);

            consumo = distancia / combustivel;

            System.Console.WriteLine("Consumo medio = " + consumo.ToString("F3", CI));
        }
    }
}