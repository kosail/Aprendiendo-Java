// Leer números hasta que digiten 0 y determinar a cuánto es igual el promedio entero de los números primos leídos.
Algoritmo DFPS_FPU3Prob32
	Definir num, numSum, counter como entero
	
	Repetir
		num=0
		numSum=0
		counter=0
		
		Escribir "Ingresa un número: " Sin Saltar
		Leer num
		
		Para i=0 Hasta num Con Paso 1 Hacer
			Si i%2<>0 Entonces
				numSum=numSum+i
				counter = counter + 1
			FinSi
		FinPara
		
		Si num<>0 Entonces
			Escribir redon(numSum/counter)	
		FinSi
		
	Mientras Que num<>0
	
FinAlgoritmo