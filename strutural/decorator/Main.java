package decorator;

public class Main {
	public static void main(String[] args) {
		Coquetel meuCoquetel = new Cachaca();
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());

		meuCoquetel = new Limao(meuCoquetel);
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());

		meuCoquetel = new Refrigerante(meuCoquetel);
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
		
		meuCoquetel= new Sal(meuCoquetel);
		System.out.println(meuCoquetel.getNome() + " = "
				+ meuCoquetel.getPreco());
		

	}

}
