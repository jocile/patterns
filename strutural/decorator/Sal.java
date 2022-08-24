package decorator;

public class Sal  extends CoquetelDecorator{

	public Sal(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Sal";
		preco = 0.1;
	}

}
