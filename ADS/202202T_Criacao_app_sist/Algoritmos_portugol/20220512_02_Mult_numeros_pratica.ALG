Algoritmo "20220512_02_Mult_numeros_pratica"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Recebe dois n�meros, inclui como par�metro de fun��o, multiplica
// via fun��o e exibe o resultado
// Autor: Marcus Vieira
// Data atual: 12/05/2022

// Declara��o de fun��o
funcao mult (num1, num2: real): real
var
   // Declara��o de vari�vel
   res: real
inicio
   // Atribui��o do valor de resultado da express�o matem�tica � vari�vel res
   res <- num1 * num2
   // Uso da  palavra-chave retorne para que o valor da vari�vel res seja
   // retornado externamente � fun��o
   retorne res
fimfuncao

// Declara��o de vari�veis
Var
   resultado, numA, numB: real
Inicio
   // Exibi��o de mensagens pertinentes e scan do valor de input dado pelo
   // usu�rio com atribui��o � vari�vel pertinente
   escreva("Digite o primeiro n�mero:")
   leia(numA)
   escreva("Digite o segundo n�mero:")
   leia(numB)
   // Atribui��o do valor de retorno da fun��o mult � vari�vel resultado
   resultado <- mult(numA, numB)
   // Exibi��o dos valores das vari�veis numA, numB e resultado formatadamente
   escreval("A multiplica��o de", numA, " e", numB, " �:", resultado)
   
Fimalgoritmo