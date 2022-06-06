
public class Aplicacao {

	public static void main(String[] args) {
		
		PPreparador preparador = new Preparador(); //indtanciando a classe preparador pela variavel preparador
		
		LeiteQuente leiteQuente = new LeiteQuente();  // objeto leiteQuente do tipo leiteQuente
		preparador.prepararBebida(leiteQuente);  //metodod preparar bebeida e passando como parametro o leiteQuente
		
		Refrigerante refrigerante = new Refrigerante();  //objeto refrigerante do tipo refrigerante
		preparador.prepararBebida(refrigerante);  //metodo preparar bebida e passando como parametro o refrigerante

	}

}
