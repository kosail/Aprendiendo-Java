// Leer un número entero y mostrar todos los impares entre 1 y el número leído, inclusive.
Algoritmo DFPS_FPU3Prob2
	Definir userNum Como Entero
	
	Escribir "Ingresa un número entero: " Sin Saltar
	
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
