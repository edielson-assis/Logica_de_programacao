Algoritmo "media_escolar"

Var

   x, y, z, a: real
   resultado: real

Inicio

      escreval("Insira as informacoes solicitadas para saber sua media.")
      escreval
      escreva("Digite a primeira nota: ")
      leia(x)
      escreva("Digite a segunda nota: ")
      leia(y)
      escreva("Digite a terceira nota: ")
      leia(z)
      escreva("Digite a quarta nota: ")
      leia(a)
      escreval
      
      resultado <- (x+y+z+a) / 4
      
      escreva("Resultado: ", resultado:1:1)

Fimalgoritmo