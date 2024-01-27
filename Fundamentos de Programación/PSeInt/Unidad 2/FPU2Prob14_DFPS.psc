// Leer dos números enteros de dos digitos y determinar a cuánto es igual la suma de todos los dígitos.
Algoritmo FPU2Prob14_DFPS
	Definir userNum1, userNum2, digitOneOne, digitOneTwo, digitTwoOne, digitTwoTwo Como Entero
	Definir breakout Como Logico
	
	Repetir
		Escribir "Ingresa un primer número de dos dígitos: " Sin Saltar
		Leer userNum1
		
		breakout = Verdadero
		
		Si userNum1>=-99 y userNum1<=99 Entonces
			Escribir "Ingresa un segundo número de dos dígitos: " Sin Saltar
			Leer userNum2
			
			Si userNum2>=-99 y userNum2<=99 Entonces
				// --------------------------------
				// Separación de los condicionales que comprueban si los int que dio el usuario son de dos digitos,
				// de la propia unidad lógica del algoritmo para así mantener el orden y no confundirme entre condicionales anidados.
				
				digitOneOne = trunc(userNum1/10)
				digitOneTwo = userNum1%10
				digitTwoOne = trunc(userNum2/10)
				digitTwoTwo= userNum2%10
				
				Escribir "+----------------------------------+"
				Escribir "La suma de todos los dígitos es: " digitOneOne+digitOneTwo+digitTwoOne+digitTwoTwo
				
				// --------------------------------
			SiNo
				Escribir "El segundo número que ingresaste tiene más de 2 dígitos."
				Escribir "--------------------------------------------------"
				breakout = Falso
			FinSi
		SiNo
			Escribir "El número que ingresaste tiene más de 2 dígitos."
			Escribir "--------------------------------------------------"
			breakout = Falso
		FinSi
		
	Hasta Que breakout == Verdadero
FinAlgoritmo
