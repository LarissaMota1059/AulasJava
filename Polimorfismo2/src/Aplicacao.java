
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador(); //M�todo
		
		LeiteQuente leiteQuente = new LeiteQuente();
		preparador.prepararBebida(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);

	}

}
