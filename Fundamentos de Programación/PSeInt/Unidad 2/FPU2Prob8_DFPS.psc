// Leer un n�mero entero de dos d�gitos y determinar si sus dos d�gitos son primos.

Algoritmo FPU2Prob8_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un n�mero de dos d�gitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1%2<>0 y digit2%2<>0 Entonces
		Escribir "Los d�gitos " digit1 " y " digit2 " son ambos primos."
	SiNo
		Escribir "Uno o ambos de los d�gitos que componen el n�mero " userNum " no son primos."
	FinSi
	
FinAlgoritmo
