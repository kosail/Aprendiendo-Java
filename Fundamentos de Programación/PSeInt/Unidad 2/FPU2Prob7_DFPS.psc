// Leer un n�mero entero de dos d�gitos y determinar si es primo y adem�s si es negativo.

Algoritmo FPU2Prob7_DFPS
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un n�mero de dos d�gitos: " Sin Saltar
		Leer userNum
	Mientras que abs(userNum)<10 o abs(userNum)>99
	
	Si userNum%2<>0 y userNum<0 Entonces
		Escribir "El n�mero " userNum " es primo y negativo."
	SiNo
		Escribir "El n�mero no cumple con las condiciones de ser primo y negativo"
	FinSi
	
FinAlgoritmo
