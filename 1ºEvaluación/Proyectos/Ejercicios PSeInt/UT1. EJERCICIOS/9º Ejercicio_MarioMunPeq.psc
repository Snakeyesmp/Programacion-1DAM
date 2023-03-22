Algoritmo NumerosPrimos
	
	n1=0
	N2=0
	
	
	Escribir "¿QUe numero quieres?"
	Leer N1
	
	Para n2<-1 Hasta n1 Hacer
		Si n1%n2=0 Entonces
			contador=contador+1
		Fin si
	Fin para
	Si contador=2 Entonces
		Escribir "el numero es primo";
	SiNo
		Escribir "El numero no es primo";
		Finsi
	
FinAlgoritmo