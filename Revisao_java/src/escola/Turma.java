/**package escola;

import java.util.ArrayList;
import java.util.Date;

public class Turma {

    private String sigla;
    private int ano;

    private ArrayList<Aluno> alunos; //em uma turma pode ter vários alunos

    private ArrayList<Professor> professores; //uma turma pode ter vários professores

    private ArrayList<Disciplina> disciplinas; //em uma turma pode ter várias disciplinas

    public Turma(){
        alunos = new ArrayList<Aluno>();
    }


    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public int quantidadeAlunos(){
        return alunos.size();
    }

    public void excluirAluno(Aluno aluno)
    {
        alunos.remove(alunos);
    }

    //pegar todos os alunos da lista
    public Aluno getAluno(int posicao){
        return alunos.get(posicao);
    }

    public String getSigla(){
        return sigla;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

}
**/