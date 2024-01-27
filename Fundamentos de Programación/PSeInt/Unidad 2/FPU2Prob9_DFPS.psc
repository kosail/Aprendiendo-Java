// Leer un n�mero entero de dos d�gitos y determinar si un d�gito es m�ltiplo del otro.
Algoritmo FPU2Prob9_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un n�mero de dos d�gitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1%digit2==0 Entonces
		Escribir digit2 " es un m�ltiplo de " digit1 "."
	SiNo
		Si digit2%digit1==0 Entonces
			Escribir digit1 " es un m�ltiplo de " digit2 "."
		SiNo
			Escribir "Los d�gitos no coinciden como m�ltiplos."
		FinSi
	FinSi
	
FinAlgoritmo
