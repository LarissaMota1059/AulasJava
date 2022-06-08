
public class ContaBancaria {
	
	// Atributos da classe
		private int numConta;
		private boolean ativo;
		private double saldo;
		
//		public ContaBancaria() {
//			ativo = true;
//			saldo = 1.0;
//			numConta = 1234;
//		}
		
		// Construtor da classe ContaBancaria 
		public ContaBancaria(boolean ativo, double saldo) { //Overflow ou Sobrecarga de metodos
			this.ativo = ativo;
			this.saldo = saldo;
		}

		// Metodo que mostrar na tela
		public void receber(double valor) {	
			System.out.println("Voc� acaba de receber "+ valor);
			saldo += valor;	
		}
		
		// Metodo que mostrar se e possivel ou nao realizar a a transferencia
		public void transferir(double valor) {
			if (valor > saldo) {
				System.out.println("Voc� n�o pode realizar a transfer�ncia de "+ valor +" reais por falta de saldo");
			}else {
				saldo -= valor;
				System.out.println("Voc� acaba de tranferir " + valor+" reais");
			}	
		}
		
		public double saldo() {
			return saldo; 		
		}
	}


