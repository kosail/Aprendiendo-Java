// Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus dígitos.
Algoritmo FPU2Prob15_DFPS
	Definir userNum, digitOne, digitTwo, digitThree Como Entero
	
	Repetir
		Escribir "Ingresa un número de tres dígitos: " Sin Saltar
		Leer userNum
	Mientras Que abs(userNum)<100 o abs(userNum)>999
	
	digitOne = trunc(userNum/100)
	digitTwo = trunc((userNum%100)/10)
	digitThree = userNum%10
	
	Escribir "+----------------------------------+"
	Escribir "La suma de todos los dígitos es: " digitOne+digitTwo+digitThree

FinAlgoritmo
