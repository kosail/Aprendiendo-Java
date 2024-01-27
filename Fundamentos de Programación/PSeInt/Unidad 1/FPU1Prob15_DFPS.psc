// Se requiere un algoritmo para determinar, de N cantidades, cuántas son menores o iguales a cero y cuántas mayores a cero. 
Algoritmo FPU1Prob15_DFPS
	Definir userInputNumber,zeroMinors, zeroMajors como Real
	Definir breakout como caracter
	zeroMinors = 0 ; zeroMajors = 0
	
	Escribir "+-------------------------------------+"
	Escribir "Calculadora de números < o > que cero"
	Escribir "+-------------------------------------+"
	Escribir ""
	Escribir "Ingresa cuantos números quieras, solo uno a la vez: " Sin saltar
	
	Repetir
		Leer userInputNumber
		Si userInputNumber <= 0 Entonces
			zeroMinors = zeroMinors + 1
		SiNo
			zeroMajors = zeroMajors + 1
		FinSi
		
		Escribir "¿Deseas sumar otro número? (s/n): " Sin saltar
		Leer breakout
	Hasta Que breakout == "n"
	
	Escribir "+-------------------------------------+"
	Escribir ""
	Escribir "La cantidad de números menores que cero es de " zeroMinors ", y la cantidad de números mayores que cero es de " zeroMajors "."
	
FinAlgoritmo
