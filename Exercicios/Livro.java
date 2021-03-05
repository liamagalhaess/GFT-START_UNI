package com.company;

    public class Livro extends Produto implements Imposto {

        private String autor;
        private String tema;
        private int qtdPag;

        Livro() {
        }

        Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
            super(nome, preco, qtd);
            this.autor = autor;
            this.tema = tema;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getTema() {
            return tema;
        }

        public void setTema(String tema) {
            this.tema = tema;
        }

        public int getQtdPag() {
            return qtdPag;
        }

        public void setQtdPag(int qtdPag) {
            if (qtdPag > 0) {
                this.qtdPag = qtdPag;
            }
        }

        @Override
        public double calculaImposto() {
            if(tema.equals("educativo")){  // não cobrar imposto
                return 0;
            } else{ // 10% sobre o preço do livro
                return getPreco() * 0.1;
            }
        }
    }
}
