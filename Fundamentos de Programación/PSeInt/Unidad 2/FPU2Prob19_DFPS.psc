// Leer tres números enteros y mostrarlos ascendentemente.
Algoritmo FPU2Prob19_DFPS
	Definir numArray, numOrderedArray Como Entero
	Dimension numArray[3], numOrderedArray[3]
	
	Escribir "Ingresa el primer número de tres dígitos: " Sin Saltar
	Leer numArray[1]
	Escribir "Ingresa el segundo número de tres dígitos: " Sin Saltar
	Leer numArray[2]
	Escribir "Ingresa el tercer número de tres dígitos: " Sin Saltar
	Leer numArray[3]
	

	Si numArray[1] < numArray[2] Entonces
		Si numArray[2] < numArray[3] Entonces
			numOrderedArray[1] = numArray[3]
			numOrderedArray[2] = numArray[2]
			numOrderedArray[3] = numArray[1]
		SiNo
			numOrderedArray[1] = numArray[2]
			
			Si numArray[1] < numArray[3] Entonces
				numOrderedArray[2] = numArray[3]
				numOrderedArray[3] = numArray[1]
			SiNo
				numOrderedArray[2] = numArray[1]
				numOrderedArray[3] = numArray[3]
			FinSi
		FinSi
	SiNo
		Si numArray[1] < numArray[3] Entonces
			numOrderedArray[1] = numArray[3]
			numOrderedArray[2] = numArray[1]
			numOrderedArray[3] = numArray[2]
		SiNo
			numOrderedArray[1] = numArray[1]
			
			Si numArray[2] < numArray[3] Entonces
				numOrderedArray[2] = numArray[3]
				numOrderedArray[3] = numArray[2]
			SiNo
				numOrderedArray[2] = numArray[2]
				numOrderedArray[3] = numArray[3]
			FinSi
		FinSi
	FinSi
	
	Escribir "El orden ascendente de los números es: "
	Para i=3 Hasta 1 Con Paso -1 Hacer
		Escribir "-> " numOrderedArray[i]
	FinPara
	
FinAlgoritmo
