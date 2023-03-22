Algoritmo Temperaturas

	TipoT=0
	Temperatura=0
	TC=0
	TF=0

	Escribir "Escriba 0 para elegir Celsius o 1 para elegir Fahrenheit"
	Leer TipoT

	Si TipoT=0 Entonces

		Escribir "Introduzca temperatura en Celsius"
		Leer TC

		TF=TC*1.8+32
	
		Escribir TC " en Fahrenheit son " TF

	SiNo

		Escribir "Introduzca temperatura en Fahrenheit"
		Leer TF

		TC= (TF-32)/1.8


		Escribir TF " en Fahrenheit son " TC

	FinSi

FinAlgoritmo
