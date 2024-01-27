Funci�n inventoryPrinter (itemPrices,itemInventory)
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Escribir i, ') ', itemInventory[i], ' - $', itemPrices[i]
	FinPara
FinFunci�n

// Realice el algoritmo para determinar cu�nto pagar� una persona que adquiere N art�culos, los cuales est�n de promoci�n. Considere que si su precio es mayor o igual a $200 se le aplica un descuento de 15 MOD , y si su precio es mayor a $100 pero menor a $200, el descuento es de 12 MOD ; de lo contrario, s�lo se le aplica 10 MOD . Se debe saber cu�l es el costo y el descuento que tendr� cada uno de los art�culos y finalmente cu�nto se pagar� por todos los art�culos obtenidos.
Algoritmo FPU1Prob12_DFPS
	Definir discountedPrice, discount Como Real
	Definir itemSelected, itemAmount, userBreakChoice, totalDiscounts Como Entero
	Definir breakout Como L�gico
	// Definiendo dimensiones para almacenar los art�culos disponibles en la tienda
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
	Escribir '�Qu� art�culos a�adir a tu carrito de compras?'
	inventoryPrinter(itemPrices,itemInventory)
	// Procesamiento del precio con condicionales
	Repetir
		Leer itemSelected
		Si itemSelected<=0 O itemSelected>4 Entonces
			Escribir 'Ingresa una opci�n v�lida.'
		SiNo
			Escribir '�Cu�ntas unidades?'Sin Saltar
			Leer itemAmount
			Escribir '---------------------------------------'
			Si itemAmount<=0 Entonces
				Escribir 'Ingresa una cantidad v�lida.'
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
				
				Escribir itemInventory[itemSelected], ' a�adido exitosamente.'
				Escribir 'Precio con descuento: $', discountedPrice
				Escribir '�Ahorraste $', (itemPrices[itemSelected]*itemAmount)-(itemPrices[itemSelected]*discount)*itemAmount, ' por unidad!'
				Escribir '---------------------------------------'
			FinSi
		FinSi
		Escribir '�Deseas a�adir algo m�s al carrito?'
		Escribir '1) S�'
		Escribir '2) No'
		Leer userBreakChoice
		Si userBreakChoice==1 Entonces
			Limpiar Pantalla
			Escribir '�Qu� m�s deseas a�adir al carrito?'
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
