p1 = int(input("Digite o primeiro valor: "))
p2 = int(input("Digite o segundo valor: "))
p3 = int(input("Digite o terceiro valor: "))

if p1 < p2 and p1 < p3:
    menor = p1
elif p2 < p3:
    menor = p2
else: menor = p3

print(f"MENOR = {menor}")