package gerenciador;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<>();
	static {
		Empresa empresa =new Empresa();
		empresa.setNome("DP World");
		Empresa empresa2 =new Empresa();
		empresa2.setNome("Santos Brasil");
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
	}
	public void adiciona(Empresa empresa){
		lista.add(empresa);
	}
	public List<Empresa>getEmpresa(){
		return Banco.lista;
	}
}
