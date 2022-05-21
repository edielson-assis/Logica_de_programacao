Algoritmo "dados_das_pessoas"

Var

   i, n, mulheres, homens: inteiro
   altura: vetor[0..9] de real
   genero: vetor[0..9] de caractere
   maior, menor, soma, media: real

Inicio

      escreva("Quantas pessoas serao digitadas? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           escreva("Altura da", i+1, "a pessoa: ")
           leia(altura[i])
           escreva("Genero da", i+1, "a pessoa: ")
           leia(genero[i])
      fimpara
      
      maior <- altura[0]
      menor <- altura[0]
      
      para i de 1 ate n-1 faca
           se altura[i] > maior entao
              maior <- altura[i]
           fimse

           se altura[i] < menor entao
              menor <- altura[i]
           fimse
      fimpara
      
      escreval
      escreval("Menor altura = ", menor)
      escreval("Maior altura = ", maior)
      
      soma <- 0
      homens<- 0
      mulheres <- 0
      
      para i de 0 ate n-1 faca
           se genero[i] = "f" entao
              soma <- soma + altura[i]
              mulheres <- mulheres + 1
           senao
                homens <- homens + 1
           fimse
      fimpara
      
      se mulheres = 0 entao
         escreval("Imposivel calcular a altura media das mulheres")
      senao
           media <- soma / mulheres
           escreval("Media das alturas das mulheres = ", media:1:2)
      fimse
      
      escreval("Numero de homens = ", homens)

Fimalgoritmo