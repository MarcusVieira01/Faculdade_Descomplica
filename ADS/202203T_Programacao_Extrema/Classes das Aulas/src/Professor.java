public class Professor {
    //Declaração de atributos publicos
    public String nome;
    public String sobreNome;

    //Declaração de construtor
    public Professor(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    //Declaração de getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    //Declaração de método manual que, exibirá a mensagem pertinente concatenada com o valor do argumento inserido
    public void explicar(String assunto){
        System.out.println("Explicando: " + assunto);
    }
}
