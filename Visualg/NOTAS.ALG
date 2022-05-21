Algoritmo "notas"

Var

   nota1, nota2, notaFinal: real

Inicio

      escreva("Digite a primeira nota: ")
      leia(nota1)
      escreva("Digite a segunda nota: ")
      leia(nota2)
      
      notaFinal <- (nota1 + nota2) / 2
      
      escreval("Nota final: ", notaFinal:1:2)
      
      se notaFinal >= 60.00 entao
         escreval("Parabens, voce foi aprovado!")
      senao
           escreval("Sinto muito, voce foi reprovado!")
      fimse

Fimalgoritmo