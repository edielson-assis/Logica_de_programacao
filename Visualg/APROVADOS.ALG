Algoritmo "aprovados"

Var

   i, n: inteiro
   nome: vetor[0..9] de caractere
   a, b: vetor[0..9] de real
   media: real

Inicio

      escreva("Quantos alunos serao digitados? ")
      leia(n)
      
      para i de 0 ate n-1 faca
         escreval("Digite nome, primeira e segunda nota do", i+1, "o aluno: ")
         leia(nome[i])
         leia(a[i])
         leia(b[i])
      fimpara
      
      escreval
      escreval("Alunos aprovados: ")
      
      para i de 0 ate n-1 faca
           media <- (a[i] + b[i]) / 2
           se media >= 6 entao
              escreval(nome[i])
           fimse
      fimpara

Fimalgoritmo