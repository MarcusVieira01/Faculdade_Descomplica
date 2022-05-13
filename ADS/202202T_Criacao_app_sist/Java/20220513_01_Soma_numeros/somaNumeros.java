//Programa de exemplo da aula sobre Java
//Nome classe
class somaNumeros{

	//Módulo principal de execução
	public static void main (String entrada[]){

		//Declaração de variáveis
		int n1, n2, soma;
		//Atribuição de valor de retorno do método Integer.parseInt(args) que fará a conversão de 
		// String para Int
		n1 = Integer.parseInt(entrada[0]);
		n2 = Integer.parseInt(entrada[1]);
		//Atribuição do valor de resultado da expressão matemática
		soma = n1 + n2;
		//Exibição dos valores das variáveis n1, n2 e soma formatadamente
		System.out.println(n1 + " + " + n2 + " = " + soma);
		//Método que seu fará o encerramento do programa
		System.exit(0);
	}
}