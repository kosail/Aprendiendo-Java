// Mostrar en pantalla el promedio entero de los n primeros m�ltiplos de 3 para un n�mero n le�do.
Algoritmo DFPS_FPU3Prob16
	Definir theBigBoy, theBiggerBoy, userNum, counter Como Entero
	
	theBigBoy=3
	theBiggerBoy=0
	counter=0
	
	Escribir "Ingresa un n�mero entero como l�mite: "
	Leer userNum
	userNum=abs(userNum)
	
	Repetir
		theBiggerBoy=theBiggerBoy+theBigBoy
		theBigBoy=theBigBoy+3
		counter = counter+1
	Hasta Que counter=userNum
	
	Escribir "El promedio de los primeros " userNum " m�ltiplos de 3 es: " theBiggerBoy/userNum
FinAlgoritmo
