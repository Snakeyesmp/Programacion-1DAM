Algoritmo Tienda_descuentos
	
	Precio=0			// Precio inicial del producto
	Descuento=0  		//Para un 20% de descuento se multiplica por 0,2 y para un 5% se multiplica por 0.05
	PrecioFinal=0		//Precio con el descuento aplicado
	CantDescuento=0	//Cantidad de dinero que se descuenta

	Escribir "Introduzca el importe total de la compra en valor númerico, sin el símbolo de Euro "
	Leer Precio

	Si Precio>75 Entonces
		
		CantDescuento=Precio*0.2
		Preciofinal= Precio-CantDescuento
		
		Escribir "Por su compra se le ha aplicado un descuento del 20%, que supone " CantDescuento " euros de ahorro"
		Escribir "El importe total es de " PrecioFinal
		
		SiNo
			
			CantDescuento=Precio*0.05
			Preciofinal= Precio-CantDescuento
			Escribir "Por su compra se le ha aplicado un descuento del 5%, que supone " CantDescuento " euros de ahorro"
			Escribir "El importe total es de " PrecioFinal
	FinSi

FinAlgoritmo