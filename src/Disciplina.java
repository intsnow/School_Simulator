import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int codigo;
    private String nome;

    public Disciplina(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
    }
    public Disciplina(int codigo, String nome, Escola escola){
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



    public void displayInfo()
    {
        //System.out.println("\n\n*************************************\n");
        System.out.println("\n\n\t---------------------------------");

        System.out.println("\n\t**\tInfo da Disciplina:");
        System.out.printf("\n\t-\tNome da Disciplina: %s", nome);
        System.out.printf("\n\t-\tCodigo da Disciplina: %d",codigo);

        System.out.println("\n\n\t---------------------------------");
        //System.out.println("\n\n*************************************\n");
    }

}
