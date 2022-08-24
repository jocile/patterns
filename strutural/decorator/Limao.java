package decorator;

public class Limao  extends CoquetelDecorator{

	public Limao(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Limão";
		preco = 0.5;
		validade();
	}

	public void validade(){
		System.out.println("Ver validade do limão");
			
	}
	
	}
