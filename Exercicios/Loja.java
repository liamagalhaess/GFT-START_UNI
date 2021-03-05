package com.company;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        setNome(nome);
        setCnpj(cnpj);
        setLivros(livros);
        setVideoGames(videoGames);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if(!livros.isEmpty()){
            for (Livro livro : livros) {
                System.out.printf("Nome: " + livro.getNome() + "\nAutor: " + livro.getAutor() + "\nTema: "
                        + livro.getTema() + "\nQuantidade páginas: " + livro.getQtdPag() + "\nPreço: "
                        + livro.getPreco() + "\n\n");
            }
        } else{
            System.out.println("A loja não tem livros no seu estoque.");
        }
    }

    // listaVideoGames() -> todos os videos games que a loja tem
    public void listaVideoGames() {
        if (!videoGames.isEmpty()) {
            for (VideoGame game : videoGames) {
                System.out.printf("Nome: " + game.getNome() + "\nPreço: " + game.getPreco() + "\nMarca: " + game.getMarca() + "\nModelo: " + game.getModelo() + "\nUsado: " + game.isUsado() + "\n\n");
            }
        } else {
            System.out.println("A loja não tem video games no seu estoque.");
        }
    }

    // calculaPatrimonio() -> soma o (preco * qtd) de todos os produtos da loja e retorna o valor
    public double calculaPatrimonio() {
        double resultado = 0.0;

        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                resultado += (livro.getPreco() * livro.getQtd());
            }
        }

        if (!videoGames.isEmpty()) {
            for (VideoGame game : videoGames) {
                resultado += (game.getPreco() * game.getQtd());
            }
        }

        return resultado;
    }

}
