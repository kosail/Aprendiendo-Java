// Leer un n�mero entero y determinar cu�ntos d�gitos tiene.
Algoritmo DFPS_FPU3Prob20
	Definir userNum, counter Como Entero
	counter=1
	
	Escribir "Ingresa un n�mero: " Sin Saltar
	Leer userNum
	
	Repetir
		Si trunc(userNum/10)<>0 Entonces
			counter=counter+1
		FinSi
		userNum = trunc(userNum/10)
	Mientras Que trunc(userNum)<>0
	
	Escribir "D�gitos en total: " counter
	
FinAlgoritmo