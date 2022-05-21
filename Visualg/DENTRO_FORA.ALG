Algoritmo "dentro_fora"

Var

  i, n, dentro, fora: inteiro

Inicio

      escreva("Quantos numeros voce vai digitar? ")
      leia(n)
      
      dentro <- 0
      fora <- 0
      para i de 1 ate n faca
           se (n >= 10) e (n <= 20) entao
              dentro <- dentro + 1
           senao
              fora <- fora + 1
           fimse
           
      escreva("Digite um numero: ")
      leia(n)
           
      fimpara
      
      escreval("Dentro", dentro)
      escreval("Fora", fora)

Fimalgoritmo