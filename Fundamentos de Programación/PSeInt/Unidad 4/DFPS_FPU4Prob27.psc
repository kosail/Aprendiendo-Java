// Leer 7 n�meros enteros, almacenarlos en un vector y determinar a cu�nto es igual el promedio entero de los n�meros pares en el vector.
Algoritmo DFPS_FPU4Prob27
	Definir sum, evenCounter Como Entero
	Dimension numbers[7]
	sum = 0
	evenCounter = 0
	
	Escribir "Ingresa 7 n�meros enteros, uno a la vez: " Sin Saltar
	Para i=1 Hasta 7 Con Paso 1 Hacer
		Leer numbers[i]
		
		Si numbers[i]%2==0 Entonces
			sum = sum + numbers[i]
			evenCounter = evenCounter + 1;
		FinSi
	FinPara
	
	Escribir "Promedio: " sum/evenCounter
	
FinAlgoritmo
