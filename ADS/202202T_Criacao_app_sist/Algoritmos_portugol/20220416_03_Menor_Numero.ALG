Algoritmo "20220416_01_Menor_numero"
// Cria��o de aplica��es e sistemas
// Franklin Portela
// Descri��o: Solicita input de dois n�meros e exibe o maior
// Autor(a): Marcus Vieira
// Data atual: 16/04/2022
Var
//Declara��o de vari�veis
num1, num2 : Real

Inicio
//Solicita��o de input
Escreval("Digite o primeiro n�mero:")
Leia(num1)
Escreval("Digite o segundo n�mero:")
Leia(num2)
//Condicionais que em caso true ou false exibir�o as mensagens pertinentes
Se (num1 < num2) ent�o
   Escreval("O numero", num2, " � maior!")
Sen�o
   Escreval("Os n�meros digitados s�o:", num1, " e", num2, "!")
FimSe

Fimalgoritmo