public class AlunoClasses {
    //Declaração de atributos privados
    private String nome;
    private String sobrenome;
    private Integer idade;

    //Declaração de método construtor
    public AlunoClasses(String nome, String sobrenome, Integer idade){
        //Uso da keyword this que fará referência ao objeto instanciado para atribuição dos valores dos atributos. Chamada autoreferenciação
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    //Declaração de métodos getter e setter cia ctrl + .
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
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    
    

    
}
