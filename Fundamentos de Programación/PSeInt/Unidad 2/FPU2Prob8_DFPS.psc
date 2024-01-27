// Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos.

Algoritmo FPU2Prob8_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un número de dos dígitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1%2<>0 y digit2%2<>0 Entonces
		Escribir "Los dígitos " digit1 " y " digit2 " son ambos primos."
	SiNo
		Escribir "Uno o ambos de los dígitos que componen el número " userNum " no son primos."
	FinSi
	
FinAlgoritmo
