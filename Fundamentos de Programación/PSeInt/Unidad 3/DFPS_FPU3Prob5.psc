// Leer dos números y mostrar todos los números terminados en 4 comprendidos entre ellos.
Algoritmo DFPS_FPU3Prob5
	Definir userNum1, userNum2 Como Entero
	
	Escribir "Ingresa dos números enteros, uno a la vez: "
	Leer userNum1
	Leer userNum2
	
	Si userNum2>userNum1 Entonces
		Para i=userNum1 Hasta userNum2 Con Paso 1 Hacer
			Si abs(i%10)==4 Entonces
				Escribir i " " Sin saltar
			FinSi
		FinPara
	SiNo
		Para i=userNum1 Hasta userNum2 Con Paso -1 Hacer
			Si abs(i%10)==4 Entonces
				Escribir i " " Sin Saltar
			FinSi
		FinPara
	FinSi
	
	Escribir ""
	
FinAlgoritmo