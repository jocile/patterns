package decorator;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Refrigerante";
		preco = 1.0;
		nivelDoreservatorio();
	}
    public int nivelDoreservatorio(){
    	System.out.println("Verificando nível do reservatorio");
    	return 1;
    }
}
