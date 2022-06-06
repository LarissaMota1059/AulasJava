
public class Refrigerante extends Bebida {

	public Refrigerante() { // Metodo para chamar o refrigerante da classe principal e herdar os atributos de bebidas
		super("Refrigerante", false);
	}

	@Override  // Metodo Generico herdado da classe bebida com caracteristicas e adionadas apenas para o refrigerante
	public void preparar() {
		
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando refrigerante");
	}
	
	

}
