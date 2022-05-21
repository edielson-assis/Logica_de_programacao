Algoritmo "menor_e_maior_de_tres"

Var

   a, b, c, menor, maior: inteiro

Inicio

      escreva("Primeiro valor: ")
      leia(a)
      escreva("Segundo valor: ")
      leia(b)
      escreva("Terceiro valor: ")
      leia(c)
      
      se(a < b) e (a < c) entao
           menor <- a
      senao
           se b < c entao
              menor <- b
           senao
                menor <- c
           fimse
      fimse
           se (a > b) e (a > c) entao
              maior <- a
                senao
                  se b > c entao
                    maior <- b
                  senao
                    maior <- c
                fimse
           fimse

      escreval("Menor = ", menor)
      escreva("Maior = ", maior)

Fimalgoritmo