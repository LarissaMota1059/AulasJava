
public class LeiteQuente extends Bebida {
	
	public LeiteQuente() { //Construtor
		super("LeiteQuente", true); //Super= chama o construtor da Super classe
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando o leite no copo");
		System.out.println("Aquecendo o Leite Quente");
		
	}
	
	
}
		

