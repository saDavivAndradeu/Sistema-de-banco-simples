package exercicio2OO;

public class ContaEspecial extends conta {
	private double limite;	
	
	public ContaEspecial (String NomeCliente, int numeroCliente, double saldo,double limite){
			super(NomeCliente,numeroCliente,saldo);
			this.limite = limite;
	}
	public Double setLimite() {
        return limite;
    }
 public void SetLimite(double limite) {
	 this.limite = limite;
 }
 @Override
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

