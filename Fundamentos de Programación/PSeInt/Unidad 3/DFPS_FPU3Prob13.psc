// Leer un entero y mostrar todos los múltiplos de 5 comprendidos entre 1 y el número leído.
Algoritmo DFPS_FPU3Prob13
	Definir userNum Como Entero
	
	Escribir "Ingresa un número entero: " Sin Saltar
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