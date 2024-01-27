// Se requiere determinar la hipotenusa de un triángulo rectángulo. El teorema de Pitágoras indica que C2 = A2 + B2, donde C es la hipotenusa, A es un cateto y B es otro cateto.
Funcion pitagoras_resolver
	Escribir "+-------------------------------------+"
	Escribir "Calculadora edición Teorema de Pitágoras"
	Escribir "+-------------------------------------+"
	Escribir "¿Cuánto es el valor del cateto A?"
	Leer side_a
	Escribir "¿Cuánto es el valor del cateto B"
	Leer side_b
	Escribir "+-------------------------------------+"
	
	side_c = Subcadena(ConvertirATexto(raiz(side_a^2 + side_b^2)),1,4)
	Escribir "El valor de la hipotenusa de este triángulo es: " side_c
	Escribir "+-------------------------------------+"
FinFuncion

Algoritmo FPU1Prob4_DFPS
	Definir side_a Como Real
	Definir side_b Como Real
	Definir side_c Como Caracter
	Definir continue Como Caracter
	Definir breakout Como Logico
	
	// Primera ejecución
	pitagoras_resolver()
	
	// Loop
	Repetir
		Escribir "¿Quieres encontrar la hipotenusa de otro triángulo? (s/n)"
		Leer continue
		Segun continue Hacer
			"si" o "s":
				Limpiar Pantalla
				pitagoras_resolver()
			"no" o "n":
				breakout = Verdadero
			De Otro Modo:
				Escribir "No ingresaste una opción válida. El programa se cerrará." Sin Saltar
				breakout = Verdadero
		Fin Segun
	Hasta Que breakout=Verdadero
	
	Escribir "¡Nos vemos pronto!"
	
FinAlgoritmo
