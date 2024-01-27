// Una compa��a de seguros para autos ofrece dos tipos de p�liza: cobertura amplia (A) y da�os a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A ambos planes se les carga 10% del costo si la persona que conduce tiene por h�bito beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad ?como deficiencia cardiaca o diabetes?, y si tiene m�s de 40 a�os, se le carga 20%, de lo contrario s�lo 10%. Todos estos cargos se realizan sobre el costo base. Realice el algoritmo para determinar cu�nto le cuesta a una persona contratar una p�liza.
Algoritmo FPU1Prob10_DFPS
	Definir mountToPay,userChoice,questionsAnswers Como Entero
	Dimension coverages[2]
	coverages[1] = 1200
	coverages[2] = 950

	Escribir "+-------------------------------------------+"
	Escribir "Consultor�a de precios por poliza de seguros"
	Escribir "+-------------------------------------------+"
	Escribir "�Qu� poliza tienes?"
	Escribir "1) Poliza de cobertura amplia (Poliza A)"
	Escribir "2) Poliza de da�os a terceros (Poliza B)"
	Escribir ""
	Escribir "Tengo la p�liza: " Sin Saltar
	Leer userChoice
	
	Si userChoice <= 0 o userChoice >= 3 Entonces
		Escribir "Por favor, ingresa el n�mero de la poliza con la que cuentas:" Sin Saltar
		Leer userChoice
		Si userChoice <= 0 o userChoice >= 3 Entonces
			Escribir "No recibimos una opci�n v�lida por segunda vez. Cerrando el programa."
		FinSi
		
		// Insertar aqu� el c�digo hecho funci�n
	SiNo
		// Convertir lo siguiente en funci�n
		amountToPay = coverages[userChoice] 
		Escribir "�Bebes alcohol frecuentemente?"
		Escribir "1) Si"
		Escribir "2) No"
		Leer questionsAnswers
		Si questionsAnswers == 1 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.10
		FinSi
		
		Escribir "�Usas lentes? (Ya sea pupilentes o lentes normales)"
		Escribir "1) Si"
		Escribir "2) No"
		Leer questionsAnswers
		Si questionsAnswers == 1 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.05
		FinSi
		
		Escribir "�Padeces de alguna enfermedad (como deficiencia cardiaca o di�betes)?"
		Escribir "1) Si"
		Escribir "2) No"
		Leer questionsAnswers
		Si questionsAnswers == 1 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.05
		FinSi
		
		Escribir "Qu� edad tienes?"
		Escribir "Ingresa solo tu edad en n�meros: " Sin saltar
		Leer questionsAnswers
		Si questionsAnswers > 40 Entonces
			amountToPay = amountToPay + coverages[userChoice] * 0.20
		SiNo
			amountToPay = amountToPay + coverages[userChoice] * 0.10
		FinSi
	FinSi
	
	// Output
	Escribir "El precio que debes pagar por tu p�liza es de $" amountToPay "."

FinAlgoritmo
