// Leer dos números y mostrar todos los enteros comprendidos entre ellos.
Algoritmo DFPS_FPU3Prob4
	Definir userNum1, userNum2 Como Entero
	
	Escribir "Ingresa dos números enteros, uno a la vez: "
	Leer userNum1
	Leer userNum2
	
	Si userNum2>userNum1 Entonces
		Para i=userNum1 Hasta userNum2 Con Paso 1 Hacer
			Escribir i " " Sin Saltar
		FinPara
	SiNo
		Para i=userNum1 Hasta userNum2 Con Paso -1 Hacer
			Escribir i " " Sin Saltar
		FinPara
	FinSi
	
	Escribir ""
	
FinAlgoritmo