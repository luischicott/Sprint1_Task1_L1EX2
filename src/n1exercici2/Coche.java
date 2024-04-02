package n1exercici2;

public class Coche {
	
	private final static String MARCA = "Fiat";
	private static String modelo;
	private final int POTENCIA = 150; 
	
	
	public Coche(String modelo) {
		Coche.modelo = modelo; 
	}
	
	// Getter
	  public String getMarca() {
	    return Coche.MARCA;
	  }
	  
	  public String getModelo() {
		    return Coche.modelo;
		  }
	  
	  public int getPotencia() {
		    return this.POTENCIA; 
	  }

	  // Setter
	  public void setModelo(String modelo) {
	    Coche.modelo = modelo;
	  }
	  

	
	public static String frenar() {
		return "El vehículo está frenando"; 
	}
	
	public String acelerar() {
		return "El vehículo está acelerando"; 
	}
	
	
	@Override
	public String toString(){
		return "Marca: " + Coche.MARCA + " |Modelo: " + Coche.modelo + " |Potencia: " +  this.POTENCIA; 
	}
	
}
