Algoritmo "20220415_Soma_Media_5_num"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Solicita 5 n�meros ao usu�rio, calcula a soma e a m�dia entre eles
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
Escreval("Insira o primeiro n�mero:")
Leia(num1)
Escreval("Insira o segundo n�mero:")
Leia(num2)
Escreval("Insira o terceiro n�mero:")
Leia(num3)
Escreval("Insira o quarto n�mero:")
Leia(num4)
Escreval("Insira o �ltimo n�mero:")
Leia(num5)

soma <- num1 + num2 + num3 + num4 + num5
media <- soma / 5

Escreval("A soma dos cinco n�meros foi:", soma)
Escreval("A m�dia dos cinco numeros foi:", media)

Fimalgoritmo