package n1exercici2;

public class S1_T1_N1EX2_Luis_Chicott {

	public static void main(String[] args) {
		
		/*El coche tiene 3 atributos. 'Marca' que es final + static, 'Modelo' que es static 
		 y 'Potencia' que es final. Los atributos final no se pueden poner en el constructor 
		 ya que tienen valores constantes que no se van a modificar */
		
		
		
		/* Aquí se construyen los coches solo pasándoles el valor del atributo 'Modelo' 
		 ya que ese atributo NO ES final y por eso se puede pasar desde el constructor" */ 
		
		
		Coche coche1 = new Coche("Piu"); 
		
		System.out.println(coche1.toString()); 
		
		
		/*El atributo 'Modelo' al ser static es un atributo de la clase, entonces al modificarlo
		 se va a modificar en la clase y todos los objetos creando van a tener el mismo modelo*/
		
		Coche coche2 = new Coche("Panda"); 
		Coche coche3 = new Coche("Fiat 500"); 
		

		
		
		
		/* Ejemplo: coche1 inicio siendo "modelo Piu" pero cuando se creó el coche3 se le puso
		  al modelo de la clase 'Fiat 500' entonces ahora al imprimir el modelo del coche1 muestra Fiat 500 */
		System.out.println(coche1.toString()); 
		
		// Aquí se imprime el método acelerar 
		System.out.println(coche1.acelerar()); 
		
		/*Aquí se imprime el método frenar que es un método static y se puede llamar desde la clase 
        o desde el objeto	*/
		System.out.println(Coche.frenar()); 
		System.out.println(coche1.frenar()); 
		
		

	}

}
