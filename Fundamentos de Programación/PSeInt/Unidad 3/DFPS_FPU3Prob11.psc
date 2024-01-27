// Leer un número entero de dos dígitos y mostrar en pantalla todos los enteros comprendidos entre un dígito y otro
Algoritmo DFPS_FPU3Prob11
	Definir userNum Como Entero
	
	Repetir
		Escribir "Ingresa un número de dos digitos: " Sin Saltar
		Leer userNum
	Mientras Que abs(userNum)<10 o abs(userNum)>99
	
	Para i=trunc(usernum/10) Hasta userNum%10 Hacer
		Escribir i " " Sin Saltar
	FinPara
	
	Escribir ""
FinAlgoritmo