Algoritmo "20220427_01_Matriz_soma"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Solicita inputs, armazena em matriz, soma com 2 cada elemento e
// exibe o resultado mostrando seus �ndices de linha e coluna
// Autor: Marcus Vieira
// Data atual: 27/04/2022
Var
// Declara��o de vari�vel do tipo matriz
matrizNumeros: vetor [1..3, 1..2] de inteiro
// Declara��o de vari�veis contadoras para uso nos loops sobre linhas e colunnas
countLinhas, countColunas, soma: inteiro

Inicio
// Atribui��o do valor de inicializa��o da vari�vel soma
soma <- 0
// Loop para que varrer� as linhas da vari�vel do tipo matriz matrizNumeros
para countLinhas de 1 ate 3 faca
   // Loop para que varrer� as coluna da vari�vel do tipo matriz matrizNumeros
   // e executar� os trechos pertinentes de c�digo
   para countColunas de 1 ate 2 faca
      // Exibi��o de mensagem com os valores das vari�veis countLinhas e
      // countColunas
      escreva("Digite o n�mero inteiro da posi��o", countLinhas, " e", countColunas, ":")
      // Input pelo usu�rio e atribui��o ao elemento da vari�vel matrizNumeros,
      // onde os elementos s�o definidos pelos valores das vari�veis countLinhas
      // e countColunas
      leia(matrizNumeros[countLinhas, countColunas])
   fimpara
fimpara
// Loop para que varrer� as linhas da vari�vel do tipo matriz matrizNumeros
para countLinhas de 1 ate 3 faca
   // Loop para que varrer� as coluna da vari�vel do tipo matriz matrizNumeros
   // e executar� os trechos pertinentes de c�digo
   para countColunas de 1 ate 2 faca
      // Atribui��o do valor de resultado da express�o matem�tica � vari�vel
      //soma
      soma <- matrizNumeros[countLinhas, countColunas] + 2
      // Exibi��o de mensagem com os valores das vari�veis countLinhas,
      // countColunas e soma
      escreval("Posi��o", countLinhas, " x", countColunas, " somado com 2 �:", soma)
   fimpara
fimpara
Fimalgoritmo