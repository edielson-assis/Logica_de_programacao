Algoritmo "media_pares"

Var

   i, n, divisor: inteiro
   media: real
   vet: vetor[0..99] de inteiro

Inicio

      escreva("Quantos elementos vai ter o vetor? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
      fimpara
      
      media <- 0
      divisor <- 0
      
      para i de 0 ate n-1 faca
           se vet[i] % 2 = 0 entao
              media<- media + vet[i]
              divisor <- divisor + 1
           fimse
      fimpara
      
      se divisor = 0 entao
         escreva("NENHUM NUMERO PAR ")
      senao
           media <- media / divisor
           escreva("MEDIA DOS PARES = ", media:1:1)
      fimse

Fimalgoritmo