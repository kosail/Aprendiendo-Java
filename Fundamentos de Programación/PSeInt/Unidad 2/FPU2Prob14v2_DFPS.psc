// Leer dos números enteros de dos digitos y determinar a cuánto es igual la suma de todos los dígitos.
Algoritmo FPU2Prob14_DFPS
	Definir userNum1, userNum2, digitOneOne, digitOneTwo, digitTwoOne, digitTwoTwo Como Entero
	
	Repetir
		Escribir "Ingresa un primer número de dos dígitos: " Sin Saltar
		Leer userNum1
	Mientras que abs(userNum1)<10 o abs(userNum1)>99
	
	Repetir
		Escribir "Ingresa un segundo número de dos dígitos: " Sin Saltar
		Leer userNum2
	Mientras que abs(userNum2)<10 o abs(userNum2)>99
	
	digitOneOne = trunc(userNum1/10)
	digitOneTwo = userNum1%10
	digitTwoOne = trunc(userNum2/10)
	digitTwoTwo= userNum2%10
	
	Escribir "+----------------------------------+"
	Escribir "La suma de todos los dígitos es: " digitOneOne+digitOneTwo+digitTwoOne+digitTwoTwo

FinAlgoritmo
