// Realice un algoritmo para leer las calificaciones de N alumnos y determine el número de aprobados y reprobados.
Algoritmo FPU1Prob13_DFPS
	Definir numberOfStudents, minimumScoreRequired, approvedStudentsCount, failedStudentsCount Como Entero
	Definir breakout como logico // variable para romper el ciclo en el procesamiento de datos
	minimumScoreRequired = 70; approvedStudentsCount = 0; failedStudentsCount = 0
	breakout = Verdadero
	
	Escribir "+-------------------------------------+"
	Escribir "        Estatus de estudiantes"
	Escribir "+-------------------------------------+"
	Escribir "Ingresa el número de estudiantes a los que quieres evaluar:" Sin Saltar
	
	
	Repetir
		Leer numberOfStudents
		Si numberOfStudents <= 0 Entonces
			Escribir "Tienes que ingresar un número positivo."
			breakout = Falso
		SiNo
			Dimension studentScoresTable[numberOfStudents,2]
			Dimension studentNamesTable[numberOfStudents,2]
			
			Para i=1 Hasta numberOfStudents con paso 1 hacer
				Escribir "Ingresa el nombre del estudiante:" Sin Saltar
				Leer studentNamesTable[i,1]
				Escribir "Ingresa la calificación final de " studentNamesTable[i,1] ":" Sin Saltar
				Leer studentScoresTable[redon(i),2] // redon para asegurar que no se van a ingresar notas con punto flotante, sino que todas serán enteras.
				Escribir ""
			FinPara
			
			Para i=1 Hasta numberOfStudents Con Paso 1 Hacer
				Si studentScoresTable[i,2] >= 70 Entonces
					approvedStudentsCount = approvedStudentsCount + 1
				Sino
					failedStudentsCount = failedStudentsCount + 1
				FinSi
			FinPara
			
			Escribir "---------------------------------------"
			Escribir "Número de aprobados: " Sin saltar; Escribir approvedStudentsCount
			Escribir "Número de reprobados: " Sin saltar; Escribir failedStudentsCount
			Escribir "---------------------------------------"
		FinSi
	Hasta Que breakout = Verdadero
	
	
	
FinAlgoritmo
