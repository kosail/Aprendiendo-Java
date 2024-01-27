// Leer dos números enteros de dos digitos y determinar si la suma de los dos números origina un número par.
Algoritmo FPU2Prob13_DFPS
	Definir userNum1, userNum2 Como Entero
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
				Si (userNum1+userNum2)%2==0 Entonces
					Escribir "+----------------------------------------+"
					Escribir "La suma de los dos números origina un número par."
					Escribir "Dicho número es: " userNum1+userNum2
				SiNo
					Escribir "La suma de estos dos números no origina un número par."
				FinSi
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
