package test;
import animales.*;

public class TestAnimales {
	public static void main (String[] args) {
//		Gato gato = new Gato();
//		Oveja oveja = new Oveja();
//		Perro perro = new Perro();
		
//		gato.emitirSonido();
//		oveja.emitirSonido();
//		perro.emitirSonido();
		

		Animal animal1 = new Animal("paco", 11); // ""
		Animal perroAnimal = new Perro("Miguel", 14, "ladrador"); 
		Perro pipo = (Perro) perroAnimal;
		// guau
		// Perro perro3 = new Animal(); Así no funciona
		
		animal1.emitirSonido();
		perroAnimal.emitirSonido();
		
		// perroAnimal.lamerHueso(); no funciona
		System.out.println(((Perro) perroAnimal).getRaza()); // da error si lo ponemos sin (Perro) 
		//System.out.println(animal1.getRaza()); //da error 
		
		Perro perroDowncasted = (Perro) perroAnimal;
		perroDowncasted.lamerHueso();
		
		// Oveja perruna fallida
		Animal ovejaAnimal = new Oveja("Veja", 3, "Miguel");
		ovejaAnimal.emitirSonido();
		((Oveja) ovejaAnimal).pastar();
		
		Animal animal = new Animal("Paco", 11);
		
		System.out.println(perroAnimal);
		System.out.println(ovejaAnimal);
		System.out.println(animal);
		// esto da error
		//((Perro) ovejaAnimal).lamerHueso();
		
		
		
		
	}

}
