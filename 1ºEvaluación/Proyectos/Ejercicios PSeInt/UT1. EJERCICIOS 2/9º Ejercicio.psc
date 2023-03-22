Algoritmo Numero_Mayor

	a=0
	b=0
	c=0

	Escribir "Introduzca el primer número"
	Leer a
	Escribir "Introduzca el segundo número"
	Leer b
	Escribir "Introduzca el último número"
	Leer c

	Si a>b y a>c Entonces
		
		Escribir a " es el número mayor"
		
		SiNo
			Si b>a y b>c Entonces
				Escribir b " es el número mayor"
			Sino 
				Escribir c " es el número mayor"
			FinSi
	FinSi

	Si a=b y b=c Entonces
		Escribir "Los 3 números son iguales" 
	FinSi

FinAlgoritmo