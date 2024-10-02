package exercicio2OO;

import java.util.Locale;

public class ContaDemo {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
		
		conta cont = new conta("davi", 1234, 150.0);
	
		System.out.println("Nome do cliente: " + cont.getNomeCliente());
		System.out.println("Nome do cliente: " + cont.getNumeroCliente());
		System.out.println("Nome do cliente: " + cont.getSaldo());
		System.out.println("\n");
		
		
		
	}
	
}
