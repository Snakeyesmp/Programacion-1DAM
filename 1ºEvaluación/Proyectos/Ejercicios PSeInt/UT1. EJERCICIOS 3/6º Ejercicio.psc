Algoritmo Triangulo
	
	Op=0
	
	Escribir "Teniendo un triángulo, elija que operación quiere hacer" 
	Escribir "1. Averiguar su área//2. Averiguar su base//3.Averiguar su altura" 
	Leer Op
	
		Segun Op Hacer
			1:
				Escribir "Introduzca la base del triángulo"
				Leer Base
				Escribir "Introduzca la altura del triángulo"
				Leer Altura
				Area= (Altura*Base)/2
				Escribir "El área del triángulo es " Area
			2:
				Escribir "Introduzca la altura del triángulo"
				Leer Altura
				Escribir "Introduzca el área del triángulo"
				Leer Area
				Base=[Area/(Altura/2)]
				Escribir "La base de su triángulo es " Base
			3:
				Escribir "Introduzca la base del triángulo"
				Leer Base
				Escribir "Introduzca el área de triángulo"
				Leer Area
				Altura=[Area/(Base/2)]
				Escribir "La altura del triángulo es " Altura
			De Otro Modo:
				Escribir "Introduzca un valor del 1 al 3 porfavor"
				
		Fin Segun
		
FinAlgoritmo