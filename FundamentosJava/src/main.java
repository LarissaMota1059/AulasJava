import java.util.Scanner;

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
		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite um numero qualquer");
//		int y = entrada.nextInt();
//		
//		for(int x=0; x<=10; x++) {
//			System.out.println(y + " x " + x + " = " + x*y);
//		}
		
		int x1 = 3;
		int y1 = 3;
		int z1 = 3;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		
		
		double x [] = {3, 5, 3, 5};
		
		for (int aux = 0; aux < x.length; aux++) {
			System.out.println("valor do indici " + aux + " = " + x[aux]);
		}
		
		String nome[] = { "Larissa", "Carla", "Luiza"};
		
		for (int aux1 = 0; aux1 < x.length; aux1++) {
			System.out.println(nome[aux1]);
			if (nome[aux1] == "Carla") {
				System.out.println("O indice de Carla é = " + aux1);
			}
		}
		
		int[] arrayInt = new int[5];
		String[] ArrayString = new String[4];
		double[] ArrayDouble = new double[3];
		
		arrayInt[3] = 4;
		
		int[] numero = new int[6];
		Scanner teclado = new Scanner(System.in);
		
		for (int aux2 = 0; aux2 < x.length; aux2++) {
			System.out.println("Digite um numero qualquer");
			numero[aux2] = teclado.nextInt();
		}
		
		for (int aux2 = 0; aux2 < x.length; aux2++) {
			System.out.println("Indice " + aux2 + " = " + numero[aux2]);
		}
		
		Object[] arrayObject = new Object[4];
		
		arrayObject[0] = 12;
		arrayObject[0] = "Larissa";
		arrayObject[0] = 13.8;
		arrayObject[0] = true;
		arrayObject[0] = arrayInt;
		
		for (int aux2 = 0; aux2 < x.length; aux2++) {
			System.out.println("Indice " + aux2 + " = " + numero[aux2]);
		}
		
		int[][] arrayBidirecional = new int[4][3];
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.println("Indice [" +linha+ "]["+coluna +"] * " + arrayBidirecional[linha][coluna]+" ");
			}
			System.out.println();
		}
		
	}

}
