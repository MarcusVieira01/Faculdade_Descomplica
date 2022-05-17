Algoritmo "20220423_01_Solicita_nome_nota_media"
// Criação de aplicações e sistemas
// Franklin Portela
// Descrição: Solicita 5 nomes, 5 notas e calcula a média da turma
// Autor: Marcus Vieira
// Data atual: 23/04/2022
Var
//Declaração de variáveis
nomes: vetor [1 .. 5] de caracter
notas: vetor [1 .. 5] de real
count: inteiro
soma: real
media: real

Inicio
// Inicialização de valores nas variáveis
soma <- 0
media <- 0
// Loop para que solicitará em cada iteração para o usuário realizar o input
// e armazenará o valor no elemento do array nomes de índice dado pelo valor da
// variável contadora count
para count de 1 ate 5 faca
   escreval("Insira o nome do aluno", count, ":")
   leia(nomes[count])
fimpara
// Loop para que solicitará em cada iteração para o usuário realizar o input
// e armazenará o valor no elemento do array notas de índice dado pelo valor da
// variável contadora count
para count de 1 ate 5 faca
   escreval("Insira a nota do aluno ", nomes[count], ":")
   leia(notas[count])
fimpara
// Loop para que varrerá o array notas, com índices dados pelo valor da variável
// count, e somará ao valor da variável soma
para count de 1 ate 5 faca
   soma <- soma + notas[count]
fimpara
// Atribuição do valor de resultado da expressão matemática à variável media
media <- soma / count
// Exibição formatada do valor da variável media
escreval("A média da turma é:", media)
Fimalgoritmo