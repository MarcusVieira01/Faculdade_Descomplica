import java.util.ArrayList;
import java.util.List;

public class MainAulaAlunoProfessor {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciamento de dois objetos advindos da classe Aluno, via construtor
        Aluno aluno1 = new Aluno("Marcus", "Vieira");
        Aluno aluno2 = new Aluno("Vanessa", "Vieira");

        //Uso da interface List que instanciará novo objeto List, do tipo Aluno, via construtor ArrayList do tipo Aluno. Os tipos devem ser coerentes
        List<Aluno> alunos = new ArrayList<Aluno>();

        //Uso de método add(arg) que incluirá aos elementos as referências contidas nas variáveis aluno1 e aluno2 
        alunos.add(aluno1);
        alunos.add(aluno2);

        //Instanciamento de objeto advindo da classe Professor, via construtor
        Professor professor = new Professor("Zuleika", "Silva");

        //Instanciamento de objeto advindo da classe Aula, via construtor
        Aula aula = new Aula(professor, alunos);

        //Evocação de método do objeto aula
        aula.acontecer();
    }
}
