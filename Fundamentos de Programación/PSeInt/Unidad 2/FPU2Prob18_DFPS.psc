// Leer tres numeros enteros y determinar cu�l es el mayor. Usar solamente dos variables
Algoritmo FPU2Prob18_DFPS
	Definir num1, num2 Como Entero
	
	Escribir "Ingresa el primer n�mero de tres d�gitos: " Sin Saltar
	Leer num1
	Escribir "Ingresa el segundo n�mero de tres d�gitos: " Sin Saltar
	Leer num2
	Escribir "Ingresa el tercer n�mero de tres d�gitos: " Sin Saltar
	
	Si num1>num2 Entonces
		Leer num2
	Sino
		Leer num1
	FinSi
	
	Si num1>num2 Entonces
		Escribir "El n�mero mayor es " num1
	Sino
		Escribir "El n�mero mayor es " num2
	FinSi
	
FinAlgoritmo
