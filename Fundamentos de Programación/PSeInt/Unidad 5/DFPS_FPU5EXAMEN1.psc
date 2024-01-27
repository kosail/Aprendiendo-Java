// Construir un método o función que reciba como parámetro un vector de 12 enteros y que regrese el elemento mayor del vector.
// Genere los valores aleatoriamente. Muestre el contenido del arreglo y su elemento mayor, para que el usuario pueda
// corroborar los resultados.

Funcion arrayFiller (vector)
	Para i=1 Hasta 12 Con Paso 1 Hacer
		vector[i] = azar(1000)
	FinPara
Fin Funcion

Funcion biggestNumber <- biggestNumberFinder (vector, biggestNumber)
	Para i=1 Hasta 12 Con Paso 1 Hacer
		Si biggestNumber < vector[i] Entonces
			biggestNumber = vector[i]
		FinSi
	FinPara
Fin Funcion

Algoritmo examen1
	Definir vector, biggestNumber Como Entero
	Dimension vector[12]
	biggestNumber = 0
	
	arrayFiller(vector)
	biggestNumber = biggestNumberFinder(vector, biggestNumber)
	
	Escribir "Vector: " Sin Saltar
	Para i=1 Hasta 12 con paso 1 Hacer
		Escribir vector[i] " " Sin Saltar
	FinPara
	Escribir ""
	
	Escribir "Elemento mayor: " biggestNumber
FinAlgoritmo
