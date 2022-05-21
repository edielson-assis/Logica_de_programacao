Algoritmo "divisao"

Var

   x, i: inteiro
   n, d, divisao: real

Inicio

      escreva("Quantos casos voce vai digitar? ")
      leia(x)
      
      divisao <- 0
      para i de 1 ate x faca
           escreva("Entre com o numerador: ")
           leia(n)
           escreva("Entre com o denominador: ")
           leia(d)
           
           se d = 0 entao
              escreval("DIVISAO IMPOSSIVEL")
           senao
              divisao <- n/d
              escreval("Divisao = ", divisao:1:2)
           fimse
      fimpara

Fimalgoritmo