Algoritmo "20220416_Escolha_caso"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição:
// Autor: Marcus Vieira
// Data atual  : 16/04/2022
Var
OP: Inteiro
Num, Resultado: Real

Inicio
Escreval("Opções:")
Escreval("1 - Calcular o dobro do número")
Escreval("2 - Calcular o triplo do número")
Escreva("Escolha uma das opções: ")
Leia(OP)

Escreva("Digite um número: ")
Leia(Num)

Escolha(op)
   Caso 1
      Resultado <- num * 2
   Caso 2
      Resultado <- num * 3
FimEscolha
Escreval(Resultado)
Fimalgoritmo