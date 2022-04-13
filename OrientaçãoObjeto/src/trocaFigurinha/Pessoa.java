package trocaFigurinha;

public class Pessoa {
	String nome;
	int numFigurinhas;
	
	void Receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
		
	}
	
	boolean Dar(int numFigurinhas, Pessoa pessoa) {
		boolean msg;
		
		
		if(this.numFigurinhas < numFigurinhas) {
			System.out.println("O número de figurinhas que você tem, é menor que a que você quer dar!");
			msg = false;
			
		}else {
				
			this.numFigurinhas -= numFigurinhas;
			pessoa.Receber(numFigurinhas);
			msg = true;
		}
		
		return msg;
	}
}
