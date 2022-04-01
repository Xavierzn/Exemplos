package polimorfismo;

public class main {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();		
		Gato cat = new Gato();
		
//		cat.Falar();
//		dog.Falar();
		
		Animal animal = new Cachorro();
		
		Falar(cat);
		Falar(dog);
		
		if(animal instanceof Cachorro) {
			System.out.println("Cachorro");
			
		} else if (animal instanceof Gato) {
			System.out.println("Gato");
		}
	}
	
	
	
	private static void Falar(Animal a) {
		a.Falar();
	}
}
