Algoritmo "alturas"

Var

    nome: caractere
    i, n, idade: inteiro
    altura, porcentagem, media: real
    menor:vetor[0..9] de caractere

Inicio

    escreva("Quantas pessoas serao digitadas? ")
    leia(n)
    
    media <- 0
    porcentagem <- 0
    
    para i de 0 ate n-1 faca
    
       escreval("Dados da", i+1,"a pessoa:")
       escreva("Nome: ")
       leia(nome)
       escreva("Idade: ")
       leia(idade)
       escreva("Altura: ")
       leia(altura)
    
       media <- media + altura
       
       se idade < 16  entao
          porcentagem <- porcentagem + 1
          menor[i] <- nome
       fimse
    
    fimpara
    
    media <- media / n
    porcentagem <- porcentagem * 100 / n

    escreval
    escreval("Altura média: ", media:1:2)
    escreval("Pessoas com menos de 16 anos: ", porcentagem:1:2, "%")
    escreval(menor[i])

Fimalgoritmo