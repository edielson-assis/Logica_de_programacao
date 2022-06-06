import math

a = float(input("Coeficiente A: "))
b = float(input("Coeficiente B: "))
c = float(input("Coeficiente C: "))

delta = pow(b, 2) - (4 * a * c)
if a == 0 or delta < 0:
    print("Essa equacao nao possui raizes reias")
else:
    x1 = ((-b) + math.sqrt(delta)) / (2 * a)
    x2 = ((-b) - math.sqrt(delta)) / (2 * a)

print(f"X1 = {x1:.4f}")
print(f"X2 = {x2:.4f}")