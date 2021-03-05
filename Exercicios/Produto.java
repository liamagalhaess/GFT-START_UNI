package com.company;

public abstract class Produto {

    private String nome;
    private double preco;
    private int qtd;

    Produto() {
    }

    Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        setPreco(preco);
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if (qtd > 0) {
            this.qtd = qtd;
        }
    }
}
