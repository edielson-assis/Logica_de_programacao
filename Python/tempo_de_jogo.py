horaInicial = int(input("Hora inicial: "))
horaFinal = int(input("Hora final: "))

if horaInicial < horaFinal:
    duracao = horaFinal - horaInicial
else:
    duracao = 24 - horaInicial + horaFinal

print(f"O JOGO DUROU {duracao} HORA(S)")