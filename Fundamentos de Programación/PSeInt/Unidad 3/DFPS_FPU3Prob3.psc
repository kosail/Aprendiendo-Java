// Leer un número entero y mostrar todos los divisores exactos del número, comprendidos entre 1 y el número leído.

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
		Escribir "No existe división entre cero."
	FinSi

FinAlgoritmo