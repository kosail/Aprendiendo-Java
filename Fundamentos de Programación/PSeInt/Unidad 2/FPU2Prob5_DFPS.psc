// Leer un n�mero entero de dos d�gitos y determinar si ambos d�gitos son pares.

Algoritmo FPU2Prob5_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un n�mero de dos d�gitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1%2==0 y digit2%2==0 Entonces
		Escribir "Ambos d�gitos en el n�mero " userNum " son pares."
	SiNo
		Escribir "Uno o ambos d�gitos no son pares."
	FinSi
	
FinAlgoritmo
