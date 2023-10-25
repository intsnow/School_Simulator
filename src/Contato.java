public class Contato {
    private String nome, telefone;
    public Contato(String nome, String telefone){
        this.setNome(nome);
        this.setTelefone(telefone);
    }


    public void setNome(String nome){
        this.nome=nome;
    }

    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    public void displayInfo(){
        //System.out.println("\n\n-------------------------------------\n");
        //System.out.println("\n\tInfo de Contato/Responsavel");

        System.out.printf("\n\t\t-\tNome do contato:\t%s", nome);
        System.out.printf("\n\t\t-\tTelefone do contato:\t%s",telefone);

        //System.out.println("\n\n-------------------------------------\n");

    }

}
