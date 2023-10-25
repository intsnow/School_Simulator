import java.util.ArrayList;
import java.util.List;

public class Turma  {
    private int codigo;
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor prof;

    public Turma(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
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


    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }
    public void registraAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }
    public void displayAlunos()
    {
        for (Aluno aluno: alunos){
            System.out.printf("\n\t   .\t[%d]\t-\tNome:\t%s\t"
                    ,aluno.getCodigo() ,aluno.getNome());
        }
    }


    public void setProf(Professor prof){
        this.prof = prof;
    }
    public Professor getProf(){
        return prof;
    }

    public void displayInfo()
    {
        System.out.println("\n\n\t---------------------------------");

        System.out.println("\n*\tInfo da turma:\n");
        System.out.printf("\n\t-\tNome da Turma:\t%s", nome);
        System.out.printf("\n\t-\tCodigo da Turma:\t%d",codigo);

        System.out.printf("\n\n\t-\tProfessor responsavel:\t%s",prof.getNome());
        System.out.println("\n\n\t*\tLista de Alunos:");
        displayAlunos();

        System.out.println("\n\n\t---------------------------------");
    }
}

