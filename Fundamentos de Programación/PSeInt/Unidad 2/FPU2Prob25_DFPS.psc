// Se requiere determinar cuánto dinero ahorra una persona en un año si considera que cada
// semana ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el sueldo).
Algoritmo FPU2Prob25_DFPS
	Definir salaryPerWeek, savedMoney Como Real
	
	Escribir "Ingresa tu salario semanal: " Sin Saltar
	Leer salaryPerWeek
	
	savedMoney = 12*(4*(salaryPerWeek*0.15))
	Escribir "Si ahorraras el 15% de tu salario semanal durante 1 año, tendrías la cantidad de " savedMoney " MXN."
	
FinAlgoritmo
