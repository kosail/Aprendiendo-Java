Función inventoryPrinter (itemPrices,itemInventory)
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Escribir i, ') ', itemInventory[i], ' - $', itemPrices[i]
	FinPara
FinFunción

// Realice el algoritmo para determinar cuánto pagará una persona que adquiere N artículos, los cuales están de promoción. Considere que si su precio es mayor o igual a $200 se le aplica un descuento de 15 MOD , y si su precio es mayor a $100 pero menor a $200, el descuento es de 12 MOD ; de lo contrario, sólo se le aplica 10 MOD . Se debe saber cuál es el costo y el descuento que tendrá cada uno de los artículos y finalmente cuánto se pagará por todos los artículos obtenidos.
Algoritmo FPU1Prob12_DFPS
	Definir discountedPrice, discount Como Real
	Definir itemSelected, itemAmount, userBreakChoice, totalDiscounts Como Entero
	Definir breakout Como Lógico
	// Definiendo dimensiones para almacenar los artículos disponibles en la tienda
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
	Escribir 'Calculadora de descuentos V2'
	Escribir '+--------------------------------------+'
	Escribir '¿Qué artículos añadir a tu carrito de compras?'
	inventoryPrinter(itemPrices,itemInventory)
	// Procesamiento del precio con condicionales
	Repetir
		Leer itemSelected
		Si itemSelected<=0 O itemSelected>4 Entonces
			Escribir 'Ingresa una opción válida.'
		SiNo
			Escribir '¿Cuántas unidades?'Sin Saltar
			Leer itemAmount
			Escribir '---------------------------------------'
			Si itemAmount<=0 Entonces
				Escribir 'Ingresa una cantidad válida.'
			SiNo
				// shoppingCart = shoppingCart + itemPrices[itemSelected] * itemAmount
				Si itemPrices[itemSelected]>100 Y itemPrices[itemSelected]<200 Entonces
					Si itemPrices[itemSelected]>=200 Entonces
						discount <- 0.85
					SiNo
						discount <- 0.88
					FinSi
				SiNo
					discount <- 0.90
				FinSi
				
				discountedPrice <- (itemPrices[itemSelected]*discount)*itemAmount // calculando precio con descuento
				shoppingCart <- shoppingCart+discountedPrice // sumando todos los precios ya con descuento en un total
				totalDiscounts <- totalDiscounts+(itemPrices[itemSelected]*itemAmount)-(itemPrices[itemSelected]*discount)*itemAmount // sumando el total de lo ahorrado
				
				Escribir itemInventory[itemSelected], ' añadido exitosamente.'
				Escribir 'Precio con descuento: $', discountedPrice
				Escribir '¡Ahorraste $', (itemPrices[itemSelected]*itemAmount)-(itemPrices[itemSelected]*discount)*itemAmount, ' por unidad!'
				Escribir '---------------------------------------'
			FinSi
		FinSi
		Escribir '¿Deseas añadir algo más al carrito?'
		Escribir '1) Sí'
		Escribir '2) No'
		Leer userBreakChoice
		Si userBreakChoice==1 Entonces
			Limpiar Pantalla
			Escribir '¿Qué más deseas añadir al carrito?'
			Escribir '+--------------------------------------+'
			inventoryPrinter(itemPrices,itemInventory)
		SiNo
			breakout <- Verdadero
		FinSi
	Hasta Que breakout==Verdadero
	// Data Output
	Escribir 'El precio final a pagar por es de $', shoppingCart, '.'
	Escribir 'En total, ahorraste $', totalDiscounts "."
FinAlgoritmo
