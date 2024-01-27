// Leer un número entero de dos dígitos menor que 20 y determinar si es primo
Algoritmo FPU2Prob6_DFPS
	Definir userNum Como Entero
	
	Escribir "Ingresa un número de dos dígitos menor que 20: " Sin Saltar
	Leer userNum
	
	Si userNum>=-99 y userNum<=20 Entonces
		Si userNum%2<>0 Entonces
			Escribir "El número " userNum " es primo."
		SiNo
			Escribir "El número no es primo"
		FinSi
	SiNo
		Escribir "El número que ingresaste es mayor que 20 o sobrepasa los 2 dígitos negativos."
		Escribir "Vuelve a intentarlo"
	FinSi
	
FinAlgoritmo
