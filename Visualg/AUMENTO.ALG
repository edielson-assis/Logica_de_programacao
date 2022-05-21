Algoritmo "aumento"

Var

   salario, novoSalario, aumento, porcentagem: real

Inicio

      escreva("Digite o salario da pessoa: R$ ")
      leia(salario)
      
      se salario <= 1000.00 entao
        aumento <- 0.20* salario
        porcentagem <- 20
      senao
        se salario <= 3000.00 entao
          aumento <- 0.15* salario
          porcentagem <- 15
        senao
          se salario <= 8000.00 entao
            aumento <- 0.10* salario
            porcentagem <- 10
          senao
            aumento <- 0.05* salario
            porcentagem <- 5
          fimse
        fimse
      fimse
      
      novoSalario <- aumento + salario
      
      escreval("Novo salario: R$ ", novoSalario:1:2)
      escreval("Aumento: R$ ", aumento:1:2)
      escreval("Porcentagem: ", porcentagem,"%")

Fimalgoritmo