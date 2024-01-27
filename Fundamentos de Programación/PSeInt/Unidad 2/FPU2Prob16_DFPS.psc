// Leer un número entero de tres digitos y determinar en qué posición está el dígito mayor.
Algoritmo FPU2Prob16_DFPS
	Definir userNum, numArray, higherNumIndex, digitOne, digitTwo, digitThree, numCompare Como Entero
	Definir breakout Como Logico
	Dimension numArray[3]
	
	Repetir
		Escribir "Ingresa un número de tres dígitos: " Sin Saltar
		Leer userNum
		
		breakout = Verdadero
		
		Si userNum>=-999 y userNum<=-100 o userNum>=100 y userNum<=999 Entonces
			digitOne = trunc(userNum/100)
			digitTwo = trunc((userNum%100)/10)
			digitThree = userNum%10
			numArray[1] = digitOne
			numArray[2] = digitTwo
			numArray[3] = digitThree
			numCompare = numArray[1]
			higherNumIndex = 1
			
			Para i=1 Hasta 3 Con Paso 1 Hacer
				Si numCompare < numArray[i] Entonces
					higherNumIndex = i
				FinSi
			FinPara
			
			Escribir "Del número " userNum ", el dígito con mayor valor es el que está en la posición " higherNumIndex
			
		SiNo
			Escribir "El número que ingresaste no tiene 3 dígitos."
			Escribir "--------------------------------------------------"
			breakout = Falso
		FinSi
		
	Hasta Que breakout == Verdadero
	
FinAlgoritmo
