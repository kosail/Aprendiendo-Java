// Leer un numero entero y determinar si es un numero terminado en 4
Algoritmo FPU2Prob1_DFPS
	Definir userNum Como Entero
	Definir validationOfNumber Como Logico
	
	Escribir 'Ingresa un numero: 'Sin Saltar
	Leer userNum
	
	Si userNum%10 == 4 Entonces
		validationOfNumber <- Verdadero
	FinSi
	
	Escribir 'El numero ', userNum, ' termina en 4?: ', validationOfNumber
	
FinAlgoritmo
