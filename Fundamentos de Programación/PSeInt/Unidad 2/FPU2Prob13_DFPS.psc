// Leer dos n�meros enteros de dos digitos y determinar si la suma de los dos n�meros origina un n�mero par.
Algoritmo FPU2Prob13_DFPS
	Definir userNum1, userNum2 Como Entero
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
				Si (userNum1+userNum2)%2==0 Entonces
					Escribir "+----------------------------------------+"
					Escribir "La suma de los dos n�meros origina un n�mero par."
					Escribir "Dicho n�mero es: " userNum1+userNum2
				SiNo
					Escribir "La suma de estos dos n�meros no origina un n�mero par."
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
