// Leer dos n�meros enteros de dos digitos y determinar si la suma de los dos n�meros origina un n�mero par.
Algoritmo FPU2Prob13_DFPS
	Definir userNum1, userNum2 Como Entero
	
	Repetir
		Escribir "Ingresa un primer n�mero de dos d�gitos: " Sin Saltar
		Leer userNum1
	Mientras que abs(userNum1)<10 o abs(userNum1)>99
	
	Repetir
		Escribir "Ingresa un segundo n�mero de dos d�gitos: " Sin Saltar
		Leer userNum2
	Mientras que abs(userNum2)<10 o abs(userNum2)>99
	
	Si (userNum1+userNum2)%2==0 Entonces
		Escribir "+----------------------------------------+"
		Escribir "La suma de los dos n�meros origina un n�mero par."
		Escribir "Dicho n�mero es: " userNum1+userNum2
	SiNo
		Escribir "La suma de estos dos n�meros no origina un n�mero par."
	FinSi
FinAlgoritmo
