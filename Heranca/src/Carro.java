
public class Carro extends Veiculo{
	
	private boolean quatroPortas;  //variavel

	@Override
	public void imprimir() {  //sobscreve o metodo imprimir do carro pq ele tem uma variavel a mais que os outros
		// TODO Auto-generated method stub
		System.out.println("tem quadro Portas: " + quatroPortas);
		super.imprimir();  //super herda todo o codigo do metodo imprimir
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	public void setAno(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}
