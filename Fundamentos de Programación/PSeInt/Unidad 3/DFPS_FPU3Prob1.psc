// Leer un n�mero entero y mostrar todos los enteros desde 1 hasta el n�mero le�do.
Algoritmo DFPS_FPU3Prob1
	Definir userNum Como Entero
	
	Escribir "Ingresa un n�mero entero: " Sin Saltar
	
	Repetir
		Leer userNum
	Mientras Que abs(userNum)==1
	
	Si userNum > 0 Entonces
		Para valor=1 Hasta userNum Con Paso 1 Hacer
			Escribir valor, ", "
		FinPara
	FinSi
	
	Si userNum < 0 Entonces
		Para valor=1 Hasta userNum Con Paso -1 Hacer
			Escribir valor, ", "
		FinPara
	FinSi
	
FinAlgoritmo