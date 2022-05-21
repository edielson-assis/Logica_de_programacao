Algoritmo "par_impar"

Var

  x, i, n: inteiro

Inicio

      escreva("Quantos numeros voce vai digitar? ")
      leia(n)
      
      para i de 1 ate n faca
           escreva("Digite um numero: ")
           leia(x)
           
           se x = 0 entao
              escreval("Nulo")
           senao
                se x % 2 = 0 entao
                   se x < 0 entao
                      escreval("Par Negativo")
                   senao
                        escreval("Par positivo")
                   fimse
                senao
                     se x < 0 entao
                        escreval("Impar Negativo")
                     senao
                          escreval("Impara Positivo")
                     fimse
                fimse
           fimse
      fimpara

Fimalgoritmo