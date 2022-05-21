nome = input("Nome: ")
valor = float(input("Valor por hora: "))
hora = int(input("Horas trabalhadas: "))

pagamento = valor * hora    

print(f"O pagamento para {nome} deve ser {pagamento:.2f}")