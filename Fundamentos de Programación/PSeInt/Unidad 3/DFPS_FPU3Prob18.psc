// Leer dos números enteros y mostrar todos los múltiplos de 5 comprendidos entre el menor y el mayor.
Algoritmo DFPS_FPU3Prob18
	Definir num1, num2 Como Entero
	
	Escribir "Ingresa dos números enteros, uno a la vez: "
	Leer num1, num2
	Si num2>num1 Entonces
		Para i=num1 Hasta num2 Con Paso 1 Hacer
			Si i%5==0 Entonces
				Escribir i " " Sin Saltar
			FinSi
		FinPara
	SiNo
		Para i=num2 Hasta num1 Con Paso 1 Hacer
			Si i%5==0 Entonces
				Escribir i " " Sin Saltar
			FinSi
		FinPara
	FinSi
	
	Escribir " "
	
FinAlgoritmo