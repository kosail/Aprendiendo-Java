// Leer dos números enteros de dos digitos y determinar si la suma de los dos números origina un número par.
Algoritmo FPU2Prob13_DFPS
	Definir userNum1, userNum2 Como Entero
	
	Repetir
		Escribir "Ingresa un primer número de dos dígitos: " Sin Saltar
		Leer userNum1
	Mientras que abs(userNum1)<10 o abs(userNum1)>99
	
	Repetir
		Escribir "Ingresa un segundo número de dos dígitos: " Sin Saltar
		Leer userNum2
	Mientras que abs(userNum2)<10 o abs(userNum2)>99
	
	Si (userNum1+userNum2)%2==0 Entonces
		Escribir "+----------------------------------------+"
		Escribir "La suma de los dos números origina un número par."
		Escribir "Dicho número es: " userNum1+userNum2
	SiNo
		Escribir "La suma de estos dos números no origina un número par."
	FinSi
FinAlgoritmo
