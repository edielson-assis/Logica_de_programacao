Algoritmo "mais_velho"

Var

   i, n, mais: inteiro
   nome: vetor[0..99] de caractere
   idade: vetor[0..99] de inteiro
   maisVelha: caractere

Inicio

      escreva("Quantas pessoas voce vai digitar? ")
      leia(n)
      
      para i de 0 ate n-1 faca
         escreval("Dados da", i+1, "a pessoa: ")
         escreva("Nome: ")
         leia(nome[i])
         escreva("Idade: ")
         leia(idade[i])
      fimpara
      
      mais <- 0
      para i de 0 ate n-1 faca
           se idade[i] > mais entao
              mais <- idade[i]
              maisVelha <- nome[i]
           fimse
      fimpara
      
      escreval
      escreva("PESSOA MAIS VELHA: ", maisVelha)
      
Fimalgoritmo