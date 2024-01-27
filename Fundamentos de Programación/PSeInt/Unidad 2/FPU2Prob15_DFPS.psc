// Leer un n�mero entero de tres d�gitos y determinar a cu�nto es igual la suma de sus d�gitos.
Algoritmo FPU2Prob15_DFPS
	Definir userNum, digitOne, digitTwo, digitThree Como Entero
	Definir breakout Como Logico
	
	Repetir
		Escribir "Ingresa un n�mero de tres d�gitos: " Sin Saltar
		Leer userNum
		
		breakout = Verdadero
		
		Si userNum>=-999 y userNum<=-100 o userNum>=100 y userNum<=999 Entonces
			digitOne = trunc(userNum/100)
			digitTwo = trunc((userNum%100)/10)
			digitThree = userNum%10
			
			Escribir "+----------------------------------+"
			Escribir "La suma de todos los d�gitos es: " digitOne+digitTwo+digitThree
			
		SiNo
			Escribir "El n�mero que ingresaste no tiene 3 d�gitos."
			Escribir "--------------------------------------------------"
			breakout = Falso
		FinSi
		
	Hasta Que breakout == Verdadero
FinAlgoritmo
