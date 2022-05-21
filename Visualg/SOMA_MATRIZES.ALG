Algoritmo "soma_matrizes"

Var

   l, c, i, j: inteiro
   mat1, mat2, mat3: vetor[0..99, 0..99] de inteiro

Inicio

      escreva("Quantas linhas vai ter cada matriz? ")
      leia(l)
      escreva("Quantas colunas vai ter cada matriz? ")
      leia(c)
      
      escreval("Digite os valores da matriz A:")
      para i de 0 ate l-1 faca
           para j de 0 ate c-1 faca
                escreva("Elemento [",i,",",j," ]: ")
                leia(mat1[i, j])
           fimpara
      fimpara
      
      escreval("Digite os valores da matriz B:")
      para i de 0 ate l-1 faca
           para j de 0 ate c-1 faca
                escreva("Elemento [",i,",",j," ]: ")
                leia(mat2[i, j])
           fimpara
      fimpara
      
      para i de 0 ate l-1 faca
           para j de 0 ate c-1 faca
                mat3[i, j] <- mat1[i, j] + mat2[i, j]
           fimpara
      fimpara
      
      escreval("MATRIZ SOMA:")
      para i de 0 ate l-1 faca
           para j de 0 ate c-1 faca
              escreva(mat3[i, j], " ")
           fimpara
           escreval
      fimpara

Fimalgoritmo