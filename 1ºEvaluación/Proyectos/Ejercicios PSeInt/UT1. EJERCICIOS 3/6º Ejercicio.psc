Algoritmo Triangulo
	
	Op=0
	
	Escribir "Teniendo un tri�ngulo, elija que operaci�n quiere hacer" 
	Escribir "1. Averiguar su �rea//2. Averiguar su base//3.Averiguar su altura" 
	Leer Op
	
		Segun Op Hacer
			1:
				Escribir "Introduzca la base del tri�ngulo"
				Leer Base
				Escribir "Introduzca la altura del tri�ngulo"
				Leer Altura
				Area= (Altura*Base)/2
				Escribir "El �rea del tri�ngulo es " Area
			2:
				Escribir "Introduzca la altura del tri�ngulo"
				Leer Altura
				Escribir "Introduzca el �rea del tri�ngulo"
				Leer Area
				Base=[Area/(Altura/2)]
				Escribir "La base de su tri�ngulo es " Base
			3:
				Escribir "Introduzca la base del tri�ngulo"
				Leer Base
				Escribir "Introduzca el �rea de tri�ngulo"
				Leer Area
				Altura=[Area/(Base/2)]
				Escribir "La altura del tri�ngulo es " Altura
			De Otro Modo:
				Escribir "Introduzca un valor del 1 al 3 porfavor"
				
		Fin Segun
		
FinAlgoritmo