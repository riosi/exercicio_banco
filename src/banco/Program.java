package banco;
import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {
		
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Thiago");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ingryd");

		listaCliente.add(cliente1);
		listaCliente.add(cliente2);

		for (int i = 0; i < listaCliente.size(); i++) {
			Cliente cli = listaCliente.get(i);
			System.out.println(cli.getNome());
		}
	}

}
