package animales;

public class Animal {
	protected String sonido;
	protected String nombre;
	protected int edad;
	public Animal(String nombre, int edad) {
		sonido = "Soy un animal generico";
		this.edad = edad;
		this.nombre = nombre;
		
	}
	public void emitirSonido() {
		System.out.println(sonido);
	}
	
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", Sonido: " +  sonido;
	}

}
