// Una compañía fabrica focos de colores (verdes, blancos y rojos). Se desea contabilizar, de un lote de N focos, el número de focos de cada color que hay en existencia. Desarrolle un algoritmo para obtener la respuesta.
Algoritmo FPU1Prob11_DFPS
	Definir totalNumber, redBulbsCount, greenBulbsCount, blueBulbsCount, userPlaceholderResponse Como Entero
	Definir breakout como Logico
	totalNumber=0; redBulbsCount=0; greenBulbsCount=0; blueBulbsCount=0; userPlaceholderResponse=0 // Definiendo valores iniciales para evitar bugs
	breakout = Falso
	
	Escribir "+-------------------------------------+"
	Escribir "  Calculadora de bombillos por color"
	Escribir "+-------------------------------------+"
	Escribir "Ingresa el número de bombillos producidos en el lote: " Sin Saltar
	Leer totalNumber
	Escribir ""
	
	Para i=1 hasta totalNumber con paso 1 Hacer
		Escribir "Ingresa el número del índice del color del bombillo para procesar su contabilización:"
		Escribir ""
		Escribir "1) Rojo"
		Escribir "2) Verde"
		Escribir "3) Azul"
		Escribir "Color del foco actual: " Sin Saltar
		Leer userPlaceholderResponse
		
		Limpiar Pantalla
		Segun userPlaceholderResponse Hacer
			1:
				Escribir "1 Foco rojo contado y añadido al inventario"
				redBulbsCount = redBulbsCount + 1
			2:
				Escribir "1 Foco verde contado y añadido al inventario"
				greenBulbsCount = greenBulbsCount + 1
			3:
				Escribir "1 Foco azul contado y añadido al inventario"
				blueBulbsCount = blueBulbsCount + 1
			4:
				breakout = Verdadero
			De Otro Modo:
				Escribir "No ingresaste una opción válida. Por favor, ingresa el número de índice del color del foco para contabilizarlo."
		Fin Segun
		Escribir "----------------------------------------"
	FinPara
	
	Escribir "El total de focos rojos es de: " redBulbsCount
	Escribir "El total de focos verdes es de: " greenBulbsCount
	Escribir "El total de focos azules es de: " blueBulbsCount
	Escribir "----------------------------------------"
	Escribir "La cuenta total de focos es de: " totalNumber
	
FinAlgoritmo
