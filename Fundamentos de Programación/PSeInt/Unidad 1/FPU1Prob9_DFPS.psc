// Muestre el algoritmo para determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es mayor o igual a $300 se le aplica un descuento de 20%, y si su precio es mayor a $200 pero menor a $300, el descuento es de 15%, y si es menor a $200, sólo 10%. 
Algoritmo FPU1Prob9_DFPS
	Definir discountedPrice, discount Como Real
	Definir itemSelected Como Entero
	Definir breakout Como Logico
	
	// Definiendo dimensiones para almacenar los artículos disponibles en la tienda
	Dimension itemPrices[4]
	itemPrices[1] = 25
	itemPrices[2] = 112000
	itemPrices[3] = 800
	itemPrices[4] = 200
	
	Dimension itemInventory[4]
	itemInventory[1] = "Cuaderno"
	itemInventory[2] = "Laptop Alienware"
	itemInventory[3] = "Licencia de Microsoft 365 por 1 año"
	itemInventory[4] = "Funda de Xiaomi Poco X3 Pro"
	
	
	Escribir "+--------------------------------------+"
	Escribir "Calculadora de descuentos por artículo"
	Escribir "+--------------------------------------+"
	Escribir "¿Qué artículo deseas comprar?"
	
	Para i=1 Hasta 4 Con Paso 1 Hacer
		Escribir i ") " itemInventory[i] " - $" itemPrices[i]
	FinPara
	
	// Procesamiento del precio con condicionales
	Repetir
		Leer itemSelected
		breakout = Verdadero // Booleano para romper el ciclo while
		Si itemSelected <= 0 o itemSelected >= 5 Entonces
			Escribir "Por favor, ingresa una opción válida. Usa solo el número de indice del artículo."
			breakout = Falso
		SiNo
			Si itemPrices[itemSelected] >= 200 Entonces
				Si itemPrices[itemSelected] > 200 y itemPrices[itemSelected] < 300 Entonces
					Si itemPrices[itemSelected] >= 300 Entonces
						discount =  0.80
						discountedPrice = itemPrices[itemSelected] * discount
					SiNo
						discount =  0.85
						discountedPrice = itemPrices[itemSelected] * discount
					FinSi
				SiNo
					discount =  0.90
					discountedPrice = itemPrices[itemSelected] * discount
				FinSi
			SiNo
				discount = 1
				discountedPrice = itemPrices[itemSelected]
			FinSi
		FinSi
	Hasta Que breakout = Verdadero
	
	// Data Output
	Escribir "El precio final a pagar por " itemInventory[itemSelected] " es de $" discountedPrice "."
	Escribir "Ahorraste $" itemPrices[itemSelected] - discountedPrice
	
FinAlgoritmo
