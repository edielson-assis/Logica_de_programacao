Algoritmo "soma_vetores"

Var

i, n: inteiro
,vet1 vet2, vet3: vetor[0..99] de inteiro

Inicio

      escreva("Quantos valores vai ter cada vetor? ")
      leia(n)
      escreval("Digite os valores do vetor A: ")
      
      para i de 0 ate n-1 faca
           leia(vet1[i])
      fimpara
      
      escreval("Digite os valores do vetor B: ")
      
      para i de 0 ate n-1 faca
           leia(vet2[i])
      fimpara
      
      escreval("VETOR RESULTANTE: ")
      
      para i de 0 ate n-1 faca
           vet3[i] <- a[i] + b[i]
           escreval(vet3[i]:1)
      fimpara
      
Fimalgoritmo