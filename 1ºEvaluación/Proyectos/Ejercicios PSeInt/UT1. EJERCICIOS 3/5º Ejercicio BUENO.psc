Algoritmo ejercicio5
	dimension arreglo(20)
	Para i<-1 Hasta 20 Hacer
		arreglo(i)=azar(100)
	Fin Para
	a=arreglo(1)
	Para i<-1 Hasta 20  Hacer
		Si arreglo(i)<a Entonces
			a=arreglo(i)
		Fin Si
	Fin Para
	Escribir "el numero menor es ",a
FinAlgoritmo
