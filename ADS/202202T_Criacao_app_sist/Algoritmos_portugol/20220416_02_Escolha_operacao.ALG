Algoritmo "20220416_02_Escolha_operacao"
// Criação de aplicações e sistemas
// Franklin Portela 
// Descrição: Solicita input de um número e mostra menu de operações a
// escolher
// Autor: Nome do(a) aluno(a)
// Data atual: 16/04/2022
Var
num, resultado: Real
esc: Inteiro

Inicio
// Solicitação de input pertinente às mensagens
escreval("Digite um número:")
leia(num)
escreval("Escolha uma opção de operação:")
escreval("Multiplicar o número por 200")
escreval("Dividir o número por 200")
leia(esc)
// Definição de estrutura Escolha-Caso para cada objetivo específico
escolha(esc)
   caso 1
      resultado <- num * 200
   caso 2
      resultado <- num / 200
FimEscolha
// Exibição do valor da variável resultado com mensagem pertinente
escreva("O resultado da operação é:", resultado)
Fimalgoritmo