// Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada hora se considera como excedente y se paga el doble.
Algoritmo FPU1Prob6_DFPS
	
	Definir workedHours Como Entero
	Definir salaryPerHour Como Entero
	Definir weeklyPayroll Como Entero
	Definir breakout Como Logico
	salaryPerHour = 50
	
	Escribir "+-------------------------------------+"
	Escribir "Calculadora de salario (con función de horas extra incluida)"
	Escribir "+-------------------------------------+"
	Escribir "El pago por hora de esta empresa es de $" salaryPerHour " por hora."
	Escribir "¿Cuántas horas completas trabajaste esta semana?"
	
	// Condicional: si mete un valor menor a cero, lanza error y repite el código para preguntarle las horas
	Repetir
		Leer workedHours
		Si workedHours < 0 Entonces
			Escribir "Por favor, ingresa un número de horas completas válido."
		SiNo
			Si workedHours <= 40 Entonces
				weeklyPayroll = salaryPerHour * workedHours
			SiNo
				// Multiplica el salario por hora por 40 para pagarle las 40 horas de modo normal, y le suma las horas excedentes a 40 por el salario multiplicado en 2
				weeklyPayroll = salaryPerHour * 40 + (workedHours - 40) * salaryPerHour * 2 
			FinSi
			Escribir "Tu salario de esta semana es $" weeklyPayroll "."
			breakout = Verdadero
		FinSi
	Hasta Que breakout = Verdadero
	
FinAlgoritmo
