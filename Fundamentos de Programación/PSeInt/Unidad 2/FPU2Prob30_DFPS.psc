// Un banco desea calcular para uno de sus clientes el saldo actual, el pago m�nimo y el pago para
// no generar intereses. Los datos que se conocen son: saldo anterior del cliente, monto de las
// compras que realiz� y el pago que deposit� en el corte anterior. Para calcular el pago m�nimo se
// debe considerar 15% del saldo actual, y para no generar intereses corresponde 85% del saldo
// actual, considerando que este saldo debe incluir 12% de los intereses causados por no realizar el
// pago m�nimo y $200 por multa por el mismo motivo.
Algoritmo FPU2Prob30_DFPS
	Definir previousBalance, purchaseHistoryAmount, previousBillPayment Como Real
	Definir actualBalance, minPaymentWithGenerates, minPaymentWithoutGenerates Como Real
	
	Escribir "Ingresa el anterior balance de la cuenta: " Sin saltar
	Leer previousBalance
	Escribir "Ingresa el monto de compras que realiz� el cliente: " Sin saltar
	Leer purchaseHistoryAmount
	Escribir "Ingresa el monto del pago que deposit� en el �ltimo corte: " Sin saltar
	Leer previousBillPayment
	Escribir "--------------------------------------"
	
	actualBalance = previousBalance+purchaseHistoryAmount-previousBillPayment
	minPaymentWithGenerates = actualBalance * 0.15
	minPaymentWithoutGenerates = actualBalance * 0.85 + actualBalance*0.12 + 200
	
	Escribir "El saldo actual: $" actualBalance
	Escribir "Pago m�nimo: $" redon(minPaymentWithGenerates)
	Escribir "Pago m�nimo sin intereses: $" redon(minPaymentWithoutGenerates)
	
FinAlgoritmo
