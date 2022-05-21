Algoritmo "terreno"

Var

   largura, comprimento, valor, area, preco: real

Inicio
   
   escreva("Digite a largura do terreno: ")
   leia(largura)
   escreva("Digite o comprimento do terreno: ")
   leia(comprimento)
   escreva("Digite o valor do metro quadrado: R$ ")
   leia(valor)
   
   area <- largura * comprimento
   preco <- area * valor
   
   escreval("Area do terreno: ", area:1:2)
   escreval("Preco do terreno: R$ ", preco:1:2)

Fimalgoritmo