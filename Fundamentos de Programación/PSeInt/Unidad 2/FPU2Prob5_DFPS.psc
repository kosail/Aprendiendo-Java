// Leer un número entero de dos dígitos y determinar si ambos dígitos son pares.

Algoritmo FPU2Prob5_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un número de dos dígitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1%2==0 y digit2%2==0 Entonces
		Escribir "Ambos dígitos en el número " userNum " son pares."
	SiNo
		Escribir "Uno o ambos dígitos no son pares."
	FinSi
	
FinAlgoritmo
