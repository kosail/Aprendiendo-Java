// Determinar aproximadamente cuántos meses, semanas, días y horas ha vivido una persona.
Funcion time_calc_output <- time_alive_calculator(actual_date, birthday_date, start_point, end_point)
	definir time_calc_output Como Entero
	
	time_calc_output = ConvertirANumero(SubCadena(actual_date, start_point, end_point)) - ConvertirANumero(SubCadena(birthday_date, start_point, end_point))
Fin Funcion

Algoritmo FPU1Prob2_DFPS
	// Defning variables and data collection
	Definir birthday,birthday_hours,birthday_minutes,years_alive,months_alive,weeks_alive,days_alive como entero
	Definir birthday_str Como Caracter
	actual_date = ConvertirATexto(FechaActual())
	actual_time = Subcadena(ConvertirATexto(HoraActual()),1,4)
	
	Escribir "+-------------------------------------+"
	Escribir "Calculadora de edad"
	Escribir "+-------------------------------------+"
	Escribir "Ingresa tu fecha de nacimiento en este orden: AñoMesDia"
	Escribir "Sin guiones ni espacios. Ejemplo: " FechaActual()
	Leer birthday
	Escribir "Ingresa la hora en la que naciste."
	Escribir "Asegurate de solo la hora sin minutos, y de hacerlo en formato de 24 horas."
	Leer birthday_hours
	Escribir "Ingresa los minutos"
	Leer birthday_minutes
	Escribir "--------------------------------------"
	
	// Processing date
	birthday_str = ConvertirATexto(birthday)
	years_alive = time_alive_calculator(actual_date,birthday_str,1,4)
	months_alive = time_alive_calculator(actual_date,birthday_str,5,6)
	days_alive = time_alive_calculator(actual_date,birthday_str,7,8)
	
	
	// Correcting day issues when provided values are in the future (bigger than the actual date)
	Si days_alive < 0 Entonces
		months_alive = months_alive - 1
		days_alive = 30 + days_alive
	FinSi
	
	Si weeks_alive < 0 Entonces
		Escribir ""
	FinSi
	
	Si months_alive < 0 Entonces
		years_alive = years_alive - 1
		months_alive = 12 + months_alive
	FinSi
	
	// Processing time
	birthday_hours = ConvertirANumero(SubCadena(actual_time, 1, 2)) - birthday_hours
	birthday_minutes = ConvertirANumero(SubCadena(actual_time, 3, 4)) - birthday_minutes
	
	// Correcting time issues when provided valued are bigger than the actual time
	Si birthday_minutes < 0 Entonces
		birthday_hours = birthday_hours - 1
		birthday_minutes = 60 + birthday_minutes
	FinSi
	
	Si birthday_hours < 0 Entonces
		days_alive = days_alive - 1
		birthday_hours = 24 + birthday_hours
	FinSi
	
	// Code for adding support to display weeks alive
	Para i <- 1 Hasta days_alive con paso 1 hacer
		Si i%7 == 0 Entonces
			weeks_alive = weeks_alive + 1
			days_alive = days_alive - 7
		FinSi
	FinPara
	
	// Output
	Escribir "Llevas con vida " days_alive " días, " weeks_alive " semanas, "  months_alive " meses y " years_alive " años, con " birthday_hours " horas y " birthday_minutes " minutos."
	
FinAlgoritmo