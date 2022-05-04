
public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;
	
	// CONSTRUTOR QUE RECEBE DIA, MES E ANO
	public Data(int dia, int mes,int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Construtor completo, que recebe informações de data e horário
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		//CHAMAR O OUTRO CONSTRUTOR DA CLASSE
		this (dia, mes, ano);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	//IMPRIME A DAT/HORA FORMADA (DE ACORDO COM O FORMATO ESPECIFICADO)
	public void imprimir(int formato) {
		// MONTAR A STRING DE IMPRESSÃO DE DATA
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
			//SE HORA FOR -1, SIGNIFICA QUE OS DADOS DE HORÁRIO NAO FORAM PASSADO NO CONTRUTOR
			//ENTÃO EXIBE SÓ A DATA
			System.out.println(data);
		} else {
			//MONTA PARTE DE STRING DE HORÁRIO (DEIXA A HORA DE FROMA ENQUANTO)
			String horario = ":" + minuto + ":" + segundo;
			
			if (formato == FORMATO_24H) { 
				// SE O FORMATO FOR 24H, CONCATENA A HORA NO INICIO DA STRING (O ATRIBUTO JÁ FOI)
				// FORNECIDO NO FORMATO 24H
				horario = hora + horario;
			} else {
				//SE O FORMATO FOR 12H
				if (hora == 0) {
					horario = (hora = 12) + horario;
					horario += "AM";
					
				} else if (hora >= 12) {
					//SE HORA FOR MAIOR OU IGUAL A 12, É PRECISO SUBTRAIR 12 DA HORA PARA OBTER
					
					//A ORA NO FORMATO 12H, E CONCATENA O "PM" NO FIM
					horario = (hora - 12) + horario;
					horario += "PM";
					
				} else {
					//SE A HORA FOR MENOR QUE 12, SIMPLESMENTE UTILIZA A PRÓPRIA HORA E CONCATENA
					//O "AM" NO FIM
					horario = (hora - 12) + horario;
					horario += "AM";
				}
			}
			
			//IMPRIME A DATA/HORA FORMATADA
			System.out.println(data + " " + horario);
		}
		
	}
	
	//MÉTODOS GETTERS
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	

}
