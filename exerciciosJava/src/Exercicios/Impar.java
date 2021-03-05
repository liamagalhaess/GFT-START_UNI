/**package Exercicios;
import System;
import System.Collections.Generic;
import System.Linq;
import System.Text;
import System.Threading.Tasks;

public class Impar {
    private int _inicial;
    public int Inicial
    {
        get { return _inicial; }
        set {
        if (value > 0)
        {
            _inicial = value;
        }
        else
        {
            _inicial = 0;
        }
    }
    }

    private int _final;
    public int Final
    {
        get { return _final; }
        set {
        if (value > this.Inicial)
        {
            _final = value;
        }
        else
        {
            _final = 0;
        }
    }
    }

    public void Imprimiralores()
    {
        for (int i = this.Inicial; i <= this.Final; i++)
        {
            if (i % 2 != 0)
            {
                Console.Write(" " + i);
            }
        }
    }
}
*/