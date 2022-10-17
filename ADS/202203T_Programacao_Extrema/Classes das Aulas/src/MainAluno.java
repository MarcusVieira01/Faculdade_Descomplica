public class MainAluno {
    //Declaração de classe principal
    public static void main(String[] args) {
        //Instanciamento de novo objeto advindo da classe Aluno, com atributos atribuídos, e seu tipo declarado como Aluno para tratamento posterior caso necessário
        AlunoClasses alunoInstanciado = new AlunoClasses("Marcus", "Vieira", 37);
        //Exibição do valor do atributo nome via retorno do método getter .getNome(arg) do objeto alunoInstanciado e concatenando com uma mensagem 
        System.out.println("O nome do aluno e: " + alunoInstanciado.getNome());
        //Alteração do valor do atributo nome via método setter .setNome(arg)
        alunoInstanciado.setNome("Pedro");
        //Exibição do valor do atributo nome via retorno do método getter .getNome(arg) do objeto alunoInstanciado e concatenando com uma mensagem 
        System.out.println("O nome do aluno e: " + alunoInstanciado.getNome());
    }
}
