// Muestre el nombre del día de la semana que corresponde a un número proporcionado entre 1 y
// 7 inclusive, asociando el 1 al lunes y así sucesivamente hasta asociar el 7 al domingo.

Algoritmo FPU2Prob29_DFPS
	Definir userEntry Como Entero
	
	Escribir "Ingresa un número del 1 al 7, inclusive: " Sin saltar
	Leer userEntry
	
	Segun userEntry Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Miércoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "Sábado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "No ingresaste una opción válida."
	Fin Segun
FinAlgoritmo
