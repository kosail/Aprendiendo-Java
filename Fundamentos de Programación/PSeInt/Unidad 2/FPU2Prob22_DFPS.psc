// Se requiere determinar cu�nto cobrar por trabajos de pintura. Considere que se cobra por m2.
Algoritmo FPU2Prob22_DFPS
	Definir costPerSimpleMeter, customerRequest como Real
	costPerSimpleMeter = 9.5
	
	Escribir "-------------------------------"
	Escribir "Cotizaci�n trabajos de pintura"
	Escribir "-------------------------------"
	Escribir "Costo por metro cuadrado: " costPerSimpleMeter^2
	Escribir "-------------------------------"
	
	Escribir "�Cu�ntos metros cuadrados quieres que pintemos?: " Sin saltar
	Leer customerRequest
	Escribir "-------------------------------"
	Escribir "El total ser�a de $" customerRequest*(costPerSimpleMeter^2)
	
FinAlgoritmo
