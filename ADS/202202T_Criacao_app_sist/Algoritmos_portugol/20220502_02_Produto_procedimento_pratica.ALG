Algoritmo "20220502_02_Produto_procedimento_pratica"
// Cria��o de aplica��es e sistemas
// Lucy Mari
// Descri��o: Aqui voc� descreve o que o programa faz! (fun��o)
// Autor: Marcus Vieira
// Data atual: 02/05/2022

// Declara��o de procedimento que far� a multiplica��o de dois n�meros e
// exibir� o resultado no terminal
procedimento produto
var
// Declara��ode vari�vel local
prod: real
inicio
// Atribui��o do valor de resultado ao valor da vari�vel prod
prod <- num1 * num2
// Exibi��o no terminal do valor da vari�vel prod, formatado
escreval("O produto entre", num1, " e", num2, " �:", prod)
fimprocedimento

Var
// Declara��o de vari�veis globais
num1, num2: real

Inicio
// Exibi��o de mensagens pertinentes e aquisi��o do input de teclado para as
// vari�veis num1 e num2
escreva("Digite o primeiro n�mero:")
leia(num1)
escreva("Digite o segundo n�mero:")
leia(num2)
// Chamada do procedimento produto
produto

Fimalgoritmo