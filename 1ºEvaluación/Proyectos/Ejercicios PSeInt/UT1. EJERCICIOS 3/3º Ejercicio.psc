Algoritmo PositivoOnegativo
	
	Dimension n[10]
	
	Nneg=0
	Npos=0
	
	Para i=0 hasta 9 con paso 1 Hacer
		Escribir "Introduzca un número"
		Leer n[i]
		
		Si n[i]>0 Entonces
			
			Escribir n[i] " Es positivo"
			
			npos=npos+1
			
		SiNo
			Escribir n[i] " Es negativo"
			
			nneg=nneg+1
			
		FinSi
		
	FinPara
	
	Escribir "Hay " npos " Números positivos y hay " nneg " Números negativos"

FinAlgoritmo
