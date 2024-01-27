// Leer un n�mero entero de 3 d�gitos y determinar si tienen el d�gito 1.
Algoritmo DFPS_FPU3Prob12
	Definir userNum, numArray Como Entero
	Definir presenceOfOne como Logico
	Dimension numArray[3]
	
	Repetir
		Escribir "Ingresa un n�mero de tres d�gitos: " Sin Saltar
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
		Escribir "No hay d�gitos 1 en el n�mero ingresado"
	SiNo
		Escribir "El n�mero " userNum " s� contiene el d�gito 1."
	FinSi
	
FinAlgoritmo