Algoritmo Numero_Mayor

	a=0
	b=0
	c=0

	Escribir "Introduzca el primer n�mero"
	Leer a
	Escribir "Introduzca el segundo n�mero"
	Leer b
	Escribir "Introduzca el �ltimo n�mero"
	Leer c

	Si a>b y a>c Entonces
		
		Escribir a " es el n�mero mayor"
		
		SiNo
			Si b>a y b>c Entonces
				Escribir b " es el n�mero mayor"
			Sino 
				Escribir c " es el n�mero mayor"
			FinSi
	FinSi

	Si a=b y b=c Entonces
		Escribir "Los 3 n�meros son iguales" 
	FinSi

FinAlgoritmo