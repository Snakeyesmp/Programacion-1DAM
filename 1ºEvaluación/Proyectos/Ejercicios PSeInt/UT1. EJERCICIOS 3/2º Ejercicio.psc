Algoritmo ArrayParOImpar

	P=0		//contador n�meros pares
	Im=0		//contador n�meros impares

	Dimension n[12]

	Para i=1 hasta 10 con paso 1 Hacer
		
		Escribir "Introduza un n�mero"
		Leer n[i]
		
		Si n[i]%2=0 Entonces
			
			Escribir n[i] " es par"
			p=p+1	//conteo par
			
		Sino 
			Escribir  n[i] " Es impar"
			im=im+1	//conteo impar
			
		FinSi		
		
	FinPara

	Escribir "hay " p " n�meros pares, y hay " im " n�meros impares"

FinAlgoritmo