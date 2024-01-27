// Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad ?como deficiencia cardiaca o diabetes?, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo 10%. Todos estos cargos se realizan sobre el costo base. Realice el algoritmo para determinar cuánto le cuesta a una persona contratar una póliza.
Algoritmo FPU1Prob10_DFPS
	Definir mountToPay,userChoice,questionsAnswers Como Entero
	Dimension coverages[2]
	coverages[1] = 1200
	coverages[2] = 950

	Escribir "+-------------------------------------------+"
	Escribir "Consultoría de precios por poliza de seguros"
	Escribir "+-------------------------------------------+"
	Escribir "¿Qué poliza tienes?"
	Escribir "1) Poliza de cobertura amplia (Poliza A)"
	Escribir "2) Poliza de daños a terceros (Poliza B)"
	Escribir ""
	Escribir "Tengo la póliza: " Sin Saltar
	Leer userChoice
	
	Si userChoice <= 0 o userChoice >= 3 Entonces
		Escribir "Por favor, ingresa el número de la poliza con la que cuentas:" Sin Saltar
		Leer userChoice
		Si userChoice <= 0 o userChoice >= 3 Entonces
			Escribir "No recibimos una opción válida por segunda vez. Cerrando el programa."
		FinSi
		
		// Insertar aquí el código hecho función
	SiNo
		// Convertir lo siguiente en función
		amountToPay = coverages[userChoice] 
		Escribir "¿Bebes alcohol frecuentemente?"
		Escribir "1) Si"
		Escribir "2) No"
		Leer questionsAnswers
		Si questionsAnswers == 1 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.10
		FinSi
		
		Escribir "¿Usas lentes? (Ya sea pupilentes o lentes normales)"
		Escribir "1) Si"
		Escribir "2) No"
		Leer questionsAnswers
		Si questionsAnswers == 1 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.05
		FinSi
		
		Escribir "¿Padeces de alguna enfermedad (como deficiencia cardiaca o diábetes)?"
		Escribir "1) Si"
		Escribir "2) No"
		Leer questionsAnswers
		Si questionsAnswers == 1 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.05
		FinSi
		
		Escribir "Qué edad tienes?"
		Escribir "Ingresa solo tu edad en números: " Sin saltar
		Leer questionsAnswers
		Si questionsAnswers > 40 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.20
		SiNo
			amountToPay = amountToPay + coverages[userChoice] * 0.10
		FinSi
	FinSi
	
	// Output
	Escribir "El precio que debes pagar por tu póliza es de $" amountToPay "."

FinAlgoritmo
