
public enum DiaDaSemana {
	
	//Dias da semana (Valor do indice)
		DOMINGO(1),
		SEGUNDA(2),
		TERCA(3),
		QUARTA(4),
		QUINTA(5),
		SEXTA(6),
		SABADO(7);
		
		
		private int num;  //variavl pra atribuir um numero para os dias da semana 

		private DiaDaSemana(int num) {  //construtor privado
			this.num = num;
		}

		public int getNum() {  //retorna variavel num
			return num;
		}

}
