Algoritmo "20220419_02_Multiplica_numeros_pratica"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita via loop repita...até 5 números e multiplica-os
// Autor: Marcus Vieira
// Data atual: 19/04/2022
Var
// Declaração de variáveis
mult, num, contador: Inteiro

Inicio
// Inicialização do valor da variável mult e contador
mult <- 1
contador <- 0
// Loop repita..até com a variável de controle sendo a contador
repita
   escreval("Digite um número inteiro para a multiplicação:")
   leia(num)
   mult <- mult * num
   // Incremento de 1 no valor da variável contador, que controlará a quantidade
   // de iterações
   contador <- contador + 1
ate contador > 4
//Exibição do valor da variável soma
escreval("O resultado da multiplicação é:", mult)
Fimalgoritmo