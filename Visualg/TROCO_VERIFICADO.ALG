Algoritmo "troco_verificado"

Var

   troco, preco, dinheiro, total: real
   quantidade: inteiro

Inicio

   escreva("Preco unitario do produto: R$ ")
   leia(preco)
   escreva("Quantidade comprada: ")
   leia(quantidade)
   
   total <- preco * quantidade
   
   escreval("Total das compras: R$ ", total:1:2)
   
   escreva("Dinheiro recebido: R$ ")
   leia(dinheiro)
   
   se total <= dinheiro entao
      troco <- dinheiro - total
      escreva("Troco: R$ ", troco:1:2)
   senao
        troco <- total - dinheiro
        escreva("DINHEIRO INSUFICIENTE. FALTAM: R$ ", troco:1:2)
   fimse

Fimalgoritmo