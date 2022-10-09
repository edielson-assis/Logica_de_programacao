salario = float(input("Digite o salario da pessoa: "))

if salario <= 1000:
    aumento = 0.20 * salario
    porcentagem = 20
elif salario <= 3000:
    aumento = 0.15 * salario
    porcentagem = 15
elif salario <= 8000:
    aumento = 0.10 * salario
    porcentagem = 10
else:
    aumento = 0.05 * salario
    porcentagem = 5

novoSalario = salario + aumento

print(f"Novo salario = R$  {novoSalario:.2f}")
print(f"Aumento = R$ {aumento:.2f}")
print(f"Porcentagem = {porcentagem} %")