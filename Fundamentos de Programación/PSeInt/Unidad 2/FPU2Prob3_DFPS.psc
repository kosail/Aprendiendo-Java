// Leer un n�mero entero y determinar si  es negativo.
Algoritmo FPU2Prob3_DFPS
	Definir userNum Como Entero
	Definir validationOfNumber Como L�gico
	
	Escribir 'Ingresa un n�mero: 'Sin Saltar
	Leer userNum
	
	Si userNum<0 Entonces
		validationOfNumber <- Verdadero
	FinSi
	
	Escribir '�El n�mero ', userNum, ' es negativo?: ', validationOfNumber
	
FinAlgoritmo
