Algoritmo "20220423_01_Solicita_nome_nota_media"
// Cria��o de aplica��es e sistemas
// Franklin Portela
// Descri��o: Solicita 5 nomes, 5 notas e calcula a m�dia da turma
// Autor: Marcus Vieira
// Data atual: 23/04/2022
Var
//Declara��o de vari�veis
nomes: vetor [1 .. 5] de caracter
notas: vetor [1 .. 5] de real
count: inteiro
soma: real
media: real

Inicio
// Inicializa��o de valores nas vari�veis
soma <- 0
media <- 0
// Loop para que solicitar� em cada itera��o para o usu�rio realizar o input
// e armazenar� o valor no elemento do array nomes de �ndice dado pelo valor da
// vari�vel contadora count
para count de 1 ate 5 faca
   escreval("Insira o nome do aluno", count, ":")
   leia(nomes[count])
fimpara
// Loop para que solicitar� em cada itera��o para o usu�rio realizar o input
// e armazenar� o valor no elemento do array notas de �ndice dado pelo valor da
// vari�vel contadora count
para count de 1 ate 5 faca
   escreval("Insira a nota do aluno ", nomes[count], ":")
   leia(notas[count])
fimpara
// Loop para que varrer� o array notas, com �ndices dados pelo valor da vari�vel
// count, e somar� ao valor da vari�vel soma
para count de 1 ate 5 faca
   soma <- soma + notas[count]
fimpara
// Atribui��o do valor de resultado da express�o matem�tica � vari�vel media
media <- soma / count
// Exibi��o formatada do valor da vari�vel media
escreval("A m�dia da turma �:", media)
Fimalgoritmo