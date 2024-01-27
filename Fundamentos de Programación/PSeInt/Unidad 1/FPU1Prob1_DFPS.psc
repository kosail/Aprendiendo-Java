// Determinar el promedio que obtendrá un alumno considerando que realiza tres exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de 50%.
Algoritmo FPU1Prob1_DFPS
	// Declarando variables
	definir score_1 Como Entero
	definir score_2 Como Entero
	definir score_3 como entero
	
	// Procesamiento
	Escribir "+-------------------------------------+"
	Escribir "Promediador de notas"
	Escribir "+-------------------------------------+"
	Escribir "Ingresa las calificaciones una por una:"
	Leer score_1, score_2, score_3
	
	definir average_score Como entero
	average_score = redon(score_1 * 0.25 + score_2 * 0.25 + score_3 * 0.50)
	Escribir "---------------------------------------"
	Escribir "Promedio final es: " average_score
FinAlgoritmo
