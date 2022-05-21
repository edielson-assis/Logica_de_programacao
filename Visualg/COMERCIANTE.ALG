Algoritmo "comerciante"

Var

   i, n: inteiro
   nome: vetor[0..99] de caractere
   compra, venda, lucro: vetor[0..99] de real
   lucroAbaixo, lucroAcima, lucroEntre, somaCompra, somaVenda, lucroTotal: real

Inicio

      escreva("Serao digitados dados de quantos produtos? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           escreval("Produto", i+1, ":")
           escreva("Nome :")
           leia(nome[i])
           escreva("Preco de compra: ")
           leia(compra[i])
           escreva("Preco de venda: ")
           leia(venda[i])
      fimpara

      lucroAbaixo <- 0
      lucroAcima <- 0
      lucroEntre <- 0
      
      para i de 0 ate n-1 faca
           lucro[i] <- (venda[i] - compra[i]) * 100 / compra[i]
           se (lucro[i] >= 10) e (lucro[i] <= 20) entao
              lucroEntre <- lucroEntre + 1
           senao
                se lucro[i] < 10 entao
                   lucroAbaixo <- lucroAbaixo + 1
                senao
                     lucroAcima <- lucroAcima + 1
                fimse
           fimse
      fimpara
      
      somaCompra <- 0
      somaVenda <- 0
      
      para i de 0 ate n-1 faca
           somaCompra <- somaCompra + compra[i]
           somaVenda <- somaVenda + venda[i]
           lucroTotal <- somaVenda - somaCompra
      fimpara
      
      escreval
      escreval("RELATORIO:")
      escreval("Lucro abaixo de 10%: ", lucroAbaixo)
      escreval("Lucro entre 10% e 20%: ", lucroEntre)
      escreval("Lucro acima de 20%: ", lucroAcima)
      escreval("Valor total de compra: ", somaCompra:1:2)
      escreval("Valor total de venda: ", somaVenda:1:2)
      escreval("Lucro total: ", lucroTotal)

Fimalgoritmo