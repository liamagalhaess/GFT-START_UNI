/**package Exercicios;

import System;
import System.Text;
import System.Threading.Tasks;
import System.Collections.Generic;
import System.Linq;
import java.io.Console;

class Programa
{
    static void Main(string[] args)
    {
        ValoresImpares valores = new ValoresImpares();

        Console.WriteLine("Insira o primeiro valor: ");
        valores.Inicial = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Insira o último valor: ");
        valores.Final = Convert.ToInt32(Console.ReadLine());

        valores.Imprimiralores();

        Console.ReadKey();
    }
}
}
**/