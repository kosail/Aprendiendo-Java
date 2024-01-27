// Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.
Algoritmo FPU2Prob10_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un número de dos dígitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1==digit2 Entonces
		Escribir "Los dígitos son iguales"
	SiNo
		Escribir "Los dígitos no son iguales."
	FinSi
	
FinAlgoritmo
