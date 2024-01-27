// Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus dígitos.
Algoritmo FPU2Prob15_DFPS
	Definir userNum, digitOne, digitTwo, digitThree Como Entero
	Definir breakout Como Logico
	
	Repetir
		Escribir "Ingresa un número de tres dígitos: " Sin Saltar
		Leer userNum
		
		breakout = Verdadero
		
		Si userNum>=-999 y userNum<=-100 o userNum>=100 y userNum<=999 Entonces
			digitOne = trunc(userNum/100)
			digitTwo = trunc((userNum%100)/10)
			digitThree = userNum%10
			
			Escribir "+----------------------------------+"
			Escribir "La suma de todos los dígitos es: " digitOne+digitTwo+digitThree
			
		SiNo
			Escribir "El número que ingresaste no tiene 3 dígitos."
			Escribir "--------------------------------------------------"
			breakout = Falso
		FinSi
		
	Hasta Que breakout == Verdadero
FinAlgoritmo
