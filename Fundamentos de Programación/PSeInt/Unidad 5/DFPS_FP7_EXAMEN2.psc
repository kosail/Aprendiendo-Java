Funcion arrayFiller ( mainArray )
	Para i=1 Hasta 3 Con Paso 1 Hacer
		Para j=1 Hasta 5 con Paso 1 Hacer
			mainArray[i, j] = azar(1000)
		FinPara
	FinPara
Fin Funcion

Funcion counter <- digitFiveOcurrence ( mainArray )
	Definir counter Como Entero
	counter = 0
	
	Para i=1 Hasta 3 Con Paso 1 Hacer
		Para j=1 Hasta 5 con Paso 1 Hacer
			Si mainArray[i, j]%5 == 0 Entonces
				counter = counter + 1;
			FinSi
		FinPara
	FinPara
Fin Funcion


Algoritmo DFPS_FP7_EXAMEN2
	Definir mainArray Como Entero
	Dimension mainArray[3, 5]
	
	arrayFiller(mainArray)
	
	Escribir "Contenido arreglo: "
	Para i=1 Hasta 3 Con Paso 1 Hacer
		Para j=1 Hasta 5 con Paso 1 Hacer
			Escribir mainArray[i, j], " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Escribir "Cantidad múltiplos de cinco: ", digitFiveOcurrence(mainArray)
FinAlgoritmo
