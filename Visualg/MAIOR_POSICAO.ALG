Algoritmo "maior_posicao"

Var

   i, n, posicao: inteiro
   vet: vetor[0..9] de real
   maiorValor: real

Inicio

      escreva("Quanto numeros voce vai digitar? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
      fimpara

      maiorValor <- vet[0]
      posicao <- 0
      para i de 1 ate n-1 faca
           se maiorValor < vet[i] entao
              maiorValor <- vet[i]
              posicao <- i
           fimse
      fimpara
      
      escreval
      escreval("MAIOR VALOR = ", maiorValor)
      escreva("POSICAO DO MAIOR VALOR = ", posicao)

Fimalgoritmo