// Leer un número entero y determinar si  es negativo.
Algoritmo FPU2Prob3_DFPS
	Definir userNum Como Entero
	Definir validationOfNumber Como Lógico
	
	Escribir 'Ingresa un número: 'Sin Saltar
	Leer userNum
	
	Si userNum<0 Entonces
		validationOfNumber <- Verdadero
	FinSi
	
	Escribir '¿El número ', userNum, ' es negativo?: ', validationOfNumber
	
FinAlgoritmo
