// Muestre el nombre del d�a de la semana que corresponde a un n�mero proporcionado entre 1 y
// 7 inclusive, asociando el 1 al lunes y as� sucesivamente hasta asociar el 7 al domingo.

Algoritmo FPU2Prob29_DFPS
	Definir userEntry Como Entero
	
	Escribir "Ingresa un n�mero del 1 al 7, inclusive: " Sin saltar
	Leer userEntry
	
	Segun userEntry Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Mi�rcoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "S�bado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "No ingresaste una opci�n v�lida."
	Fin Segun
FinAlgoritmo
