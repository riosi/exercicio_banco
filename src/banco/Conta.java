package banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Banc�ria
 * @author Ingryd
 * @version 1.0
 */

public class Conta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * N�mero da Conta
	 */
	private int numero;
	
	/**
	 * N�mero da Ag�ncia
	 */
	private int agencia;
	
	/**
	 * Saldo da Conta
	 */
	private double saldo;
	
	public Conta() {}
	
	public Conta(int numero, int agencia, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		}
	
	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	
	public void retirar(double valor) {
		saldo = saldo - valor;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
	
	
