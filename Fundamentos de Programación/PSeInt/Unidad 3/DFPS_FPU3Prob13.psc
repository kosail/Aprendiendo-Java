// Leer un entero y mostrar todos los m�ltiplos de 5 comprendidos entre 1 y el n�mero le�do.
Algoritmo DFPS_FPU3Prob13
	Definir userNum Como Entero
	
	Escribir "Ingresa un n�mero entero: " Sin Saltar
	Leer userNum
	
	Si userNum>0 Entonces
		Para i=1 Hasta userNum Con Paso 1 Hacer
			Si i%5==0 Entonces
				Escribir i " " Sin Saltar
			FinSi
		FinPara
	SiNo
		Para i=1 Hasta userNum Con Paso -1 Hacer
			Si i%5==0 y i<>0 Entonces
				Escribir i " " Sin Saltar
			FinSi
		FinPara
	FinSi
	
	Si userNum==0 Entonces
		Escribir "No hay multiplos de 5 entre 0 y 0."
	FinSi
	
	Escribir ""
FinAlgoritmo