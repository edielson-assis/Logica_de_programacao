Algoritmo "abaixo_da_media"

Var

   i, n: inteiro
   media: real
   vet: vetor[0..9] de real

Inicio

      escreva("Quantos elementos vai ter o vetor? ")
      leia(n)

      media <- 0
      
      para i de 0 ate n-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
           media <- media + vet[i]
      fimpara
      
      media <- media / n
      
      escreval
      escreval("MEDIA DO VETOR = ", media)
      escreval("ELEMENTOS ABAIXO DA MEDIA: ")
      
      para i de 0 ate n-1 faca
         se vet[i] < media entao
            escreval(vet[i]:1:1)
         fimse
      fimpara

Fimalgoritmo