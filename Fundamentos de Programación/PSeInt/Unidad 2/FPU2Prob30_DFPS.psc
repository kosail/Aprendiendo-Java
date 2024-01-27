// Un banco desea calcular para uno de sus clientes el saldo actual, el pago mínimo y el pago para
// no generar intereses. Los datos que se conocen son: saldo anterior del cliente, monto de las
// compras que realizó y el pago que depositó en el corte anterior. Para calcular el pago mínimo se
// debe considerar 15% del saldo actual, y para no generar intereses corresponde 85% del saldo
// actual, considerando que este saldo debe incluir 12% de los intereses causados por no realizar el
// pago mínimo y $200 por multa por el mismo motivo.
Algoritmo FPU2Prob30_DFPS
	Definir previousBalance, purchaseHistoryAmount, previousBillPayment Como Real
	Definir actualBalance, minPaymentWithGenerates, minPaymentWithoutGenerates Como Real
	
	Escribir "Ingresa el anterior balance de la cuenta: " Sin saltar
	Leer previousBalance
	Escribir "Ingresa el monto de compras que realizó el cliente: " Sin saltar
	Leer purchaseHistoryAmount
	Escribir "Ingresa el monto del pago que depositó en el último corte: " Sin saltar
	Leer previousBillPayment
	Escribir "--------------------------------------"
	
	actualBalance = previousBalance+purchaseHistoryAmount-previousBillPayment
	minPaymentWithGenerates = actualBalance * 0.15
	minPaymentWithoutGenerates = actualBalance * 0.85 + actualBalance*0.12 + 200
	
	Escribir "El saldo actual: $" actualBalance
	Escribir "Pago mínimo: $" redon(minPaymentWithGenerates)
	Escribir "Pago mínimo sin intereses: $" redon(minPaymentWithoutGenerates)
	
FinAlgoritmo
