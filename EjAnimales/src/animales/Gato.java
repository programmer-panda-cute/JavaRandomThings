package animales;

public class Gato extends Animal{
	public Gato(String nombre, int edad) {
		super(nombre, edad);
		this.sonido = "miau";
		
	}
	public void emitirSonido() {
		System.out.println("miau");
	}
	public void jugarOvillo() {
		System.out.println("jugando con el ovillo");
	}

}
