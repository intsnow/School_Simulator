import java.util.List;

public class Cidade {
    private int codigo;
    private String nome;

    private List<Escola> escolas;

    public Cidade(int codigo, String nome){
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

    public void setEscolas(List<Escola> escolas){
        this.escolas.addAll(escolas);
    }
    public void getEscolas(){
        System.out.printf("\n\t Lista de escolas na cidade de %s",nome);
        int i =1;
        for (Escola escola: escolas){
            System.out.printf("\n\t\t [%d].st escola: ",i);
            escola.displayInfo();
            i += 1;
        }

    }
}
