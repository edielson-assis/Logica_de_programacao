Algoritmo "operadora"

Var

   minutos: inteiro
   valor: real

Inicio

      escreva("Digite a quantidade de minutos: ")
      leia(minutos)
      
      se minutos <=100 entao
        valor <- 50
      senao
         valor <- (minutos - 100) * 2 + 50
      fimse
      escreva("Valor a pagar: R$ ", valor:1:2)

Fimalgoritmo