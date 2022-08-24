package FactoryMethod_3;

import java.util.ArrayList;

public class Pagina {

	public ArrayList <FigurasGeometrica> figuras;
	
	public Pagina() {
		figuras= new ArrayList<FigurasGeometrica>();
	}
	
	public int calcularAreaDasFiguras() {
		int areaTotal=0;
		
		  for (FigurasGeometrica fg : this.figuras) {
			areaTotal += fg.calcularArea();
		}
		  return areaTotal;
	   
	}
	public void desenhar() {
		for (FigurasGeometrica fg : this.figuras) {
			fg.desenhar();
		}
		
	}
}
