Algoritmo "20220502_01_Produto_procedimento"
// Criação de aplicações e sistemas
// Lucy Mari
// Descrição: Aqui você descreve o que o programa faz! (função)
// Autor: Marcus Vieira
// Data atual: 02/05/2022

// Declaração de procedimento que fará a multiplicação de dois números e
// exibirá o resultado no terminal
procedimento produto
var
// Declaraçãode variável local
prod: real
inicio
// Atribuição do valor de resultado ao valor da variável prod
prod <- num1 * num2
// Exibição no terminal do valor da variável prod, formatado
escreval("O produto entre", num1, " e", num2, " é:", prod)
fimprocedimento

Var
// Declaração de variáveis globais
num1, num2: real

Inicio
// Exibição de mensagens pertinentes e aquisição do input de teclado para as
// variáveis num1 e num2
escreva("Digite o primeiro número:")
leia(num1)
escreva("Digite o segundo número:")
leia(num2)
// Chamada do procedimento produto
produto

Fimalgoritmo