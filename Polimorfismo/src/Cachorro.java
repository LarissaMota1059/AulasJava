
public class Cachorro extends  Animal {


		@Override
		public  void  falar() { 
			
			super.falar();  //super indica que o metodo deriva da classe abstrata
			System.out.println("AU AU");  
		}
		
		public  void  morder () {  //metodo apenas para o cachorro
			System.out.println("NHAC!!");
		}
			
}
		
		


