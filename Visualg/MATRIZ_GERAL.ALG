Algoritmo "matriz_geral"

Var

   n, i, j, linha, coluna: inteiro
   mat: vetor[0..99, 0..99] de real
   soma: real

Inicio

      escreva("Qual a ordem da matriz? ")
      leia(n)
      
      para i de 0 ate n-1 faca
           para j de 0 ate n-1 faca
                escreva("Elemento [",i,",",j," ]: ")
                leia(mat[i, j])
           fimpara
      fimpara
      
      soma <- 0
      para i de 0 ate n-1 faca
           para j de 0 ate n-1 faca
                se mat[i, j] > 0 entao
                   soma <- soma + mat[i, j]
                fimse
           fimpara
      fimpara
      
      escreval
      escreval("SOMA DOS POSITIVOS: ", soma:1:1)
      
      escreval
      escreva("Escolha uma linha: ")
      leia(linha)
      
      escreva("LINHA ESCOLHIDA: ")
      para j de 0 ate n-1 faca
           escreva(mat[linha, j]:1:1, " ")
      fimpara
      escreval

      escreval
      escreva("Escolha uma coluna: ")
      leia(coluna)
      
      escreva("COLUNA ESCOLHIDA: ")
      para i de 0 ate n-1 faca
           escreva(mat[i, coluna]:1:1, " ")
      fimpara
      escreval
      
      escreval
      escreva("DIAGONAL PRINCIPAL: ")
      para i de 0 ate n-1 faca
           escreva(mat[i, i]:1:1, " ")
      fimpara
      escreval
      
      para i de 0 ate n-1 faca
           para j de 0 ate n-1 faca
                se mat[i, j] < 0 entao
                   mat[i, j] <- Exp(mat[i, j], 2)
                fimse
           fimpara
      fimpara
      
      escreval
      escreval("MATRIZ ALTERADA:")
      para i de 0 ate n-1 faca
           para j de 0 ate n-1 faca
                escreva(mat[i, j]:1:1, " ")
           fimpara
           escreval
      fimpara

Fimalgoritmo