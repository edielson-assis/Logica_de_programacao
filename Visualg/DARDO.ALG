Algoritmo "dardo"

Var

   distancia, distancia1, distancia2, maior: real

Inicio

      escreval("Digite as tres distancias: ")
      leia(distancia)
      leia(distancia1)
      leia(distancia2)
      
      se (distancia > distancia1) e (distancia > distancia2) entao
         maior <- distancia
      senao
         se distancia1 > distancia2 entao
              maior <- distancia1
         senao
              maior <- distancia2
         fimse
      fimse
      escreva("Maior distancia: ", maior:1:2)

Fimalgoritmo