//Muestre el nombre del mes que corresponde a un número proporcionado entre 1 y 12 inclusive,
// asociando el 1 a enero, el 2 a febrero y así sucesivamente hasta asociar el 12 a diciembre.
Algoritmo FPU2Prob27_DFPS
	Definir userEntry Como Entero
	
	Escribir "Ingresa un número del 1 al 12, inclusive: " Sin saltar
	Leer userEntry
	
	Segun userEntry Hacer
		1:
			Escribir "Enero"
		2:
			Escribir "Febrero"
		3:
			Escribir "Marzo"
		4:
			Escribir "Abril"
		5:
			Escribir "Mayo"
		6:
			Escribir "Junio"
		7:
			Escribir "Julio"
		8:
			Escribir "Agosto"
		9:
			Escribir "Septiembre"
		10:
			Escribir "Octubre"
		11:
			Escribir "Noviembre"
		12:
			Escribir "Diciembre"
		De Otro Modo:
			Escribir "No ingresaste una opción válida."
	Fin Segun
	
FinAlgoritmo
