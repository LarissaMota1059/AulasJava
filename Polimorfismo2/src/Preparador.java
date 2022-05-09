
public class Preparador  { //Método Preparador
	
	public void prepararBebida(Bebida bebida) { //váriavel "Objeto"
		
		System.out.println("Preparando a Bebida " + bebida.getNome() ); //Preparar= Método
		System.out.println("Pegar copo");
		bebida.preparar();
		
		if(bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparado com sucesso!!");
		System.out.println();
	}

}
