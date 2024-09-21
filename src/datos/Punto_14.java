package datos;
public class Punto_14 {
   //En un dato primitivo (por valor) la información de la variable se almacenan en una dirección de memoria diferente al recibirla en la funcion, por lo tanto si el valor de esa variable cambia no afecta la variable original, solo se modifica dentro del contexto de la función.
//Cuando se asigna una variable primitiva a otra se crea una copia indepentiente del valor, modificar una copia no afecta a la original.
	//EJEMPLO
	//int x =5;
	//int y = x; 
	//y = 10;
//El valor y tiene una copia del valor x y aunque se modifique y no afecta a x
	
	//En los datos por referncia la variable que se recibe como parámetro en la función apunta exactamente a la misma dirección de memoria que la variable original por lo que si dentro de la función se modifica su valor también se modifica la variable original.
	//Cuando se asigna una variable de referencia a otra, ambas apuntan al mismo objeto en memoria, modificar un objeto a traves de cualquiera de las referncias afectara al objeto original.
	//EJEMPLO
	//String nombre1 = "Alberto";
	//String nombre2 = nombre;
			//otronombre = "Matias"
					//nombre2 apunta a la cadena nombre1 pero despues se lo cambiamos a "Matias" aunque nombre1 sigue siendo "Alberto"
}
