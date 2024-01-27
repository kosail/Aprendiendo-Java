// Leer dos n�meros enteros de dos digitos y determinar si tienen digitos comunes.
Algoritmo FPU2Prob12_DFPS
	Definir userNum1, userNum2, digitOneOne, digitOneTwo, digitTwoOne, digitTwoTwo Como Entero
	Definir breakout Como Logico
	
	Repetir
		Escribir "Ingresa un primer n�mero de dos d�gitos: " Sin Saltar
		Leer userNum1
		
		breakout = Verdadero
		
		Si userNum1>=-99 y userNum1<=99 Entonces
			Escribir "Ingresa un segundo n�mero de dos d�gitos: " Sin Saltar
			Leer userNum2
			
			Si userNum2>=-99 y userNum2<=99 Entonces
				// --------------------------------
				// Separaci�n de los condicionales que comprueban si los int que dio el usuario son de dos digitos,
				// de la propia unidad l�gica del algoritmo para as� mantener el orden y no confundirme entre condicionales anidados.
				digitOneOne = trunc(userNum1/10)
				digitOneTwo = userNum1%10
				digitTwoOne = trunc(userNum2/10)
				digitTwoTwo= userNum2%10
				
				Si digitTwoOne==digitOneOne o digitTwoOne==digitOneTwo o digitTwoTwo==digitOneOne o digitTwoTwo==digitOneTwo Entonces
					Escribir "Los n�meros tienen digitos en com�n."
				SiNo
					Escribir "Los numeros no tienen d�gitos en com�n"
				FinSi
				
				// --------------------------------
			SiNo
				Escribir "El segundo n�mero que ingresaste tiene m�s de 2 d�gitos."
				Escribir "--------------------------------------------------"
				breakout = Falso
			FinSi
		SiNo
			Escribir "El n�mero que ingresaste tiene m�s de 2 d�gitos."
			Escribir "--------------------------------------------------"
			breakout = Falso
		FinSi
		
	Hasta Que breakout == Verdadero
	
FinAlgoritmo
