package Builder;

public class Main {

	public static void main(String[] args) {

		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());

		concessionaria.construirCarro();
		CarroProduct carro = concessionaria.getCarro();
		carro.cor = "preto";
		System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao
				+ "\nMotor: " + carro.dscMotor + "\nValor: " + carro.preco + "\ncor:" + carro.cor);

	}
}
