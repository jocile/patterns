package decorator_1;


public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;

	
	public CoquetelDecorator(Coquetel umCoquetel) {
		coquetel = umCoquetel;
		lista=umCoquetel.lista;
		lista.add(this);
	}

	@Override
	public String getNome() {
		return coquetel.getNome() + " + " + nome;
	}

	public double getPreco() {
		return coquetel.getPreco() + preco;
	}
}
