﻿using System;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            int x, y, troca, soma;
            
            System.Console.WriteLine("Digite dois numeros:");
            x = int.Parse(Console.ReadLine());
            y = int.Parse(Console.ReadLine());

            if (x > y) {
                troca = x;
                x = y;
                y = troca;
            }

            soma = 0;
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0) {
                    soma = soma + i;
                }
            }

             System.Console.WriteLine("SOMA DOS IMPARES = " + soma);
        }
    }
}