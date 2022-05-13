//Programa que exibirá o nome completo, curso, idade, gênero e peso
//Nome classe
class exibeDados{

	//Módulo principal de execução
	public static void main (String entrada[]){
		//Declaração de variáveis
		String nomeCompleto, curso;
		int idade;
		char genero;
		double peso;

		//Atribuição de valor de inicialização nas variáveis
		nomeCompleto = "Marcus Vieira";
		curso = "Analise e Desenvolvimento de Sistemas";
		idade = 36;
		genero = 'M';
		peso = 128.5; 

		//Exibição formatada dos valores das variáveis
		System.out.println("Meu nome é " + nomeCompleto);
		System.out.println("Meu curso é " + curso);
		System.out.println("Minha idade é " + idade);
		System.out.println("Meu gênero é " + genero);
		System.out.println("Meu peso é " + peso + "kg");
		
		//Método que seu fará o encerramento do programa
		System.exit(0);
	}
}