// El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le permita determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes: Las dos primeras horas a $10.00 c/u. Las siguientes tres a $8.00 c/u. Las cinco siguientes a $6.00 c/u. Después de diez horas el costo por cada una es de dos pesos.
Algoritmo FPU1Prob7_DFPS
	Definir hoursStayed Como Real
	Definir amountToPay Como Real
	
	Escribir "+--------------------------------------+"
	Escribir "Calculadora de Tarifa de Estacionamiento"
	Escribir "+--------------------------------------+"
	Escribir "¿Cuántas horas dejaste tu vehículo en el estacionamiento?"
	Leer hoursStayed
	
	Si hoursStayed <= 2 Entonces
		amountToPay = hoursStayed * 10
	SiNo
		Si hoursStayed <= 5 Entonces
			amountToPay = (2*10) + (hoursStayed - 2) * 8
		SiNo
			Si hoursStayed <= 10 Entonces
				amountToPay = (2*10) + (3*8) + (hoursStayed - 5) * 6
			SiNo
				Si hoursStayed > 10 Entonces
					amountToPay = (2*10) + (3*8) + (5*6) + (hoursStayed - 10) * 2
				FinSi
			FinSi
		FinSi
	FinSi
	
	Escribir "La tarifa que debes pagar por permanecer " hoursStayed " horas en el estacionamiento es de $" amountToPay
	
FinAlgoritmo
