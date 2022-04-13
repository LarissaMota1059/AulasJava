
		package trocaFigurinha;

		public class Main {

			public static void main(String[] args) {
				
				Pessoa pessoa1 =  new Pessoa();
				
				pessoa1.nome = "Larissa";
				pessoa1.numFigurinhas = 1;
				
				pessoa1.Receber(3);
				
				System.out.println(pessoa1.nome);
				System.out.println(pessoa1.numFigurinhas);
				
				Pessoa pessoa2 = new Pessoa();
				
				pessoa2.nome = "Carla";
				pessoa2.numFigurinhas = 5;
				
				System.out.println(pessoa2.nome);
				System.out.println(pessoa2.numFigurinhas);
				
				boolean msg = pessoa1.Dar(2, pessoa2);
				
				if(msg==true) {
				System.out.println(pessoa1.nome);
				System.out.println(pessoa1.numFigurinhas);
				
				System.out.println(pessoa2.nome);
				System.out.println(pessoa2.numFigurinhas);
				}
				
				
			}
	}


