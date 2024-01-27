// Leer dos matrices de 4x5 enteras y determinar si la cantidad de números primos almacenados en una matriz es igual a la cantidad de números primos almacenados en la otra matriz.
Algoritmo DFPS_FPU4Prob77
	Definir matrix1, matrix2, matrix1OddCount, matrix2OddCount Como Entero
	Definir isPrime Como Lógico
	Dimensionar matrix1(4,5), matrix2(4,5)
	matrix1OddCount <- 0
	matrix2OddCount <- 0
	Escribir 'Ingresa 20 números, uno a la vez:'
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			isPrime <- Verdadero
			Leer matrix1[i,j]
			Si matrix1[i,j] MOD 2<>0 Entonces
				Para k<-2 Hasta matrix1[i,j]/2 Con Paso 1 Hacer
					Si matrix1[i,j] MOD k==0 Entonces
						isPrime <- Falso
					FinSi
				FinPara
				Si isPrime Entonces
					matrix1OddCount <- matrix1OddCount+1
				FinSi
			FinSi
		FinPara
	FinPara
	Escribir 'Ingresa otros 20 números, uno a la vez:'
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Para j<-1 Hasta 5 Con Paso 1 Hacer
			isPrime <- Verdadero
			Leer matrix2[i,j]
			Si matrix2[i,j] MOD 2<>0 Entonces
				Para k<-2 Hasta matrix2[i,j]/2 Con Paso 1 Hacer
					Si matrix2[i,j] MOD k==0 Entonces
						isPrime <- Falso
					FinSi
				FinPara
				Si isPrime Entonces
					matrix2OddCount <- matrix2OddCount+1
				FinSi
			FinSi
		FinPara
	FinPara
	Si matrix1OddCount+matrix2OddCount==0 Entonces
		Escribir 'No hay números primos.'
	SiNo
		Si matrix1OddCount==matrix2OddCount Entonces
			Escribir 'El total de números primos de la matriz 1 es igual que en la matriz 2'
		SiNo
			Escribir 'El total de números primos no coincide entre matrices.'
		FinSi
	FinSi
FinAlgoritmo
