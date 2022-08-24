package decorator;

public class Limao  extends CoquetelDecorator{

	public Limao(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Lim�o";
		preco = 0.5;
		validade();
	}

	public void validade(){
		System.out.println("Ver validade do lim�o");
			
	}
	
	}
