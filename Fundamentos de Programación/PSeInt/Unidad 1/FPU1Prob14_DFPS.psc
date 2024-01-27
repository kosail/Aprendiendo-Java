// Un trabajador tiene un salario inicial de $1500,
// y recibe un incremento de 10 % anual durante 6 años. ¿Cuál es su salario al cabo de 6 años?
// ¿Qué salario ha recibido en cada uno de los 6 años?
Algoritmo FPU1Prob14_DFPS
	Definir initialSalary Como Entero
	initialSalary = 1500
	
	Escribir "+-------------------------------------+"
	Escribir "Calculadora de salarios por año"
	Escribir "+-------------------------------------+"
	
	Para i <- 1 Hasta 6 con paso 1 hacer
		Si i <> 1 Entonces
			initialSalary = redon(initialSalary + initialSalary * 0.10)
		FinSi
		Escribir "Tu salario en el año " i " será de $" initialSalary
	FinPara
	
FinAlgoritmo
