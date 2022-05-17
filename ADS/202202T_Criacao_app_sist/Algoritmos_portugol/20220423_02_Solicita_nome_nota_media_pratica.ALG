Algoritmo "20220423_02_Solicita_nome_nota_media_pratica"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita 10 nomes, 10 notas e calcula a média da turma
// Autor: Marcus Vieira
// Data atual: 23/04/2022
Var
//Declaração de variáveis
nomes: vetor [1 .. 10] de caracter
notas: vetor [1 .. 10] de real
count: inteiro
soma: real
media: real

Inicio
// Inicialização do valor da variável soma
soma <- 0
// Loop para que em cada interação exibirá a mensagem pertinente solicitando o
// input pelo usuário e armazenando no array pertinente, onde o índice do
// elemento é definido pelo valor da variável count
para count de 1 ate 10 faca
   escreval("Digite o nome do aluno", count, ":")
   leia(nomes[count])
   escreval("Digite a nota do aluno ", nomes[count], ":")
   leia(notas[count])
fimpara
// Loop para que fará a varredura do array notas, onde cada elemento definido
// pelo valor da variável contadora count, é somado ao valor da variável soma
para count de 1 ate 10 faca
   soma <- soma + notas[count]
fimpara
// Atribuição do valor de resultado da expressão matemática ao valor da variável
// media
media <- soma / count
// Exibição do valor da variável media, de fomorma formatada
escreval("A média da turma é:", media)
Fimalgoritmo