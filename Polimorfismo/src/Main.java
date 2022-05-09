
public class Main {

	public static void main(String[] args) {
		
//		Animal animal = new Cachorro();
//		animal.falar();
//		animal = new Gato ();
//		animal.falar ();
		
		Gato gato = new Gato(); //Objeto gato
		Cachorro cachorro = new Cachorro();
		falar(gato);
		falar(cachorro);
		falar(cachorro);
		falar(cachorro);
		falar(gato);
	}
	
	public static void falar(Animal a) {
		a.falar();
		
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.morder();
		}
		
	}

}
