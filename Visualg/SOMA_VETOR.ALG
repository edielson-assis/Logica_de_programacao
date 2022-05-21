Algoritmo "soma_vetor"

Var

   soma, media: real
   vet: vetor[0..99] de real
   n, i: inteiro

Inicio
      
      escreva("Quantos numeros voce vai digitar? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
      fimpara
      
      escreval
      escreva("Valores = ")
      
      para i de 0 ate n-1 faca
           escreva(vet[i]:1:2, " ")
      fimpara
      
      soma <- 0
      para i de 0 ate n-1 faca
           soma <- soma + vet[i]
      fimpara
      
      media <- soma / n
       
      escreval
      escreval("Soma = ", soma)
      escreval("Media = ", media)

Fimalgoritmo