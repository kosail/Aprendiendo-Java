// Leer dos números enteros y determinar cuál es el mayor
Algoritmo FPU2Prob11_DFPS
	Definir userNum1, userNum2 Como Entero
	
	Repetir
		Escribir "Ingresa un primer número de dos dígitos: " Sin Saltar
		Leer userNum1
	Mientras que abs(userNum1)<10 o abs(userNum1)>99
	
	Repetir
		Escribir "Ingresa un segundo número de dos dígitos: " Sin Saltar
		Leer userNum2
	Mientras que abs(userNum2)<10 o abs(userNum2)>99

	Si userNum1>userNum2 Entonces
		Escribir userNum1 " es mayor que " userNum2
	SiNo
		Si userNum1<userNum2 Entonces
			Escribir userNum2 " es mayor que " userNum1
		SiNo
			Escribir userNum1 " y " userNum2 " son iguales."
		FinSi
	FinSi
	
FinAlgoritmo
