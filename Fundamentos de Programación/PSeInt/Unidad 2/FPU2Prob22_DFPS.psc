// Se requiere determinar cuánto cobrar por trabajos de pintura. Considere que se cobra por m2.
Algoritmo FPU2Prob22_DFPS
	Definir costPerSimpleMeter, customerRequest como Real
	costPerSimpleMeter = 9.5
	
	Escribir "-------------------------------"
	Escribir "Cotización trabajos de pintura"
	Escribir "-------------------------------"
	Escribir "Costo por metro cuadrado: " costPerSimpleMeter^2
	Escribir "-------------------------------"
	
	Escribir "¿Cuántos metros cuadrados quieres que pintemos?: " Sin saltar
	Leer customerRequest
	Escribir "-------------------------------"
	Escribir "El total sería de $" customerRequest*(costPerSimpleMeter^2)
	
FinAlgoritmo
