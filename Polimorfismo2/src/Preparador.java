
public class Preparador  { //Método Preparador
	
	public void prepararBebida(Bebida bebida) { // metodo generico preparar bebida
		
		System.out.println("Preparando a Bebida " + bebida.getNome() ); //Preparar= Método
		System.out.println("Pegar copo");
		bebida.preparar();
		
		if(bebida.isAquecer()) {  //metodo generico para aquecer, só vai funcionar se for verdadeiro porque nao pode ser aolicado a todas as bebidas
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparado com sucesso!!");
		System.out.println();
	}

}
