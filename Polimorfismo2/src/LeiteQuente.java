
public class LeiteQuente extends Bebida {
	
	public LeiteQuente() { //Construtor
		super("LeiteQuente", true); //Super serve para indicar que esta sendo puxado um metodo de outra classe
	}

	@Override  // metodo generico da classe bebida e colocando mais um codigo tal da classe leiteQuente
	public void preparar() {
		super.preparar();
		System.out.println("Colocando o leite no copo");
		System.out.println("Aquecendo o Leite Quente");
		
	}
	
	
}
		

