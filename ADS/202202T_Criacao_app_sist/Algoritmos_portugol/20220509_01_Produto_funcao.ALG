Algoritmo "20220509_01_Produto_funcao"
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
retorne prod
fimfuncao

Var
// Declara��o de vari�veis
num1, num2, prod, res: real

Inicio
// Atribui��o ao valor das vari�veis os valores de inicializa��o
num1 <- 5
num2 <- 6

// Chamada da fun��o mult e atribui��o do seu valor de retorno ao valor da
// vari�vel res
res <- mult
// Exibi��o formatada dos valores das vari�veis num1, num2, e res
escreval("O valor da multiplica��o entre", num1, " e", num2, " �", res)

Fimalgoritmo