// Determinar el pago que debe realizar una persona por el total de metros c�bicos que consume de agua.
Algoritmo FPU1Prob5_DFPS
	Definir cubic_meter_price Como entero
	Definir water_consumption Como Real
	cubic_meter_price = 121
	
	Escribir "+-------------------------------------+"
	Escribir "Calculadora del precio del agua"
	Escribir "+-------------------------------------+"
	Escribir "La tarifa actual del agua es de $" cubic_meter_price " por metro c�bico, o $" cubic_meter_price/1000 " el litro."
	Escribir "�Cu�ntos metros c�bicos de agua consumiste este mes?"
	Leer water_consumption
	Escribir "+-------------------------------------+"
	Escribir "El pago que debes realizar es de $" cubic_meter_price*water_consumption "."
	
FinAlgoritmo
