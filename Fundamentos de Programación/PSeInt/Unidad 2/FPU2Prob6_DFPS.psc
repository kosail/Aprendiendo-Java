// Leer un n�mero entero de dos d�gitos menor que 20 y determinar si es primo
Algoritmo FPU2Prob6_DFPS
	Definir userNum Como Entero
	
	Escribir "Ingresa un n�mero de dos d�gitos menor que 20: " Sin Saltar
	Leer userNum
	
	Si userNum>=-99 y userNum<=20 Entonces
		Si userNum%2<>0 Entonces
			Escribir "El n�mero " userNum " es primo."
		SiNo
			Escribir "El n�mero no es primo"
		FinSi
	SiNo
		Escribir "El n�mero que ingresaste es mayor que 20 o sobrepasa los 2 d�gitos negativos."
		Escribir "Vuelve a intentarlo"
	FinSi
	
FinAlgoritmo
