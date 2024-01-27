// Leer dos n�meros enteros de dos digitos y determinar a cu�nto es igual la suma de todos los d�gitos.
Algoritmo FPU2Prob14_DFPS
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
				
				Escribir "+----------------------------------+"
				Escribir "La suma de todos los d�gitos es: " digitOneOne+digitOneTwo+digitTwoOne+digitTwoTwo
				
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
