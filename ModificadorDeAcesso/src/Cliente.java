import java.util.Objects;
public class Cliente {
	
	// Atributos de cliente privados, porque pra essas classes nao podem ter facil acesso a eles
		private String nome;
		private int cpf;
		private int numConta;
		
		// Metodo  Cliente
		public Cliente() {
			
		}
		
		// Insersao de getter e setters
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public int getNumConta() {
			return numConta;
		}
		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		//toString e um metodo do  java que retorna escrito o valor de todas as variaveis da classe 
		@Override
		public String toString() {
			return "Nome = " + nome + "\nCPF = " + cpf + "\nNúmero de Conta = " + numConta+"\n";
		}

		//hashCode um metodo do Java que retorna variaveis como objetos
		@Override
		public int hashCode() {
			return Objects.hash(cpf, nome, numConta);
		}

		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
		}
		
		
	}


