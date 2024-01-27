// Una empresa importadora desea determinar cuántos dólares puede adquirir con equis cantidad de dinero mexicano.
Algoritmo FPU2Prob20_DFPS
	Definir mexicanPesosAmount, conversionRate, fixedConversionRate Como Real
	conversionRate = 17.08
	
	Escribir "Conversor Pesos Mexicanos (MXN) a Dólares Americanos (USD)"
	Escribir "Nuestra tarifa es de " conversionRate " MXN por cada 1 USD"
	Escribir "-------------------------------------"
	Escribir "Ingresa la cantidad de MXN que quieres cambiar en USD: " Sin Saltar
	Leer mexicanPesosAmount
	
	fixedConversionRate = trunc((mexicanPesosAmount/conversionRate)*100)/100
	Escribir "La cantidad de USD que puedes comprar con " mexicanPesosAmount " MXN es de " fixedConversionRate  " USD."

FinAlgoritmo
