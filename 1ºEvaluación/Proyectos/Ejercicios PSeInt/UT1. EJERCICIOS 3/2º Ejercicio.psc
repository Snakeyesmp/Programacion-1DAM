Algoritmo ArrayParOImpar

	P=0		//contador números pares
	Im=0		//contador números impares

	Dimension n[12]

	Para i=1 hasta 10 con paso 1 Hacer
		
		Escribir "Introduza un número"
		Leer n[i]
		
		Si n[i]%2=0 Entonces
			
			Escribir n[i] " es par"
			p=p+1	//conteo par
			
		Sino 
			Escribir  n[i] " Es impar"
			im=im+1	//conteo impar
			
		FinSi		
		
	FinPara

	Escribir "hay " p " números pares, y hay " im " números impares"

FinAlgoritmo