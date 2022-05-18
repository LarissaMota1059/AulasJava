import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		lista.add("abc");
		lista.add(12);
		lista.add(true);
		for(int x=0; x< lista.size(); x++) {
			System.out.println(lista.get(0));
		}
		for(Object valor : lista) {
			System.out.println(valor);
		}

	}

}
