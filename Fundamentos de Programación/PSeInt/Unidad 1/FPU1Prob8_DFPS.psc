// Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la persona de mayor edad. Realice el algoritmo correspondiente.
Algoritmo FPU1Prob8_DFPS
	Dimension names[3]
	Dimension ages[3]
	
	Escribir "+-------------------------------------+"
	Escribir "Programa para encontrar al más viejote"
	Escribir "+-------------------------------------+"
	Escribir "Ingresa el nombre de las 3 personas a comparar"
	
	// Almacenar los nombres que provea el usuario en una dimensión para optimizar código
	Para i=1 hasta 3 Con Paso 1 Hacer
		Leer names[i]
	Fin Para
	
	// Almacenar las edades que provea el usuario en la dimensión ages, coincidiendo con las mismas direcciones en la dimensión names
	Para i=1 hasta 3 Con Paso 1 Hacer
		Escribir "Ingresa la edad de " names[i] ":"
		Leer ages[i]
	Fin Para
	
	// Comparar edades e imprimir la información del más viejote.
	Si ages[1] > ages[2] Entonces
		Si ages[1] > ages[3] Entonces
			Escribir "El más viejote es " names[1] " con " ages[1] " años de edad."
		SiNo
			Escribir "El más viejote es " names[3] " con " ages[3] " años de edad."
		FinSi
	SiNo
		Si ages[2] > ages[3] Entonces
			Escribir "El más viejote es " names[2] " con " ages[2] " años de edad."
		SiNo
			Escribir "El más viejote es " names[3] " con " ages[3] " años de edad."
		FinSi
	FinSi
	
FinAlgoritmo
