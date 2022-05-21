using System;
using System.Globalization;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;
            String nome;
            double valorHora, pagamento;
            int horasTrabalhadas;

            System.Console.Write("Nome: ");
            nome = Console.ReadLine();
            System.Console.Write("Valor por hora: ");
            valorHora = double.Parse(Console.ReadLine(), CI);
            System.Console.Write("Horas trabalhadas: ");
            horasTrabalhadas = int.Parse(Console.ReadLine());

            pagamento = horasTrabalhadas * valorHora;

            System.Console.WriteLine("O pagamento para " + nome + " deve ser " + pagamento.ToString("F2", CI));
        }
    }
}