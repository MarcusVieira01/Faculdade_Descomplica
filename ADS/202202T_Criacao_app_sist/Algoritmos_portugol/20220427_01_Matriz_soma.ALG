Algoritmo "20220427_01_Matriz_soma"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita inputs, armazena em matriz, soma com 2 cada elemento e
// exibe o resultado mostrando seus índices de linha e coluna
// Autor: Marcus Vieira
// Data atual: 27/04/2022
Var
// Declaração de variável do tipo matriz
matrizNumeros: vetor [1..3, 1..2] de inteiro
// Declaração de variáveis contadoras para uso nos loops sobre linhas e colunnas
countLinhas, countColunas, soma: inteiro

Inicio
// Atribuição do valor de inicialização da variável soma
soma <- 0
// Loop para que varrerá as linhas da variável do tipo matriz matrizNumeros
para countLinhas de 1 ate 3 faca
   // Loop para que varrerá as coluna da variável do tipo matriz matrizNumeros
   // e executará os trechos pertinentes de código
   para countColunas de 1 ate 2 faca
      // Exibição de mensagem com os valores das variáveis countLinhas e
      // countColunas
      escreva("Digite o número inteiro da posição", countLinhas, " e", countColunas, ":")
      // Input pelo usuário e atribuição ao elemento da variável matrizNumeros,
      // onde os elementos são definidos pelos valores das variáveis countLinhas
      // e countColunas
      leia(matrizNumeros[countLinhas, countColunas])
   fimpara
fimpara
// Loop para que varrerá as linhas da variável do tipo matriz matrizNumeros
para countLinhas de 1 ate 3 faca
   // Loop para que varrerá as coluna da variável do tipo matriz matrizNumeros
   // e executará os trechos pertinentes de código
   para countColunas de 1 ate 2 faca
      // Atribuição do valor de resultado da expressão matemática à variável
      //soma
      soma <- matrizNumeros[countLinhas, countColunas] + 2
      // Exibição de mensagem com os valores das variáveis countLinhas,
      // countColunas e soma
      escreval("Posição", countLinhas, " x", countColunas, " somado com 2 é:", soma)
   fimpara
fimpara
Fimalgoritmo