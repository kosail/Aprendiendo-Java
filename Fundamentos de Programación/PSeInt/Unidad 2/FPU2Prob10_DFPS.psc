// Leer un n�mero entero de dos d�gitos y determinar si los dos d�gitos son iguales.
Algoritmo FPU2Prob10_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un n�mero de dos d�gitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	digit1 = trunc(userNum/10)
	digit2 = userNum%10
	
	Si digit1==digit2 Entonces
		Escribir "Los d�gitos son iguales"
	SiNo
		Escribir "Los d�gitos no son iguales."
	FinSi
	
FinAlgoritmo
