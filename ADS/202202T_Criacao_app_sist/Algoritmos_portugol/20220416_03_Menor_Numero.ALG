Algoritmo "20220416_01_Menor_numero"
// Criação de aplicações e sistemas
// Franklin Portela
// Descrição: Solicita input de dois números e exibe o maior
// Autor(a): Marcus Vieira
// Data atual: 16/04/2022
Var
//Declaração de variáveis
num1, num2 : Real

Inicio
//Solicitação de input
Escreval("Digite o primeiro número:")
Leia(num1)
Escreval("Digite o segundo número:")
Leia(num2)
//Condicionais que em caso true ou false exibirão as mensagens pertinentes
Se (num1 < num2) então
   Escreval("O numero", num2, " é maior!")
Senão
   Escreval("Os números digitados são:", num1, " e", num2, "!")
FimSe

Fimalgoritmo