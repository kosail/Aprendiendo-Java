// Mostrar en pantalla los primeros 20 múltiplos de 3
Algoritmo DFPS_FPU3Prob14
	Definir theBigBoy, counter Como Entero
	
	theBigBoy = 0
	counter = 0
	
	Repetir
		theBigBoy=theBigBoy+3
		Escribir theBigBoy " " Sin Saltar
		counter=counter+1
	Hasta Que counter=20
	
	Escribir ""
	Escribir "Total de múltiplos de 3 impresos: " counter
FinAlgoritmo