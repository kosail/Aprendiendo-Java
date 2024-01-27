// Leer tres numeros enteros y determinar cuál es el mayor. Usar solamente dos variables
Algoritmo FPU2Prob18_DFPS
	Definir num1, num2 Como Entero
	
	Escribir "Ingresa el primer número de tres dígitos: " Sin Saltar
	Leer num1
	Escribir "Ingresa el segundo número de tres dígitos: " Sin Saltar
	Leer num2
	Escribir "Ingresa el tercer número de tres dígitos: " Sin Saltar
	
	Si num1>num2 Entonces
		Leer num2
	Sino
		Leer num1
	FinSi
	
	Si num1>num2 Entonces
		Escribir "El número mayor es " num1
	Sino
		Escribir "El número mayor es " num2
	FinSi
	
FinAlgoritmo
