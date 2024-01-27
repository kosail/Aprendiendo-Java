// Escribir en pantalla el resultado de sumar los primeros 20 múltiplos de 3.
Algoritmo DFPS_FPU3Prob15
	Definir theBigBoy, theBiggerBoy, counter Como Entero
	
	theBigBoy = 3
	theBiggerBoy=0
	counter = 0
	
	Repetir
		theBiggerBoy=theBiggerBoy+theBigBoy
		theBigBoy=theBigBoy+3
		counter = counter+1
	Hasta Que counter=20
	
	Escribir "La suma de los primeros 20 múltiplos de 3 es: " theBiggerBoy
FinAlgoritmo