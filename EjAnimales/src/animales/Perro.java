package animales;

public class Perro extends Animal{
	private String raza;
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.sonido = "guau";
		this.raza = raza;
	}
	
	
	
	public void lamerHueso() {
		System.out.println("lamiendo un hueso");
	}
	
	public String getRaza() {
		return raza;
	}

	
	public String toString() {
		return super.toString() + ", Raza: " + raza;
	}
}
