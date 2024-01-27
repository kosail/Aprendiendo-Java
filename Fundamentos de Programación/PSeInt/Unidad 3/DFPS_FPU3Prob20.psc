// Leer un número entero y determinar cuántos dígitos tiene.
Algoritmo DFPS_FPU3Prob20
	Definir userNum, counter Como Entero
	counter=1
	
	Escribir "Ingresa un número: " Sin Saltar
	Leer userNum
	
	Repetir
		Si trunc(userNum/10)<>0 Entonces
			counter=counter+1
		FinSi
		userNum = trunc(userNum/10)
	Mientras Que trunc(userNum)<>0
	
	Escribir "Dígitos en total: " counter
	
FinAlgoritmo