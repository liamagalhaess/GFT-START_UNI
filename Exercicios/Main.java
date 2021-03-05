package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Trono de Vidro", 40.0, 50, "Sarah J Mass", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Anéis", 60.0, 30, "J. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500);

        VideoGame ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000.0, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500.0, 500, "Microsoft", "One", false);

        //inicializa uma lista de livros
        List<Livro> livros = new ArrayList<>();
        livros.add(l1);// adicina livro 1
        livros.add(l2);//adiciona livro 2
        livros.add(l3);// adiciona livro 3

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja americanas = new Loja("Americanas", "123456", livros, games);

        System.out.println("Cálculo de imposto");
        System.out.println(l2.calculaImposto());
        System.out.println(l3.calculaImposto());
        System.out.println(ps4Usado.calculaImposto());
        System.out.println(ps4.calculaImposto());


        //System.out.println("------------- Testando métodos listaLivros e listaVideoGames -----------");
        americanas.listaLivros();
        americanas.listaVideoGames();
        System.out.printf("--------- Fim dos testes dos métodos listaLivros e listaVideoGames ------\n");

       // System.out.println("Testando método calculaPatrimonio");
        System.out.println("O patrimônio da loja " + americanas.getNome() + " é igual a R$ " + americanas.calculaPatrimonio());
        System.out.println("----------------------------- Fim do teste------------------------------");
    }
}




