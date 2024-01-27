// Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en el tiempo
// que dura la llamada y el costo por minuto.
Algoritmo FPU2Prob24_DFPS
	Definir callTime, costPerMinute Como Real
	callTime = 3.25
	
	Escribir "Costo por minuto llamadas nacionales: " callTime " MXN"
	Escribir "----------------------------------------------------"
	Escribir "(Ingresa el tiempo de duración de la llamada en el formato MM.SS)"
	Escribir "Ingresa la cantidad de minutos de duración de la llamada: " Sin saltar
	Leer costPerMinute
	
	Escribir "--------------------------------"
	Escribir "El costo de la llamada será de " callTime*costPerMinute " MXN."
	
FinAlgoritmo
