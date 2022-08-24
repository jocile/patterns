package FactoryMethod_3;

public class Main {

	public static void main(String[] args) {
		
		FabricaFormasGeometrica fabrica = FabricaFormasGeometrica.getInstancia();
		
		Pagina pag= new Pagina();
		pag.figuras.add(fabrica.criarFormaGeometrica(TiposFormas.QUADRADO));
		pag.figuras.add(fabrica.criarFormaGeometrica(TiposFormas.TRIANGULO));
		pag.figuras.add(fabrica.criarFormaGeometrica(TiposFormas.LOSANGULO));
		pag.figuras.add(fabrica.criarFormaGeometrica(TiposFormas.RETANGULO));
		pag.desenhar();
		System.out.println("Somatorio de areas: "+ pag.calcularAreaDasFiguras());
		
	}

}
