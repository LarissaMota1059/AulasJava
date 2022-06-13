
public class Main {

	public static void main(String[] args) throws ContaException {

		Conta conta1 = new Conta(1000.0, 100);
		Conta conta2 = new Conta(1500.0, 200.0);

		Cliente cliente1 = new Cliente("Larissa", 3333, conta1);
		Cliente cliente2 = new Cliente("Laura", 55555, conta2);

		// --------------------teste booleano------------

//		if(cliente1.getConta().sacar(100)==true) {
//			System.out.println("Saque realizado com sucesso");
//		}else {
//			System.out.println("Saque n�o realizado pois seu saldo n�o � o suficiente!!");
//		}
//		System.out.println("Seu saldo atual � de "+ cliente1.getConta().getSaldo());

		// ------------------- teste Magic Numbers----------------------

//		switch(cliente1.getConta().sacarMN(100)) {
//		case 100: System.out.println("Saque realizado com sucesso");
//			break;
//		case 101: System.out.println("Saque realizado com sucesso, porem voc� est� usando seu limite");
//			break;
//		case 102: System.out.println("Opera��o n�o realizada.. voc� n�o tem limite suficiente");
//		break;

		// --------------- teste com exception------------------

//		try {

			cliente1.getConta().sacarEx(1102);

//		} catch (ContaException e) {
//			e.printStackTrace();
//
//			System.out.println("N�o foi possivel realizar opra��o:" + e.getMessage());
//		}
		System.out.println("teste");
	}

}
