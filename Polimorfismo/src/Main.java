
public class Main {

	public static void main(String[] args) {
		
/ new= instanciar  Gato()= construtor
		// Chama metodo falar do gato pra mostrar na tela
		Gato gato = new Gato(); // new= instanciar  Gato()= construtor
		gato.Falar();
		System.out.println();
		
		// Instanciei o objeto cachorro do tipo cachorro
		// Chamei o metodo falar e morder do cachorro e mostrei na tela
		Cachorro cachorro = new Cachorro();
		cachorro.Falar();
		cachorro.Morder();
		System.out.println();
		
		
		// Instancei o objeto animal do tipo cachorro e chamei o metodo falar
		Animal animal = new Cachorro();
		animal.Falar();
		
		// Com o mesmo objeto chamei o metodo falar do gato, pois os dois sao animais
		animal = new Gato();
		animal.Falar();
		System.out.println();
		
		Gato gato = new Gato(); // instanciei um objeto do tipo gato
		Cachorro cachorro = new Cachorro(); // instanciei um objeto do tipo cachorro
		falar(gato); //chamo o metodo falar que vem do objeto criado ('gato')
		falar(cachorro); // chamo o metodo falar que vem do objeto criado ('cachorro')
	}
	
	// Criei um metodo falar na classe principal que possui como parametro uma variavel do tipo Animal
	public static void falar(Animal a) { 
		a.Falar(); // chamei o método falar
		
		if(a instanceof Cachorro) { // verifica se o objeto pertence a classe que eu estou comparando
			Cachorro c = (Cachorro) a; //casting explicito / no caso eu força o objeto cachorro a chamar o metodo morder, 
			c.Morder(); // chamei o método morder
			
			((Cachorro) a).Morder();
		}
	}

}
