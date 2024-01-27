// Se requiere determinar la hipotenusa de un tri�ngulo rect�ngulo. El teorema de Pit�goras indica que C2 = A2 + B2, donde C es la hipotenusa, A es un cateto y B es otro cateto.
Funcion pitagoras_resolver
	Escribir "+-------------------------------------+"
	Escribir "Calculadora edici�n Teorema de Pit�goras"
	Escribir "+-------------------------------------+"
	Escribir "�Cu�nto es el valor del cateto A?"
	Leer side_a
	Escribir "�Cu�nto es el valor del cateto B"
	Leer side_b
	Escribir "+-------------------------------------+"
	
	side_c = Subcadena(ConvertirATexto(raiz(side_a^2 + side_b^2)),1,4)
	Escribir "El valor de la hipotenusa de este tri�ngulo es: " side_c
	Escribir "+-------------------------------------+"
FinFuncion

Algoritmo FPU1Prob4_DFPS
	Definir side_a Como Real
	Definir side_b Como Real
	Definir side_c Como Caracter
	Definir continue Como Caracter
	Definir breakout Como Logico
	
	// Primera ejecuci�n
	pitagoras_resolver()
	
	// Loop
	Repetir
		Escribir "�Quieres encontrar la hipotenusa de otro tri�ngulo? (s/n)"
		Leer continue
		Segun continue Hacer
			"si" o "s":
				Limpiar Pantalla
				pitagoras_resolver()
			"no" o "n":
				breakout = Verdadero
			De Otro Modo:
				Escribir "No ingresaste una opci�n v�lida. El programa se cerrar�." Sin Saltar
				breakout = Verdadero
		Fin Segun
	Hasta Que breakout=Verdadero
	
	Escribir "�Nos vemos pronto!"
	
FinAlgoritmo
