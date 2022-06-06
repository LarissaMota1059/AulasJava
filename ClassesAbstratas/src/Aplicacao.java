
public class Aplicacao {

	public static void main(String[] args) {
		// Item item = new Item();   dá errado porque não pode instanciar um objeto abstrato
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		

	}
	
}
