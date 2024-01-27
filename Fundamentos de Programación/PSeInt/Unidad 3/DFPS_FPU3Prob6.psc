// Leer un número entero de tres dígitos y mostrar todos los enteros comprendidos entre 1 y cada uno de los dígitos.
Algoritmo DFPS_FPU3Prob6
	Definir num, digitsArray Como Entero
	Dimension digitsArray[3]
	
	Repetir
		Escribir "Ingresa un número de tres dígitos: " Sin Saltar
		Leer num
	Mientras Que abs(num)<100 o abs(num)>999
	
	digitsArray[1] = trunc(num/100)
	digitsArray[2] = trunc(num/10)%10
	digitsArray[3] = num%10
	
	Para i=1 Hasta 3 Con Paso 1 Hacer
		Escribir "Dígito " i ":"
		
		Si num>0 Entonces
			Para j=1 Hasta digitsArray[i] Con Paso 1 Hacer
				Escribir j " " Sin Saltar
			FinPara
		SiNo
			Para j=1 Hasta digitsArray[i] Con Paso -1 Hacer
				Escribir j " " Sin Saltar
			FinPara
		FinSi
		
		Escribir ""
	FinPara
	
FinAlgoritmo