Algoritmo "20220415_Soma_Media_3_num"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a): Marcus Vieira
// Data atual: 15/04/2022
Var
num1: Real
num2: Real
num3: Real
soma: Real
media: Real

Inicio
Escreval("Insira o primeiro n�mero:")
Leia(num1)
Escreval("Insira o outro n�mero:")
Leia(num2)
Escreval("Insira o �ltimo n�mero:")
Leia(num3)

soma <- num1 + num2 + num3
media <- soma / 3

Escreval("Os n�meros foram", num1, ",", num2, " e", num3)
Escreval("A soma dos tr�s n�meros foi", soma)
Escreval("A m�dia dos tr�s numeros foi:", media)

Fimalgoritmo