Algoritmo "20220509_02_Produto_funcao_pratica"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Recebe dois n�meros, mutiplica-os via fun��o e exibe
// Autor: Marcus Vieira
// Data atual  : 09/05/2022

// Declara��o de fun��o que far� a multiplica��o de dois n�meros e retornara
// o valor
funcao mult :real
var
// Declara��o de vari�vel
aux:real
inicio
// Atribui��o do valor de resultado da express�o matem�tica ao valor da vari�vel
// prod
prod <- num1 * num2
// Retorno do valor da vari�vel prod
retorne prod
fimfuncao

Var
// Declara��o de vari�veis
num1, num2, prod, res: real

Inicio
// Solicita��o de input pelo usu�rio, via mensagens pertintes, e leitura do valor
// de input, com atribui��o desse valor �s vari�veis pertinentes
escreva("Digite o primeiro n�mero:")
leia(num1)
escreva("Digite o segundo n�mero:")
leia(num2)

// Chamada da fun��o mult e atribui��o do seu valor de retorno ao valor da
// vari�vel res
res <- mult
// Exibi��o formatada dos valores das vari�veis num1, num2, e res
escreval("O valor da multiplica��o entre", num1, " e", num2, " �", res)

Fimalgoritmo