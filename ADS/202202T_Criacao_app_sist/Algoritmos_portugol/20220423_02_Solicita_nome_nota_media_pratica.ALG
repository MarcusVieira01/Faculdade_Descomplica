Algoritmo "20220423_02_Solicita_nome_nota_media_pratica"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Solicita 10 nomes, 10 notas e calcula a m�dia da turma
// Autor: Marcus Vieira
// Data atual: 23/04/2022
Var
//Declara��o de vari�veis
nomes: vetor [1 .. 10] de caracter
notas: vetor [1 .. 10] de real
count: inteiro
soma: real
media: real

Inicio
// Inicializa��o do valor da vari�vel soma
soma <- 0
// Loop para que em cada intera��o exibir� a mensagem pertinente solicitando o
// input pelo usu�rio e armazenando no array pertinente, onde o �ndice do
// elemento � definido pelo valor da vari�vel count
para count de 1 ate 10 faca
   escreval("Digite o nome do aluno", count, ":")
   leia(nomes[count])
   escreval("Digite a nota do aluno ", nomes[count], ":")
   leia(notas[count])
fimpara
// Loop para que far� a varredura do array notas, onde cada elemento definido
// pelo valor da vari�vel contadora count, � somado ao valor da vari�vel soma
para count de 1 ate 10 faca
   soma <- soma + notas[count]
fimpara
// Atribui��o do valor de resultado da express�o matem�tica ao valor da vari�vel
// media
media <- soma / count
// Exibi��o do valor da vari�vel media, de fomorma formatada
escreval("A m�dia da turma �:", media)
Fimalgoritmo