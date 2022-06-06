preco = float(input("Preco unitario do produto: "))
quantidade = int(input("Quantidade comprada: "))

total = preco * quantidade

print(f"Total: {total:.2f}")
dinheiro = float(input("Dinheiro recebido: "))

if dinheiro < total:
    troco = total - dinheiro    
    print(f"DINHEIRO INSUFICIENTE. FALTAM {troco:.2f} REAIS")
else:
    troco = dinheiro - total
    print(f"TROCO = {troco:.2f}")
