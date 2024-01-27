// Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan.
// Considere que el cobro es con base en las horas que lo utilizan y que las fracciones de hora se toman como completas.
Algoritmo FPU2Prob21_DFPS
	Definir ratePerHour, minutesStayed, hoursStayed, amountToPay como Entero
	ratePerHour = 20
	
	Escribir "-------------------------------"
	Escribir "Calculadora de costos de parking"
	Escribir "-------------------------------"
	Escribir "*Considera que las fracciones de hora se toman como completas*"
	Escribir ""
	Escribir "Ingresa la cantidad de horas que estuviste en el estacionamiento: " Sin Saltar
	Leer hoursStayed
	
	Repetir
		Escribir "Ingresa la cantidad de minutos que estuviste en el estacionamiento: " Sin Saltar
		Leer minutesStayed
	Mientras Que minutesStayed<0 o minutesStayed>60
	
	Si minutesStayed == 0 Entonces
		amountToPay = ratePerHour*hoursStayed
	SiNo
		amountToPay = ratePerHour*(hoursStayed+1)
	FinSi
	
	
	
	Escribir "-------------------------------"
	Escribir "El monto que debes pagar es de " amountToPay "MXN."
	
FinAlgoritmo
