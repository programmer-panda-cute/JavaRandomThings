package animales;

public class Oveja extends Animal {
	
	private String pastor;

	public Oveja(String nombre, int edad, String pastor) {
		super(nombre, edad);
		this.pastor = pastor;
		this.sonido = "beee";

	}
	public void pastar() {
		System.out.println("pastando hierba");
	}
	
	public String toString() {
		return super.toString() + ", Pastor: " + pastor;
	}

}
