// Leer un n�mero entero y mostrar todos los impares entre 1 y el n�mero le�do, inclusive.
Algoritmo DFPS_FPU3Prob2
	Definir userNum Como Entero
	
	Escribir "Ingresa un n�mero entero: " Sin Saltar
	
	Leer userNum
	
	Si userNum > 0 Entonces
		Para i=1 Hasta userNum Con Paso 1 Hacer
			Escribir i " " Sin Saltar
			i = i+1;
		FinPara
	SiNo
		Para i=1 Hasta userNum Con Paso -1 Hacer
			Escribir i " " Sin Saltar
			i = i-1;
		FinPara
	FinSi
	
FinAlgoritmo
