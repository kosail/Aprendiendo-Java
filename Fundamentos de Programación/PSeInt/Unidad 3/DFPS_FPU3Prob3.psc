// Leer un n�mero entero y mostrar todos los divisores exactos del n�mero, comprendidos entre 1 y el n�mero le�do.

Algoritmo DFPS_FPU3Prob3
	Leer userNum
	
	Si userNum > 0 Entonces
		Para i=1 Hasta userNum Con Paso 1 Hacer
			Si userNum%i==0 Entonces
				Escribir i " " Sin Saltar
			FinSi
		FinPara
	FinSi
	
	Si userNum < 0 Entonces
		Para i=1 Hasta userNum Con Paso -1 Hacer
			Si i==0 Entonces
				i= i-1
			FinSi
			
			Si userNum%i==0 Entonces
				Escribir i " " Sin Saltar
			FinSi
		FinPara
	FinSi
	
	Si userNum == 0 Entonces
		Escribir "No existe divisi�n entre cero."
	FinSi

FinAlgoritmo