Algoritmo "20220419_04_Multiplica_numeros_pratica_B"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita via loop para 10 números e multiplica-os
// Autor: Marcus Vieira
// Data atual: 19/04/2022
Var
// Declaração de variáveis
mult, num, contador: Inteiro

Inicio
// Inicialização do valor da variável mult
mult <- 1
// Loop para com a variável contador sendo a variável acumuladora
para contador de 1 ate 10 faça
   escreval("Digite um número inteiro para multiplicação:")
   leia(num)
   mult <- mult * num
fimpara
//Exibição do valor da variável mult
escreval("O resultado da multiplicação é:", mult)
Fimalgoritmo