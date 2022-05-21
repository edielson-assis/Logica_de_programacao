Algoritmo "numeros_pares"

Var

   vet: vetor [0..99] de inteiro
   i, n, quantidade: inteiro

Inicio

      escreva("Quantos numeros voce vai digitar? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
      fimpara
      
      escreval
      escreval("NUMEROS PARES:")
      
      quantidade <- 0
      para i de 0 ate n-1 faca
           se vet[i] % 2 = 0 entao
              escreva(vet[i], " ")
              quantidade <- quantidade + 1
           fimse
      fimpara
      
      escreval
      escreval
      escreva("QUANTIDADE DE PARES = ", quantidade)

Fimalgoritmo