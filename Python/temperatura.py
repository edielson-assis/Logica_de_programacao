from calendar import c


escala = str(input("Voce vai digitar a temperatura em qual escala (C/F)? "))

if escala == 'F':
    F = float(input("Digite a temperatura em Fahrenheit: "))
    C = 5.0 / 9.0 * (F - 32.0)
    print(f"Temperatura equivalente em Celsius: {C:.2f}")
else:
    C = float(input("Digite a temperatura em Celsius: "))
    F = 9.0 * C / 5.0 + 32.0
    print(f"Temperatura equivalente em Fahrenheit: {F:.2f}")