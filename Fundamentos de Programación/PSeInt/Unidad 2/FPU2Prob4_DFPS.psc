// Leer un n�mero entero de dos d�gitos y determinar a cu�nto es igual la suma de sus d�gitos.

Algoritmo FPU2Prob4_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un n�mero de dos d�gitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
		digit1 = trunc(userNum/10)
		digit2 = userNum%10
		Escribir "La suma de los d�gitos " digit1 " y " digit2 " es: " digit1 + digit2
	
FinAlgoritmo
