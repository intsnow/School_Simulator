import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa{
    private String matricula, dataNasc;
    private Escola escola;
    private ArrayList<Contato> contatos;
    private ArrayList<Turma> turmas;

    public Aluno(int codigo, String nome, Cidade cidade, String telefone
                 , String matricula, String dataNasc, ArrayList<Contato> contatos)
    {
        super(codigo, nome, telefone);
        this.setDataNasc(dataNasc);
        this.setMatricula(matricula);
        this.setContatos(contatos);
    }

    public void setEscola(Escola escola){
        if (this.escola == null) {
            this.escola = escola;
        }
        else {
            int op;
            System.out.println("\n\tRematricular aluno em outra escola? \n\t\tSim -> 1\n\t\tNao -> 0");
            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();

            if (op == 1){
                this.escola = escola;
            } else {
                System.out.println("\n\t Cancelando registro de aluno...");
            }
        }
    }
    public void setTurma(ArrayList<Turma> turmas){
        this.turmas = turmas;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public void setDataNasc(String dataNasc){
        this.dataNasc=dataNasc;
    }

    public void setContatos(ArrayList<Contato> contatos){
        this.contatos = contatos;
    }

    public void displayContatos()
    {
        System.out.printf("\n\n\n*\tCarregando info de contato do aluno[%s]:\n",super.getNome());
        int i = 1;

        for (Contato contato: contatos){
            System.out.println("\n\n\t---------------------------------");
            System.out.printf("\n\n\t**\tContato [%d] :\n", i);
            contato.displayInfo();
            i++;
            System.out.println();
        }

        System.out.println("\n\n\t---------------------------------");
        //System.out.println("\n\n-------------------------------------\n");

    }

    public void displayInfo()
    {
        System.out.println("\n\n*************************************\n");
        System.out.println("\n*\tCarregando info de aluno: \n");

        System.out.println("\n\t---------------------------------");
        System.out.printf("\n\t-\tNome do Aluno:\t%s", super.getNome());
        System.out.printf("\n\t-\tCodigo Aluno:\t%d",super.getCodigo());
        System.out.printf("\n\t-\tCodigo Cidade:\t%d",super.getCidade().getCodigo());
        System.out.printf("\n\t-\tTelefone:\t%s",super.getTelefone());
        //System.out.printf("\n\t-\tCodigo Turma:\t%d",this.codTurma);
        System.out.printf("\n\t-\tMatricula:\t%s",this.matricula);
        System.out.printf("\n\t-\tData de Nascimento:\t%s",this.dataNasc);
        System.out.println("\n\n\t---------------------------------");

        displayContatos();
        System.out.println("\n\n*************************************\n");

    }

}
