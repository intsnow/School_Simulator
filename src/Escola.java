import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Escola {
    private int codigo;
    private String nome;

    private List<Professor> professores = new ArrayList<>();
    private boolean dirigida = false;
    private Professor diretor;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private Cidade cidade;

    public Escola(int codigo, String nome, Cidade cidade){
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setCidade(cidade);
        this.setDiretor(diretor);
    }
    public Escola(int codigo, String nome, Professor diretor, Cidade cidade){
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setCidade(cidade);
        this.setDiretor(diretor);
    }
    public Escola(int codigo, String nome, Professor diretor, Cidade cidade, List<Aluno> alunos, List<Turma> turmas, List<Disciplina> disciplinas){
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setAlunos(alunos);
        this.setCidade(cidade);
        this.setTurmas(turmas);
        this.setDisciplinas(disciplinas);
        this.setDiretor(diretor);
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }


    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }


    public void setProfessores(List<Professor> professores){
        this.professores = professores;
    }

    public void setDiretor(Professor diretor){

        if (!dirigida){
            dirigida = true;
            this.diretor = diretor;
            //this.diretor.setIsDiretor(this);
        }
        else {
            Scanner scan = new Scanner(System.in);
            int op;
            System.out.printf("""
                    \n\t-\tDefinir funcao de diretor escolar para professor %s ?
                    
                    \t[1]\t-\tSIM
                    \t[2]\t-\tNAO
                    """, diretor.getNome());
            op = scan.nextInt();

            if (op == 1){
                this.diretor = diretor;
            } else {
                System.out.println("\n\n\t-\tCancelando atualizacao de direcao...");
            }

        }
    }
    public Professor getDiretor(){
        if (diretor != null) {
            return diretor;
        }
        else return  null;
    }
    public void verificaDiretor()
    {
        if (dirigida) {
            System.out.printf("\n\n\t-\tDiretor da escola %s:\t%s",
                    nome, diretor.getNome());
        }
    }


    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }
    public void registra_Aluno_Turmas(Aluno aluno, List<Turma> turmas)
    {
        for (Turma turma: turmas){
            turma.registraAluno(aluno);
        }
    }

    public void displayAlunos()
    {
        int i = 1;
        for (Aluno aluno: alunos){
            System.out.printf("\n\n\t[%d]\t-\tAluno:\t%s",
                    aluno.getCodigo(), aluno.getNome());
            i += 1;
        }
    }


    public void setCidade(Cidade cidade){
        this.cidade=cidade;
    }
    public Cidade getCidade(){
        return cidade;
    }


    public void setTurmas(List<Turma> turmas){
        this.turmas.addAll(turmas);
    }
    public List<Turma> getTurmas(){
        return turmas;
    }

    public void addTurma(Turma turma)
    {
        if (!turmas.contains(turma)){
            turmas.add(turma);
        } else {
            System.out.printf("\n\tERRO! Turma [%d] ja registrada...",turma.getCodigo());
        }
    }
    public void displayTurmas()
    {
        int i = 1;
        for (Turma turma: turmas){
            System.out.printf("\n\n\t\t[%d].st turma: ", i);
            turma.displayInfo();
            i += 1;
        }
    }


    public void setDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas.addAll(disciplinas);
    }
    public void displayDisciplinas()
    {
        int i = 1;

        for (Disciplina disciplina: disciplinas){
            System.out.printf("\n\n\n\t\t[%d].st disciplina:", i);
            disciplina.displayInfo();
            i += 1;
        }

    }


    public void displayInfo()
    {
        System.out.println("\n\n*************************************\n");

        System.out.println("\n\n*\tInfo de Escola:");
        System.out.printf("\n\t-\tNome da Escola: %s", nome);
        System.out.printf("\n\t-\tCodigo da Escola: %d",codigo);

        System.out.println("\n\n\n*\tAlunos registrados:");
        this.displayAlunos();

        System.out.print("\n\n\n*\tDisciplinas registradas da Escola: ");
        this.displayDisciplinas();

        System.out.println("\n\n*\tTurmas registradas da Escola: ");
        this.displayTurmas();

        System.out.println("\n\n*************************************\n");

    }
}
