// Leer un n�mero entero de tres d�gitos y determinar a cu�nto es igual la suma de sus d�gitos.
Algoritmo FPU2Prob15_DFPS
	Definir userNum, digitOne, digitTwo, digitThree Como Entero
	
	Repetir
		Escribir "Ingresa un n�mero de tres d�gitos: " Sin Saltar
		Leer userNum
	Mientras Que abs(userNum)<100 o abs(userNum)>999
	
	digitOne = trunc(userNum/100)
	digitTwo = trunc((userNum%100)/10)
	digitThree = userNum%10
	
	Escribir "+----------------------------------+"
	Escribir "La suma de todos los d�gitos es: " digitOne+digitTwo+digitThree

FinAlgoritmo
