Algoritmo "20220408_01_Matris_soma_pratica"
// Cria��o de aplica��es e sistemas
// Franklin Portela
// Descri��o: Solicita valores para uma matriz 5x5, soma 10 em cada posi��o e
// exibe o valor de resultado
// Autor: Marcus Vieira
// Data atual: 28/04/2022
Var
// Declara��o de vari�vel do tipo matriz
matrix: vetor [1..5, 1..5] de inteiro
// Declara��o de vari�veis contadoras e de soma
linhas, colunas, soma: inteiro

Inicio
// Atribui��o do valor de inicializa��o da vari�vel soma
soma <- 0
// Loop para que varrer� a vari�vel metrix em cada posi��o de linha
para linhas de 1 ate 5 faca
   // Loop para que varrer� a vari�vel metrix em cada posi��o de coluna e
   // executar� o bloco de c�digo em cada itera��o
   para colunas de 1 ate 5 faca
      // Exibi��o de mensagem pertinente ao input
      escreva("Digite o valor para a posi��o", linhas, " x", colunas, ":")
      // Leitura do input do usu�rio e atribui��o � posi��o definida pelas
      // vari�veis linhas e colunas
      leia(matrix[linhas,colunas])
      // Atribui��o do valor de resultado da express�o matem�tica � vari�vel
      // soma. Ap�s � feita atribui��o do valor da vari�vel soma na mesma
      // posi��o da vari�vel matrix
      soma <- matrix[linhas,colunas] + 10
      matrix[linhas,colunas] <- soma
   fimpara
fimpara
// Loop para que varrer� a vari�vel metrix em cada posi��o de linha
para linhas de 1 ate 5 faca
   // Loop para que varrer� a vari�vel metrix em cada posi��o de coluna e
   // executar� o bloco de c�digo em cada itera��o
   para colunas de 1 ate 5 faca
      // Exibi��o do valor da posi��o da vari�vel matrx, com defini��o dessa
      // posi��o com os valores das vari�veis linhas e colunas
      escreval("O valor da posi��o", linhas, " x", colunas, " ap�s soma �:", matrix[linhas,colunas])
   fimpara
fimpara

Fimalgoritmo