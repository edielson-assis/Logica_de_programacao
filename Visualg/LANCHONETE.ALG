Algoritmo "lanchonete"

Var

   codigo, quantidade: inteiro
   pagar, _1,_2,_3,_4,_5: real

Inicio

      escreva("Codigo do produto comprado: ")
      leia(codigo)
      escreva("Quantidade comprada: ")
      leia(quantidade)
      
      _1 <- 5.00
      _2 <- 3.50
      _3 <- 4.80
      _4 <- 8.90
      _5 <- 7.32
      
      se codigo = 1 entao
         pagar <- _1 * quantidade
      senao
           se codigo = 2 entao
              pagar <- _2 * quantidade
           senao
                se codigo = 3 entao
                   pagar <- _3 * quantidade
                senao
                     se codigo = 4 entao
                        pagar <- _4 * quantidade
                     senao
                          pagar <- _5 * quantidade
                     fimse
                fimse
           fimse
      fimse
      
      escreva("Valor a pagar: R$ ", pagar:1:2)

Fimalgoritmo