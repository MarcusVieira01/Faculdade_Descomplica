Algoritmo "20220419_03_Multiplica_numeros_pratica_A"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Solicita via loop repita...at� 10 n�meros e multiplica-os
// Autor: Marcus Vieira
// Data atual: 19/04/2022
Var
// Declara��o de vari�veis
mult, num, contador: Inteiro

Inicio
// Inicializa��o do valor da vari�vel mult e contador
mult <- 1
contador <- 0
// Loop repita..at� com a vari�vel de controle sendo a contador
repita
   escreval("Digite um n�mero inteiro para a multiplica��o:")
   leia(num)
   mult <- mult * num
   // Incremento de 1 no valor da vari�vel contador, que controlar� a quantidade
   // de itera��es
   contador <- contador + 1
ate contador > 9
//Exibi��o do valor da vari�vel soma
escreval("O resultado da multiplica��o �:", mult)
Fimalgoritmo