minutos = int(input("Digite a quantidade de minutos: "))

if minutos <= 100:
    valor = 50.00
else:
    valor = (minutos - 100) * 2 + 50.00

print(f"Valor a pagar: R$ {valor:.2f}")