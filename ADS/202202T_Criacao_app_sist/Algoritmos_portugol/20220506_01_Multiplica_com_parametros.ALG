Algoritmo "20220506_01_Multiplica_com_parametros"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Solicita dois n�meros ao usu�rio, realiza a multiplica��o deles
// via procedimento com par�metro e exibe a resposta
// Autor: Marcus Vieira
// Data atual: 06/05/2022

// Declara��o de procedimento com par�metro que far� a multiplica��o entre
// dois n�meros
procedimento multi(num1, num2:Real)
var
// Declara��o de vari�vel
aux:Real
inicio
//
aux <- num1 * num2
res <- aux
fimprocedimento

Var
// Declara��o de vari�veis
inp1, inp2, res:Real

Inicio
// Exibi��o de mensagem solicitando input e armazenando nas vari�veis inp1 e
// inp2
escreva("Digite o primeiro n�mero:")
leia(inp1)
escreva("Digite o segundo n�mero:")
leia(inp2)
// Chamada do procedimento com par�metros
multi(inp1, inp2)
// Exibi��o dos valores das vari�veis inp1, inp2 e res formatadamente
escreval("O resultado da multiplica��o entre", inp1, " e", inp2, " �", res)

Fimalgoritmo