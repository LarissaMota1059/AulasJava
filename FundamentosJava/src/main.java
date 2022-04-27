
public class main {

	public static void main(String[] args) {
	
//		//int x = 100;
//		//double y = 200.3;
//		//int a = 0;
//		//double b = 0;
//		//short z = (short) 100000;
//		//System.out.println(z);
//		
//		//a = (int)y;
//		//b = x; 
//		//System.out.println(a);
//		//System.out.println(b);
//		
//
//		int idadePessoa = 17;
//	
//		if(idadePessoa < 18) {
//			System.out.println("Você não pode beber");
//		}
//		else if(idadePessoa < 60) {
//			System.out.println("Bora toma uma");
//		}
//		else {
//			System.out.println("quanto é a sua aposentadoria?");
//		}
//		 	System.out.println("Você tem " + idadePessoa + " anos");
		 	
//		 int num = 6;
//		 
//		 switch (num) {
//		 	case 1:
//		 		System.out.println("Segunda");
//		 		break;
//		 	case 2:
//		 		System.out.println("Segunda");
//		 		break;
//		 	case 3:
//		 		System.out.println("Terça");
//		 		break;
//		 	case 4:
//		 		System.out.println("Quarta");
//		 		break;
//		 	case 5:
//		 		System.out.println("Quinta");
//		 		break;
//		 	case 6:
//		 		System.out.println("Sexta");
//		 		break;
//		 	case 7:
//		 		System.out.println("Sábado");
//		 		break;
//		 	default:
//		 		System.out.println("esse numero não representa um dia da semana");
////		 }
//			char caractere = 'c';
//			
//			switch (caractere) {
//			case 'a':
//				System.out.println("seu caractere é a");
//				break;
//			case 'b' :
//				System.out.println("seu caractere é b");
//				break;
//			default:
//				System.out.println("valor inválido");
////		}
//			
//			String farol = "vermelho";
//			
//			switch(farol) {
//				case "vermelho":
//					System.out.println("Pare!!");
//					break;
//				case "amarelo":
//					System.out.println("Atenção!!");
//					break;
//				case "verde":
//					System.out.println("Siga!!");
//					break;
//				default:
//					System.out.println("Valor inválido");
//			}
//		int x=0;
//		while (x<10) {
//			System.out.println(x);
//			x=x+1;
//		}
//		
//		x=0;
//		do {
//			System.out.println(x);
//			x=x+1;
//		} while(x<10);
//		
//		for(int x=0; x<10; x++) {
//			System.out.println(x);
//		}
//		
//		for(int x=1; x<=10; x++); {
//			System.out.println("2 x" + x + " = " + x*2);
//		}
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero qualquer");
		int y = entrada.nextInt();
		
		for(int x=0; x<=10; x++) {
			System.out.println(y + " x " + x + " = " + x*y);
		}

	}

}
