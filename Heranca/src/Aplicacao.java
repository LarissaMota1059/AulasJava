
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();  //intanciado um novo objeto beiculo
		
		veiculo.setMarca("Honda"); 
		veiculo.setModelo("City");
		veiculo.setAno(2013);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro =  new Carro();  //instanciado um bjeto carro
		
		carro.setMarca("Fiat");
		carro.setModelo("Argo");
		carro.setAno(2015);
		carro.setQuatroPortas(true);
		
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
		
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.setMarca("Scania");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);
		
		System.out.println();
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setAno(2015);
		
		
	}

}
