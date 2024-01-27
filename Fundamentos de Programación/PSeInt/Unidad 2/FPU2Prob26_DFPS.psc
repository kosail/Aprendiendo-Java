// El director de una escuela est� organizando un viaje de estudios, y requiere determinar cu�nto
// debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma
// de cobrar es la siguiente: si son 100 alumnos o m�s, el costo por cada alumno es de $50.00; de 50
// a 99 alumnos, el costo es de $70.00, de 30 a 49, de $90.00, y si son menos de 30, el costo de la
// renta del autob�s es de $4000.00, sin importar el n�mero de alumnos.
Algoritmo FPU2Prob26_DFPS
	Definir numberOfStudents Como Entero
	Definir travelAgencyPayment, ratePerStudent Como Real
	
	Escribir "Ingresa el n�mero de estudiantes que ir�n al viaje: "
	Escribir "---------------------------------------------"
	Leer numberOfStudents
	
	Si numberOfStudents>=100 Entonces
		ratePerStudent = 50
	SiNo
		Si numberOfStudents>=50 y numberOfStudents<=99 Entonces
			ratePerStudent = 70
		SiNo
			Si numberOfStudents>=30 y numberOfStudents<=49 Entonces
				ratePerStudent = 90
			SiNo
				Si numberOfStudents>=1 y numberOfStudents<=29 Entonces
					ratePerStudent = 4000/numberOfStudents
				SiNo
					Escribir "No ingresaste una cantidad v�lida de estudiantes."
				FinSi
			FinSi
		FinSi
	FinSi
	
	Si numberOfStudents>=1 y numberOfStudents<=29 Entonces
		travelAgencyPayment = 4000
	SiNo
		travelAgencyPayment = numberOfStudents * ratePerStudent
	FinSi
	
	Escribir "El total de cobrar a los estudiantes es de " redon(ratePerStudent) " MXN."
	Escribir "El total a pagar a la agencia es de " travelAgencyPayment " MXN."
	
FinAlgoritmo
