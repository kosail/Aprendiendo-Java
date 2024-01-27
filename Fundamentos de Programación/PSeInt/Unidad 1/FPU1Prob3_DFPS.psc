// Determinar el costo que tendr� realizar una compra con base en la cantidad de cierto producto y el precio del mismo.
Algoritmo FPU1Prob4_DFPS
	// Defining price variables
	Definir customer_ans Como Entero
	Definir purchase_quantity Como Entero
	Definir breakout Como Logico // To break the while loop in the processing data sector
	
	Dimension goods_prices[4]
	goods_prices[1] = 8930
	goods_prices[2] = 13499
	goods_prices[3] = 2672
	goods_prices[4] = 97000
	
	Dimension goods_inventory[4]
	goods_inventory[1] = "iPhone 12 Pro"
	goods_inventory[2] = "Mac 2023"
	goods_inventory[3] = "Terminal de tarjetas RFID"
	goods_inventory[4] = "Mitsubishi Lancer Evolution"
	
	// CLI
	Escribir "+-------------------------------------+"
	Escribir "Tienda en L�nea"
	Escribir "+-------------------------------------+"
	Escribir "Ingresa el n�mero de indice del art�culo que quieras comprar"
	Escribir "+-------------------------------------+"
	
	Para i <- 1 Hasta 4 Con Paso 1 Hacer
		Escribir i ") " goods_inventory[i] " - $" goods_prices[i]
	FinPara
	
	Escribir "+-------------------------------------+"
	
	// Processing users request, quantity * good
	Repetir
		Leer customer_ans
		Si 0>=customer_ans o customer_ans>=5 Entonces
			Escribir "No ingresaste una opci�n v�lida."
			Escribir "Por favor, ingresa el n�mero del indice de art�culo que deseas comprar"
			Esperar 1 segundos
		SiNo
			Escribir "�Cu�ntas unidades quieres comprar? Ingresalo en n�meros."
			Leer purchase_quantity
			Escribir "Ser�an " purchase_quantity " unidades de " goods_inventory[customer_ans] ". El costo total es de " goods_prices[customer_ans] * purchase_quantity " pesos mexicanos"
			breakout = Verdadero
		FinSi
	Hasta Que breakout = Verdadero
	
FinAlgoritmo
