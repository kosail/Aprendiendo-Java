// Se desea determinar el total a pagar por un producto. Considere que si su precio es mayor o igual
// a $200 se le aplica un descuento de 20%, y si su precio es mayor a $100 pero menor a $200, el
// descuento es de 10%.

Función inventoryPrinter (itemPrices,itemInventory)
Para i<-1 Hasta 4 Con Paso 1 Hacer
	Escribir i, ') ', itemInventory[i], ' - $', itemPrices[i]
FinPara
FinFuncion

Algoritmo FPU2Prob28_DFPS
	Definir userChoice, discountedPrice como entero
	
	Dimensionar itemPrices(4)
	itemPrices[1] <- 40
	itemPrices[2] <- 3500
	itemPrices[3] <- 100
	itemPrices[4] <- 20000
	Dimensionar itemInventory(4)
	itemInventory[1] <- 'Zanahoria (KG)'
	itemInventory[2] <- 'Limones (KG)'
	itemInventory[3] <- 'Kiwi (KG)'
	itemInventory[4] <- 'Sillones'
	
	Escribir '+--------------------------------------+'
	Escribir 'Calculadora de descuentos V2.5'
	Escribir '+--------------------------------------+'
	Escribir '¿Qué artículos añadir a tu carrito de compras?'
	inventoryPrinter(itemPrices,itemInventory)
	Escribir '+--------------------------------------+'
	Leer userChoice
	
	Si itemPrices[userChoice]>=200 Entonces
		discountedPrice = itemPrices[userChoice] * 0.80
	SiNo
		Si itemPrices[userChoice]<200 y itemPrices[userChoice]>100 Entonces
			discountedPrice = itemPrices[userChoice] * 0.90
		SiNo
			discountedPrice = itemPrices[userChoice] * 1
		FinSi
	FinSi
	
	Escribir "El total a pagar por " itemInventory[userChoice] " es de " discountedPrice " MXN."
	
	
FinAlgoritmo
