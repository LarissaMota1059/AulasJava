
		package trocaFigurinha;

		public class Main {

			public static void main(String[] args) {
				
				
		Pessoa pessoa1 = new Pessoa(); //perfil Larissa
		pessoa1.nome = "Larissa";
		pessoa1.numFigurinhas = 20;
		pessoa1.x = 1;
		System.out.println("Número de figurinhas iniciais do Larissa: " + pessoa1.numFigurinhas);

		
		Pessoa pessoa2 = new Pessoa();  //perfil Carla
		pessoa2.nome = "Carla";
		pessoa2.numFigurinhas = 20;
		System.out.println("Número de figurinhas iniciais do carla: " + pessoa2.numFigurinhas + "\n");

		// Realizando a troca
		pessoa1.Dar(35, pessoa2);

		// Resultado final
		// Condição para exibir a mensagem do resultado apenas se a variavel x for igual a 1 conforme indicado na Classe Pessoa
		if (pessoa1.x > 1) {
			System.out.println("");
		} else {
			System.out.println("Número de figurinhas do Pedro depois da troca: " + pessoa1.numFigurinhas);
			System.out.println("Número de figurinhas do Jorge depois da troca: " + pessoa2.numFigurinhas);
		}
	}
}


