Algoritmo "glicose"

Var

   glicose: real

Inicio

      escreva("Digite a medida da glicose: ")
      leia(glicose)
      
      se glicose <= 100 entao
         escreva("Classificacao: Normal")
      senao
        se glicose <= 140 entao
           escreva("Classificacao: Elevado")
        senao
           escreva("Classificacao: Diabestes")
        fimse
      fimse

Fimalgoritmo