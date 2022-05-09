Algoritmo "20220509_01_Produto_funcao"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Recebe dois números, mutiplica-os via função e exibe
// Autor: Marcus Vieira
// Data atual  : 09/05/2022

// Declaração de função que fará a multiplicação de dois números e retornara
// o valor
funcao mult :real
var
// Declaração de variável
aux:real
inicio
// Atribuição do valor de resultado da expressão matemática ao valor da variável
// prod
prod <- num1 * num2
retorne prod
fimfuncao

Var
// Declaração de variáveis
num1, num2, prod, res: real

Inicio
// Atribuição ao valor das variáveis os valores de inicialização
num1 <- 5
num2 <- 6

// Chamada da função mult e atribuição do seu valor de retorno ao valor da
// variável res
res <- mult
// Exibição formatada dos valores das variáveis num1, num2, e res
escreval("O valor da multiplicação entre", num1, " e", num2, " é", res)

Fimalgoritmo