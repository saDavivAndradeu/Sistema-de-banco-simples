package exercicio2OO;

public class conta {
	private  String nomeCliente;
	private  int numeroCliente;
	protected  double saldo;
	
	 public conta(String nomeCliente, int numeroCliente,double saldo) {
		this.nomeCliente= nomeCliente;
		this.numeroCliente = numeroCliente;
		this.saldo = saldo;
	 }
	 
	 public   String getNomeCliente() {
	        return nomeCliente;
	    }
	 public void SetNomeCliente(String nomeCliente) {
		 this.nomeCliente = nomeCliente;
	 }
	 public  int getNumeroCliente() {
		 return numeroCliente;
	 }
	 public void SetNumeroCliente(int numeroCliente) {
		 this.numeroCliente = numeroCliente;
	 }
	 public  double getSaldo() {
		 return saldo;
	 }
	 public void SetSaldo(double saldo) {
		 this.saldo = saldo;
	 }
	 
	 public boolean depositarValor(double valor) {
		 if (valor > 0) {
			 System.out.println("Deposito realizado, seu saldo atual é de:" + this.saldo);
		 }else {
			 System.out.println("pobre");
			 
		 }return false;
	 }
	 
	 public boolean retirarValor(double valor) {

	        if (valor > 0 && valor <= this.saldo) {
	            this.saldo -= valor;
	            	System.out.println("Retirada realizada com sucesso. Novo saldo: " + this.saldo);
	            	return true;
	        } 	else {
	            	System.out.println("Valor inválido para retirada.");
	            	return false;

	        }
	 }
	
	
	
	 public double consultarValorDisponivel() {
		 return this.saldo ;
	 }

	public boolean retirarValor(double valor, double limite) {
		if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            	System.out.println("Retirada realizada com sucesso. Novo saldo: " + this.saldo);
            	return true;
        } 	else {
            	System.out.println("Valor inválido para retirada.");
            	return false;
            	}
	}
	 
}
