// Leer un n�mero entero y determinar a cu�nto es igual la suma de todos los enteros comprendidos entre 1 y el n�mero le�do
Algoritmo DFPS_FPU3Prob10
	Definir userNum, numSum Como Entero
	userNum=0
	numSum=0
	
	Leer userNum
	Si userNum >= 0 Entonces
		Para i=0 hasta userNum Con Paso 1 Hacer
			numSum=numSum+i
		FinPara
	SiNo
		Para i=0 hasta userNum Con Paso -1 Hacer
			numSum=numSum+i
		FinPara
	FinSi
	
	
	Escribir numSum
	
FinAlgoritmo