
public class Fusca implements Automovel {
	
	@Override	//dando override no metodo
	public void virarEsquerda() {
		System.out.println("Fusca virou a esquerda");
	}

	@Override	
	public void virarDireita() {
		System.out.println("Fusca virou a direita");

	}

	@Override	
	public void acelerar() {
		System.out.println("Fusca acelerou");

	}

}
