
public class Veiculo {
	//criando atributos
	private String nome;
	protected String marca;
	protected String modelo;
	protected int Ano;
	
	public void buzinar() {  //metodo buzinar
		System.out.println("BI BI");
	}
	
	public void imprimir() {  //metodo imprimir as informaçoes
		
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + Ano);
	}
	
	public String getNome() {  //pra que outras classes vizualizam seus atributos
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int i) {
		this.Ano = i;
	}
	
	
	

}
