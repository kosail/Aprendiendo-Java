// Leer un número entero de tres digitos y determinar si algún dígito es múltiplo de los otros.
Algoritmo FPU2Prob17_DFPS
	Definir userNum, digitOne, digitTwo, digitThree Como Entero
	
	Repetir
		Escribir "Ingresa un número de tres dígitos: " Sin Saltar
		Leer userNum
	Mientras Que abs(userNum)<100 o abs(userNum)>999
	
	digitOne = trunc(userNum/100)
	digitTwo = trunc((userNum%100)/10)
	digitThree = userNum%10
	
	Si digitOne%digitTwo==0 o digitOne%digitThree==0 o digitTwo%digitOne==0 o digitTwo%digitThree==0 o digitThree%digitOne==0 o digitThree%digitTwo==0 Entonces
		Escribir "Al menos un dígito es múltiplo de los otros."
	SiNo
		Escribir "Ningún dígito es múltiplo de los otros."
	FinSi

FinAlgoritmo
