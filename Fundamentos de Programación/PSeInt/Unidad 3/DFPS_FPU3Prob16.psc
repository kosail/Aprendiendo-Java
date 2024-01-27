// Mostrar en pantalla el promedio entero de los n primeros múltiplos de 3 para un número n leído.
Algoritmo DFPS_FPU3Prob16
	Definir theBigBoy, theBiggerBoy, userNum, counter Como Entero
	
	theBigBoy=3
	theBiggerBoy=0
	counter=0
	
	Escribir "Ingresa un número entero como límite: "
	Leer userNum
	userNum=abs(userNum)
	
	Repetir
		theBiggerBoy=theBiggerBoy+theBigBoy
		theBigBoy=theBigBoy+3
		counter = counter+1
	Hasta Que counter=userNum
	
	Escribir "El promedio de los primeros " userNum " múltiplos de 3 es: " theBiggerBoy/userNum
FinAlgoritmo
