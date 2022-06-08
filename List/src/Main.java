import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
List lista = new ArrayList(); //Instanciar uma lista
		
		lista.add("abc"); //
		lista.add(12);
		lista.add(true);
		
		// usado para interagir com a lista e permitir que a variável x mostre os valores da lista 
		for(int x=0;x<lista.size();x++) {
		System.out.println(lista.get(x));
		
		}
		
		
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
	
		//No remove pode-se utilizar tanto o index como o objeto
		//Ao contrário do array, quando você exclui um item ele não mostra nulo, mas remove completamente
		lista.remove(0);
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//O add empurra a valor que está no 0
		lista.add(0, "hue");
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
	
		
		lista.remove(0);
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//Set substitui o que estava no 0
		lista.set(0, "hue");
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//O comando clear limpa os valores da lista
		lista.clear();
		if(lista.isEmpty()) {
			System.out.println("Sua lista está vazia");
		}

		// Instanciando objetos do tipo conta
		Conta conta1 = new Conta("Água",60.00);
		Conta conta2 = new Conta("Luz",120.00);
		
		// criada uma lista do tipo Conta
		List<Conta>listaContas = new ArrayList<Conta>();
		
		listaContas.add(conta1);
		listaContas.add(conta2);
		
		//  for para mostrar na tela
		for(Conta conta:listaContas) {
			System.out.println(conta);
		}
		

	}

}
