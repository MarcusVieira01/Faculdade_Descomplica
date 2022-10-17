import java.util.List;

public class Aula {
    //Declaração de atributos privados gerando relacionamento de composição com as classes Professor e Aluno
    private Professor professor;
    private List<Aluno> alunos;

    //Declaração de construtor manual
    public Aula (Professor professor, List<Aluno> alunos){
        this.professor = professor;
        this.alunos = alunos;
    }

    //Declaração de getter e setter manual
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
        
    //Declaração de método manual
    public void acontecer(){
        //Declaração de loop for que em cada iteração de cada elemento contido no atributo aluno, será exibida mensagem concatenada pertinente com o valor do elemento nome contido no objeto Professor
        for(Aluno aluno : this.alunos){
            System.out.println("Professor " + this.professor.nome + " explica para " + aluno.nome);
        }
    }    
}
