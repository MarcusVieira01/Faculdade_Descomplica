Algoritmo "20220416_Escolha_caso"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o:
// Autor: Marcus Vieira
// Data atual  : 16/04/2022
Var
OP: Inteiro
Num, Resultado: Real

Inicio
Escreval("Op��es:")
Escreval("1 - Calcular o dobro do n�mero")
Escreval("2 - Calcular o triplo do n�mero")
Escreva("Escolha uma das op��es: ")
Leia(OP)

Escreva("Digite um n�mero: ")
Leia(Num)

Escolha(op)
   Caso 1
      Resultado <- num * 2
   Caso 2
      Resultado <- num * 3
FimEscolha
Escreval(Resultado)
Fimalgoritmo