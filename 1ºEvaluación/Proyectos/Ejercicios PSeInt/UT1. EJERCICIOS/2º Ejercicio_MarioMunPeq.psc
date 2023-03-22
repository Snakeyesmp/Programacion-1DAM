Algoritmo Comparar_3_Números
	
	Escribir "Introduzca el primer número"
	Leer A
	Escribir "Introduzca el segundo número"
	Leer B
	Escribir "Introduzca el tercer número"
	Leer C
	
	
	Si (A>B y A>C) Entonces
		
		Escribir "A es ek mayor que es =", A
		
	SiNo
		Si (B>A y B>C) Entonces
			Escribir "B es el mayor que es =", B
			
		SiNo
			Escribir "C es el mayor que es=", C
			
		FinSi
		
	FinSi
	
	
	Si A=B=C Entonces
		
		Escribir "Error, los 3 números son iguales"
	FinSi
	
	
	
FinAlgoritmo
