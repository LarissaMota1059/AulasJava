
public class Bebida { //Super classe- Bebida
	
	private String nome; //atributo
	private boolean aquecer; //atributo
	
	
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() { //M�todo- preparar
		System.out.println("Pegar copo");
	}


	public String getNome() { 
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isAquecer() {
		return aquecer;
	}


	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
	

}
