Algoritmo "20220512_01_Soma_numeros"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Recebe dois números, inclui como parâmetro de função, soma via
// função e exibe o resultado
// Autor: Marcus Vieira
// Data atual: 12/05/2022

// Declaração de função
funcao soma (num1, num2: real): real
var
   // Declaração de variável
   res, num1, num2: real
inicio
   // Atribuição do valor de resultado da expressão matemática à variável soma
   res <- num1 + num2
   // Uso da  palavra-chave retorne para que o valor da variável soma seja
   // retornado externamente à função
   retorne res
fimfuncao

// Declaração de variável
Var
   resultado, numA, numB: real
Inicio
   // Exibição de mensagens pertinentes e scan do valor de input dado pelo
   // usuário com atribuição à variável pertinente
   escreva("Digite o primeiro número:")
   leia(numA)
   escreva("Digite o segundo número:")
   leia(numB)
   // Atribuição do valor de retorno da função soma à variável resultado
   resultado <- soma(numA, numB)
   // Exibição dos valores das variáveis numA, numB e resultado formatadamente
   escreval("A soma de", numA, " e", numB, " é:", resultado)
   
Fimalgoritmo