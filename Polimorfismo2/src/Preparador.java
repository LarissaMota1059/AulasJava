
public class Preparador  { //M�todo Preparador
	
	public void prepararBebida(Bebida bebida) { //v�riavel "Objeto"
		
		System.out.println("Preparando a Bebida " + bebida.getNome() ); //Preparar= M�todo
		System.out.println("Pegar copo");
		bebida.preparar();
		
		if(bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparado com sucesso!!");
		System.out.println();
	}

}
