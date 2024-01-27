// Leer un número entero de dos dígitos y determinar si es primo y además si es negativo.

Algoritmo FPU2Prob7_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un número de dos dígitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	Si userNum%2<>0 y userNum<0 Entonces
		Escribir "El número " userNum " es primo y negativo."
	SiNo
		Escribir "El número no cumple con las condiciones de ser primo y negativo"
	FinSi
	
FinAlgoritmo
