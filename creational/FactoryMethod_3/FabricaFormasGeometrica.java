package FactoryMethod_3;

public final class FabricaFormasGeometrica {

	private static FabricaFormasGeometrica instancia;

	private FabricaFormasGeometrica() {

	}

	public static FabricaFormasGeometrica getInstancia() {

		if (instancia == null)
			return new FabricaFormasGeometrica();

		return instancia;
	}

	public FigurasGeometrica criarFormaGeometrica(TiposFormas tp) {

		if (tp == TiposFormas.QUADRADO) {
			return new Quadrado();
		} else if (tp == TiposFormas.TRIANGULO) {
			return new Triangulo();
		} else if (tp == TiposFormas.LOSANGULO) {
			return new Losangulo();
		}else if(tp== TiposFormas.RETANGULO) {
			return new Retangulo();
		}

		return null;
	}
}
