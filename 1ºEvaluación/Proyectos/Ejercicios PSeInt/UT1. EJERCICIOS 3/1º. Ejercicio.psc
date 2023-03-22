Algoritmo Array_Vectores
	
	Dimension n1[8]
	Dimension n2[8]
	Dimension n3[8]
	Dimension pro[8]
	
	para i=1 hasta 8 con paso 1 hacer 
		Escribir "Introduce 3 notas:", i
		Escribir "Introduce Nota1"
		Leer n1[i]
		Escribir "Introduce Nota2"
		Leer n2[i]
		Escribir "Introduce Nota3"
		Leer n3[i]
		
	FinPara
	
	para i=1 hasta 8 con paso 1 Hacer
		
		pro[i]= (n1[i] + n2[i] +n3[i])/3
		
	FinPara
	
	para i=1 hasta 8 con paso 1 Hacer
		Escribir "la media de las notas sería= ", pro[i]
	FinPara
	
FinAlgoritmo