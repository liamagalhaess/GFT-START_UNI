/**package com.company;

import escola.Aluno;
import escola.Disciplina;
import escola.Turma;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Turma turma1 = new Turma(); // instanciar/criar um objeto
        turma1.setSigla("LPOO");
        turma1.setAno(1);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ana");
        aluno1.setMatricula(1);
        aluno1.getDataNascimento(new Date());
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);

        //System.out.println("Alguma coisa");

        for(i=0; i<turma1.quantidadeAlunos(); i++){ //mostrar nome dos alunos
            System.out.println(turma1.getAluno(i).getNome());
        }

    }
}
**/