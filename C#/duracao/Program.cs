using System;

namespace Programa {
    class Program {
        static void Main(string[] args) {
            
          int duracao, horas, minutos, segundos, resto;

          System.Console.Write("Digite a duracao em segundos: ");
          duracao = int.Parse(Console.ReadLine());

          horas = duracao / 3600;
          resto = duracao % 3600;
          minutos = resto / 60;
          segundos = resto % 60;

          System.Console.WriteLine(horas + ":" + minutos + ":" + segundos);
        }
    }
}