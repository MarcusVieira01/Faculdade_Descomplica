Algoritmo "20220512_02_Mult_numeros_pratica"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Recebe dois números, inclui como parâmetro de função, multiplica
// via função e exibe o resultado
// Autor: Marcus Vieira
// Data atual: 12/05/2022

// Declaração de função
funcao mult (num1, num2: real): real
var
   // Declaração de variável
   res: real
inicio
   // Atribuição do valor de resultado da expressão matemática à variável res
   res <- num1 * num2
   // Uso da  palavra-chave retorne para que o valor da variável res seja
   // retornado externamente à função
   retorne res
fimfuncao

// Declaração de variáveis
Var
   resultado, numA, numB: real
Inicio
   // Exibição de mensagens pertinentes e scan do valor de input dado pelo
   // usuário com atribuição à variável pertinente
   escreva("Digite o primeiro número:")
   leia(numA)
   escreva("Digite o segundo número:")
   leia(numB)
   // Atribuição do valor de retorno da função mult à variável resultado
   resultado <- mult(numA, numB)
   // Exibição dos valores das variáveis numA, numB e resultado formatadamente
   escreval("A multiplicação de", numA, " e", numB, " é:", resultado)
   
Fimalgoritmo