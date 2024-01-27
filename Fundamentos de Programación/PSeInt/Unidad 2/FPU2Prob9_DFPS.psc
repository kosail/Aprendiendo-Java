// Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro.
Algoritmo FPU2Prob9_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un número de dos dígitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1%digit2==0 Entonces
		Escribir digit2 " es un múltiplo de " digit1 "."
	SiNo
		Si digit2%digit1==0 Entonces
			Escribir digit1 " es un múltiplo de " digit2 "."
		SiNo
			Escribir "Los dígitos no coinciden como múltiplos."
		FinSi
	FinSi
	
FinAlgoritmo
