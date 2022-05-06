package banco;

public class Telefone {
	private String ddd;
	private String numero;
	
	// getters e setters
	
	public String getTelefoneFormatado() {
		return formatarTelefone(ddd,numero);
	}
	
	private String formatarTelefone(String ddd, String numero) {
		return "(" + ddd + ") " + numero;
	}

}
