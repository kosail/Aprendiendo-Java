// Leer n�meros hasta que digiten 0 y determinar a cu�nto es igual el promedio entero de los n�meros primos le�dos.
Algoritmo DFPS_FPU3Prob32
	Definir num, numSum, counter como entero
	
	Repetir
		num=0
		numSum=0
		counter=0
		
		Escribir "Ingresa un n�mero: " Sin Saltar
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