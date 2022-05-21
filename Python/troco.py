preco = float(input("Preco unitario do produto: "))
quantidade = int(input("Quantidade comprada: "))

total = preco * quantidade
print(f"TOTAL = {total:.2f}")

dinheiro = float(input("Dinheiro recebido: "))

troco = dinheiro - total

print(f"TROCO = {troco:.2f}")