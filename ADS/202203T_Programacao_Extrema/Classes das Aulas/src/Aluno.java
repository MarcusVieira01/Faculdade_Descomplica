public class Aluno {
    //Declaração de atributos publicos
    public String nome;
    public String sobrenome;

    //Declaração de construtor
    public Aluno(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Declaração de métodos getter e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Declaração de método que receberá um argumento e exibirá seu valor concatenando com a mensagem pertinente
    public void fazerExercicio(String exercicio){
        System.out.println("Fazendo exercício " + exercicio);
    }
}
