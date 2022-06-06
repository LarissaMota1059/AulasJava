import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		List lista = new ArrayList(); //Instanciar uma lista
		
		lista.add("abc"); // list vem da object, o polimorfismo dela permite colocar vários valores de difentes tipos
		lista.add(12);
		lista.add(true);
		
		// for foi usado para interagir com a lista e permitir que a variável x mostrasse os valores da lista (Interação mais trabalhosa)
		for(int x=0;x<lista.size();x++) {
		System.out.println(lista.get(x));
		
		}
		

		// for facilita o código, e automaticamente interage com a lista
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
	
		//No remove pode-se utilizar tanto o index como o objeto
		lista.remove(0);
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//O add empurra a valor que está na posição 0
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
		
		
		lista.set(0, "hue");//Set substitui o que estava no 0
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		
		lista.clear();  //O comando clear limpa os valores da lista
		if(lista.isEmpty()) {
			System.out.println("Sua lista está vazia");
		}

		Conta conta1 = new Conta("Água",60.00);
		Conta conta2 = new Conta("Luz",120.00);
		
		List<Conta>listaContas = new ArrayList<Conta>();
		listaContas.add(conta1);
		listaContas.add(conta2);
		
		for(Conta conta:listaContas) {
			System.out.println(conta);
		}
	}
