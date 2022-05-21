Algoritmo "negativos"

Var

   i, y, n: inteiro
   x: vetor[0..99] de inteiro

Inicio

      escreva("Quantos numeros voce vai digitar? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           escreva("Digite um numero: ")
           leia(x[i])
      fimpara
      
      escreval("NUMEROS NEGATIVOS:")
      
      para i de 0  ate n-1 faca
           se x[i] < 0 entao
              escreval(x[i])
           fimse
      fimpara

Fimalgoritmo