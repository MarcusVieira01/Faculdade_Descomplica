Algoritmo "20220419_01_Soma_numeros"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita via loop para 5 números e soma-os
// Autor: Marcus Vieira
// Data atual: 19/04/2022
Var
// Declaração de variáveis
soma, num, contador: Inteiro

Inicio
// Inicialização do valor da variável soma
soma <- 0
// Loop para com a variável contador sendo a variável acumuladora
para contador de 1 ate 5 faça
   escreval("Digite um número inteiro para somar:")
   leia(num)
   soma <- soma + num
fimpara
//Exibição do valor da variável soma
escreval("O resultado da soma é:", soma)
Fimalgoritmo