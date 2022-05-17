Algoritmo "20220506_01_Multiplica_com_parametros"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita dois números ao usuário, realiza a multiplicação deles
// via procedimento com parâmetro e exibe a resposta
// Autor: Marcus Vieira
// Data atual: 06/05/2022

// Declaração de procedimento com parâmetro que fará a multiplicação entre
// dois números
procedimento multi(num1, num2:Real)
var
// Declaração de variável
aux:Real
inicio
//
aux <- num1 * num2
res <- aux
fimprocedimento

Var
// Declaração de variáveis
inp1, inp2, res:Real

Inicio
// Exibição de mensagem solicitando input e armazenando nas variáveis inp1 e
// inp2
escreva("Digite o primeiro número:")
leia(inp1)
escreva("Digite o segundo número:")
leia(inp2)
// Chamada do procedimento com parâmetros
multi(inp1, inp2)
// Exibição dos valores das variáveis inp1, inp2 e res formatadamente
escreval("O resultado da multiplicação entre", inp1, " e", inp2, " é", res)

Fimalgoritmo