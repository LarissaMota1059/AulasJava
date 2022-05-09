
public class Refrigerante extends Bebida {

	public Refrigerante() { //Construtor
		
		super("Refrigerante", false); //Super= chama o construtor da Super classe
	
	}

	@Override
	public void preparar() {
		
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando refrigerante");
	}
	
	

}
