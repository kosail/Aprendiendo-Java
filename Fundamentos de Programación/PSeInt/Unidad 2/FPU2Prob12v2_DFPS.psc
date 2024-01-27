// Leer dos n�meros enteros de dos digitos y determinar si tienen digitos comunes.
Algoritmo FPU2Prob12_DFPS
	Definir userNum1, userNum2, digitOneOne, digitOneTwo, digitTwoOne, digitTwoTwo Como Entero
	
	Repetir
		Escribir "Ingresa un primer n�mero de dos d�gitos: " Sin Saltar
		Leer userNum1
	Mientras que abs(userNum1)<10 o abs(userNum1)>99
	
	Repetir
		Escribir "Ingresa un segundo n�mero de dos d�gitos: " Sin Saltar
		Leer userNum2
	Mientras que abs(userNum2)<10 o abs(userNum2)>99
	
	digitOneOne = abs(trunc(userNum1/10))
	digitOneTwo = abs(userNum1%10)
	digitTwoOne = abs(trunc(userNum2/10))
	digitTwoTwo= abs(userNum2%10)
	
	Si digitTwoOne==digitOneOne o digitTwoOne==digitOneTwo o digitTwoTwo==digitOneOne o digitTwoTwo==digitOneTwo Entonces
		Escribir "Los n�meros tienen digitos en com�n."
	SiNo
		Escribir "Los numeros no tienen d�gitos en com�n"
	FinSi
	
FinAlgoritmo
