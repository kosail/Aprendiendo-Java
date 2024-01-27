// Leer un número entero de 3 dígitos y determinar si tienen el dígito 1.
Algoritmo DFPS_FPU3Prob12
	Definir userNum, numArray Como Entero
	Definir presenceOfOne como Logico
	Dimension numArray[3]
	
	Repetir
		Escribir "Ingresa un número de tres dígitos: " Sin Saltar
		Leer userNum
	Mientras Que abs(userNum)<100 o abs(userNum)>999
	
	numArray[1] = trunc(userNum/100)
	numArray[2] = trunc(userNum/10)%10
	numArray[3] = userNum%10
	
	Para i=1 Hasta 3 Con Paso 1 Hacer
		Si abs(numArray[i])==1 Entonces
			presenceOfOne = Verdadero
		FinSi
	FinPara
	
	Si presenceOfOne==Falso Entonces
		Escribir "No hay dígitos 1 en el número ingresado"
	SiNo
		Escribir "El número " userNum " sí contiene el dígito 1."
	FinSi
	
FinAlgoritmo