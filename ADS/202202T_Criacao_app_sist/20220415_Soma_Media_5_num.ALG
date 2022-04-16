Algoritmo "20220415_Soma_Media_5_num"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita 5 números ao usuário, calcula a soma e a média entre eles
// e exibe os resultados
// Autor(a): Marcus Vieira
// Data atual: 15/04/2022
Var
num1: Real
num2: Real
num3: Real
num4: Real
num5: Real
soma: Real
media: Real

Inicio
Escreval("Insira o primeiro número:")
Leia(num1)
Escreval("Insira o segundo número:")
Leia(num2)
Escreval("Insira o terceiro número:")
Leia(num3)
Escreval("Insira o quarto número:")
Leia(num4)
Escreval("Insira o último número:")
Leia(num5)

soma <- num1 + num2 + num3 + num4 + num5
media <- soma / 5

Escreval("A soma dos cinco números foi:", soma)
Escreval("A média dos cinco numeros foi:", media)

Fimalgoritmo