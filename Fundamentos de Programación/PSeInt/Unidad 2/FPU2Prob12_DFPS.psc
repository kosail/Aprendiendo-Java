// Leer dos números enteros de dos digitos y determinar si tienen digitos comunes.
Algoritmo FPU2Prob12_DFPS
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
				
				Si digitTwoOne==digitOneOne o digitTwoOne==digitOneTwo o digitTwoTwo==digitOneOne o digitTwoTwo==digitOneTwo Entonces
					Escribir "Los números tienen digitos en común."
				SiNo
					Escribir "Los numeros no tienen dígitos en común"
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
