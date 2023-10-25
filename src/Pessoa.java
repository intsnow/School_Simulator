public abstract class Pessoa {
    private int codigo;
    private String nome, telefone;
    private Cidade cidade;

    public Pessoa(int codigo, String nome, String telefone){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setCidade(cidade);
        this.setTelefone(telefone);
    }


    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }


    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }


    public void setCidade(Cidade cidade){
        this.cidade=cidade;
    }
    public Cidade getCidade(){
        return cidade;
    }

}
