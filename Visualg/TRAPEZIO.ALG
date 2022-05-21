Algoritmo "Trapezio"

Var

   a, b, c, areaTriangulo, areaQuadrado, areaTrapezio: real

Inicio

      escreva("Digite a medida A: ")
      leia(a)
      escreva("Digite a medida B: ")
      leia(b)
      escreva("Digite a medida C: ")
      leia(c)
      
      areaQuadrado <- a * a
      areaTriangulo <- a * b / 2
      areaTrapezio <- (a + b) * c / 2
      
      escreval("AREA DO QUADRADO: ", areaQuadrado:1:4)
      escreval("AREA DO TRIANGULO: ", areaTriangulo:1:4)
      escreval("AREA DO TRAPEZIO: ", areaTrapezio:1:4)

Fimalgoritmo