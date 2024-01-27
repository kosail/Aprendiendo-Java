// Leer un n�mero entero de tres digitos y determinar si alg�n d�gito es m�ltiplo de los otros.
Algoritmo FPU2Prob17_DFPS
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
			
			Si digitOne%digitTwo==0 o digitOne%digitThree==0 o digitTwo%digitOne==0 o digitTwo%digitThree==0 o digitThree%digitOne==0 o digitThree%digitTwo==0 Entonces
				Escribir "Al menos un d�gito es m�ltiplo de los otros."
			SiNo
				Escribir "Ning�n d�gito es m�ltiplo de los otros."
			FinSi
			
		SiNo
			Escribir "El n�mero que ingresaste no tiene 3 d�gitos."
			Escribir "--------------------------------------------------"
			breakout = Falso
		FinSi
		
	Hasta Que breakout == Verdadero
FinAlgoritmo
