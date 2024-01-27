// Leer un numero entero y determinar si tiene 3 digitos.
Algoritmo FPU2Prob2_DFPS
	Definir userNum Como Entero
	Definir validationOfNumber Como Logico
	
	Escribir 'Ingresa un numero: 'Sin Saltar
	Leer userNum
	
	Si userNum>=100 y userNum<=999 o userNum<=-100 y userNum>=-999 Entonces
		validationOfNumber <- Verdadero
	FinSi
	
	Escribir 'El numero ', userNum, ' tiene 3 digitos?: ', validationOfNumber
	
FinAlgoritmo
