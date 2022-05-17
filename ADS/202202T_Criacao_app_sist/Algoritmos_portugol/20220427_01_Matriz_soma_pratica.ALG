Algoritmo "20220408_01_Matris_soma_pratica"
// Criação de aplicações e sistemas
// Franklin Portela
// Descrição: Solicita valores para uma matriz 5x5, soma 10 em cada posição e
// exibe o valor de resultado
// Autor: Marcus Vieira
// Data atual: 28/04/2022
Var
// Declaração de variável do tipo matriz
matrix: vetor [1..5, 1..5] de inteiro
// Declaração de variáveis contadoras e de soma
linhas, colunas, soma: inteiro

Inicio
// Atribuição do valor de inicialização da variável soma
soma <- 0
// Loop para que varrerá a variável metrix em cada posição de linha
para linhas de 1 ate 5 faca
   // Loop para que varrerá a variável metrix em cada posição de coluna e
   // executará o bloco de código em cada iteração
   para colunas de 1 ate 5 faca
      // Exibição de mensagem pertinente ao input
      escreva("Digite o valor para a posição", linhas, " x", colunas, ":")
      // Leitura do input do usuário e atribuição à posição definida pelas
      // variáveis linhas e colunas
      leia(matrix[linhas,colunas])
      // Atribuição do valor de resultado da expressão matemática à variável
      // soma. Após é feita atribuição do valor da variável soma na mesma
      // posição da variável matrix
      soma <- matrix[linhas,colunas] + 10
      matrix[linhas,colunas] <- soma
   fimpara
fimpara
// Loop para que varrerá a variável metrix em cada posição de linha
para linhas de 1 ate 5 faca
   // Loop para que varrerá a variável metrix em cada posição de coluna e
   // executará o bloco de código em cada iteração
   para colunas de 1 ate 5 faca
      // Exibição do valor da posição da variável matrx, com definição dessa
      // posição com os valores das variáveis linhas e colunas
      escreval("O valor da posição", linhas, " x", colunas, " após soma é:", matrix[linhas,colunas])
   fimpara
fimpara

Fimalgoritmo