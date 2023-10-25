import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Professor extends Pessoa implements Professor_Ministracao {
    private String rg, cpf, titulo;
    private List<Escola> escolas = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();
    private HashMap<Escola,List<Turma>> conjEscolas_Turmas = new HashMap<>();
    private Escola escolaDirigida;
    private boolean isDiretor;

    public Professor(int codigo, String nome, String telefone,String rg,
                 String cpf, List<Escola> escolas, List<Turma> turmas){
        super(codigo, nome, telefone);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setTitulo(titulo);
        this.setEscolas(escolas);
        this.setTurmas(turmas);
    }

    public Professor(Escola escolaDirigida, int codigo, String nome, String telefone,
                    String rg, String cpf, String titulo){
        super(codigo, nome, telefone);
        this.setEscolaDirigida(escolaDirigida);
    }

    public void setRg(String rg){
        this.rg=rg;
    }


    public void setCpf(String cpf){
        this.cpf=cpf;
    }


    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }


    public void setEscolas(List<Escola> escolas){
        this.escolas.addAll(escolas);
    }
    public void setEscolaDirigida(Escola escolaDirigida){
        this.escolaDirigida = escolaDirigida;
    }


    public void setIsDiretor(Escola escola){
        this.isDiretor = Boolean.TRUE;
        setEscolaDirigida(escola);
    }
    public void verificaIsDiretor()
    {

        if (isDiretor) {
            System.out.printf("\n\n\t-\tProfessor %s eh Diretor na escola %s",
                    getNome(), escolaDirigida.getNome());
        } else {
            System.out.printf("\n\n\t-\tProfessor %s nao exerce a funcao de Diretor.", getNome());
        }


    }


    public void setTurmas(List<Turma> turmas){
        this.turmas = turmas;
    }
    public void setConjEscolas_Turmas(Escola escola, List<Turma> turmas){
        conjEscolas_Turmas.put(escola, turmas);
    }
    public void displayTurmas_Ministradas()
    {
        final int[] i = {1};

        conjEscolas_Turmas.forEach((escola, turmas) ->
            {
                System.out.println("\n\n*\tCarregando ministracao de turmas por escola...");
                System.out.printf("\n\n\t\t*\t[%d].st Escola\t:",i[0]);
                System.out.printf("\n\n\t-\tNome_Escola:\t%s\t\t\n\t-\tcod:\t%d",  escola.getNome(), escola.getCodigo());
                System.out.println("\n\n\t---------------------------------");
                System.out.println("\n\n\n\t*\tTurmas registradas:\t:");

                for (Turma turma: turmas){
                    System.out.printf("\n\n\n\t\t**\tInfo_Turma [%d]\t:", i[0]);
                    System.out.printf("\n\t\t[%d]\t-\tNome_Turma:\t%s",turma.getCodigo(),turma.getNome());

                    i[0]++;
                }
                System.out.println("\n\n\t---------------------------------");
            }
        );


    }


}