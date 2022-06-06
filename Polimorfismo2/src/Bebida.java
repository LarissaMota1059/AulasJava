
public class Bebida { //Super classe- Bebida
	
	private String nome; //criando atributo de beiba
	private boolean aquecer; 
	
	
	public Bebida(String nome, boolean aquecer) {  //metodo condutor da classe bebida
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() { //metodo parar qualquer tipo de bebida
		System.out.println("Pegar copo");
	}


	public String getNome() { //getters e setters dos atributos dessa classe 
		//get pega o valor e set atribue um valor
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
