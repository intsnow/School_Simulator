import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cidade cidade1 = new Cidade(21, "Rio de Janeiro");
        Cidade cidade2 = new Cidade(31, "Minas Gerais");

        Escola escola1 = new Escola(101, "CMRJ", cidade1);
        Professor prof1 = new Professor(escola1, 1296,"Nevasca","21 98888-8888","12.345.342-6","123.432.567-2", "Mestre");
        List<Escola> escolas = new ArrayList<>();
        escola1.setDiretor(prof1);

        if (escola1.getDiretor() != null ){
            escola1.getDiretor().verificaIsDiretor();
        }

        Escola escola2 = new Escola(152, "Cefet-RJ", prof1,  cidade1);
        Escola escola3 = new Escola(63, "CCP2 - MG", prof1,  cidade2);
        escolas.add(escola1);
        escolas.add(escola2);
        escolas.add(escola3);


        List<Turma> turmas = new ArrayList<>();
        Turma turma1 = new Turma(103, "ESPECX");
        Turma turma2 = new Turma(203, "Quimica");
        Turma turma3 = new Turma(303, "Ime / Ita");
        turmas.add(turma1);
        turmas.add(turma2);
        turmas.add(turma3);
        //turma1.displayInfo();

        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        Disciplina discp1 = new Disciplina(1, "Portugues");
        disciplinas.add(discp1);
        //discp1.displayInfo();

        Contato contato1 = new Contato("Solange das Neves", "21 88212167");
        Contato contato2 = new Contato("Rubens da Silva", "21 88212167");
        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(contato1);
        contatos.add(contato2);

        ArrayList<Aluno> alunos = new ArrayList<>();

        //  tirar cidade de aluno, pois pessoa ja carrega e cidade ja vem de escola

        Aluno aluno1 = new Aluno(7473,"Neves",cidade1,"21 9 8285-1405", "7473","13/08/1998", contatos);
        alunos.add(aluno1);
        //aluno1.displayInfo();

        List<Professor> professores = new ArrayList<>();
        prof1.setTurmas(turmas);
        Professor prof2 = new Professor(1296,"HellsFirety","21 95367-1256","76.231.567-6","315.697.143-2",escolas, turmas);
        professores.add(prof1);
        professores.add(prof2);
        prof1.verificaIsDiretor();
        escola1.setDiretor(prof2);


        turma1.setAlunos(alunos);
        turma1.setProf(prof1);
        turma1.displayInfo();
        turma1.registraAluno(new Aluno(6556, "Amanda de Souza",cidade2,"21 4444-4444", "5665","05/05/1992",contatos));
        turma1.displayInfo();

        List<Turma> conjunto = new ArrayList<>();
        conjunto.add(turma2);
        conjunto.add(turma3);
        prof1.setConjEscolas_Turmas(escola1, conjunto);
        //prof1.displayTurmas_Ministradas();

        escola1.setProfessores(professores);
        //escola1.setDiretor(prof1);
        escola1.setTurmas(turmas);
        escola1.setDisciplinas(disciplinas);
        escola1.setAlunos(alunos);
        escola1.registra_Aluno_Turmas(aluno1,turmas);
        //escola1.displayInfo();
        //escola1.displayTurmas();





    }
}