
public class Carro extends Veiculo{
	
	private boolean quatroPortas;

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("tem quadro Portas: " + quatroPortas);
		super.imprimir();
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
