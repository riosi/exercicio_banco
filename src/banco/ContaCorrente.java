package banco;

public class ContaCorrente extends Conta {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7317312244813855559L;
	private String tipo;
	private double chequeEspecial;
	
	public ContaCorrente(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getSaldoDisponivel() {
		return getSaldo() + this.chequeEspecial;
	}
	
	@Override
	public void retirar(double valor) {
		valor += 10;
		super.retirar(valor);
	}

}
