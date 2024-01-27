// Leer un número entero de tres digitos y determinar si algún dígito es múltiplo de los otros.
Algoritmo FPU2Prob17_DFPS
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
			
			Si digitOne%digitTwo==0 o digitOne%digitThree==0 o digitTwo%digitOne==0 o digitTwo%digitThree==0 o digitThree%digitOne==0 o digitThree%digitTwo==0 Entonces
				Escribir "Al menos un dígito es múltiplo de los otros."
			SiNo
				Escribir "Ningún dígito es múltiplo de los otros."
			FinSi
			
		SiNo
			Escribir "El número que ingresaste no tiene 3 dígitos."
			Escribir "--------------------------------------------------"
			breakout = Falso
		FinSi
		
	Hasta Que breakout == Verdadero
FinAlgoritmo
