package Sigleton;

public final class Conexao {

	private static Conexao controleInstancia;

	private Conexao() {
	}

	public static Conexao getInstancia() {
			controleInstancia = new Conexao();
		return controleInstancia;
	}
}
