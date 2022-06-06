medida = float(input("Digite a medida da glicose: "))

if medida <= 100:
    print("Classificacao: normal")
elif medida <= 140:
    print("Classificacao: elevado")
else:
    print("Classificacao: diabetes")