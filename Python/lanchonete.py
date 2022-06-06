codigo = int(input("Codigo do produto comprado: "))
quantidade = int(input("Quantidade comprada: "))

preco = 0.0
if codigo == 1:
    preco = 5.00 * quantidade
elif codigo == 2:
    preco = 3.50 * quantidade
elif codigo == 3:
    preco = 4.80 * quantidade
elif codigo == 4:
    preco = 8.90 * quantidade
else:
    preco = 7.32 * quantidade

print(f"Valor a pagar: R$ {preco:.2f}")