package Singleton_old;

public final class Conexao {

	private static Conexao controleInstancia;
	private static int limiteConexao = 100;
	private static int contador;

	private Conexao() {
		contador++;
	}

	public static Conexao getInstancia() {
		if (contador <= limiteConexao || controleInstancia == null) {
			controleInstancia = new Conexao();
		}
		System.out.println(
				"Criei uma conexao: " + controleInstancia + "contador= " + contador + "LimeteConexao" + limiteConexao);

		return controleInstancia;
	}
}
