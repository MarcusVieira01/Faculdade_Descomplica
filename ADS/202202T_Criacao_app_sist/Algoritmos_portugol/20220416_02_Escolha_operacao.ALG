Algoritmo "20220416_02_Escolha_operacao"
// Cria��o de aplica��es e sistemas
// Franklin Portela 
// Descri��o: Solicita input de um n�mero e mostra menu de opera��es a
// escolher
// Autor: Nome do(a) aluno(a)
// Data atual: 16/04/2022
Var
num, resultado: Real
esc: Inteiro

Inicio
// Solicita��o de input pertinente �s mensagens
escreval("Digite um n�mero:")
leia(num)
escreval("Escolha uma op��o de opera��o:")
escreval("Multiplicar o n�mero por 200")
escreval("Dividir o n�mero por 200")
leia(esc)
// Defini��o de estrutura Escolha-Caso para cada objetivo espec�fico
escolha(esc)
   caso 1
      resultado <- num * 200
   caso 2
      resultado <- num / 200
FimEscolha
// Exibi��o do valor da vari�vel resultado com mensagem pertinente
escreva("O resultado da opera��o �:", resultado)
Fimalgoritmo