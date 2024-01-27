// Leer un número entero de dos dígitos y determinar a cuánto es igual la suma de sus dígitos.

Algoritmo FPU2Prob4_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un número de dos dígitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
		digit1 = trunc(userNum/10)
		digit2 = userNum%10
		Escribir "La suma de los dígitos " digit1 " y " digit2 " es: " digit1 + digit2
	
FinAlgoritmo
