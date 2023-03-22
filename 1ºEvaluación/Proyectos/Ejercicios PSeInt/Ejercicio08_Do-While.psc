Algoritmo Repetir01
	
		intento =0;
	Repetir 
 		Escribir "Dime tu clave de acceso";
		Leer clave
		
		intento =intento+1;
				Si clave <>1234 Entonces
			Escribir "Clave incorrecta";
			
		FinSi
		
		Si intento =2 entonces 
			
			Escribir "te queda un intento";
			
		FinSi
		
	Hasta Que clave=1234	o intento > 3 
	Escribir "Contraseña aceptada.Bienvenido";

FinAlgoritmo
