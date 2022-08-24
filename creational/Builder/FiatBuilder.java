package Builder;

public class FiatBuilder extends CarroBuilder{
	@Override
    public void buildPreco() {
        // Opera��o complexa. 
       carro.preco=26000;
    }
 
    @Override
    public void buildDscMotor() {
        // Opera��o complexa.
        carro.dscMotor = "Fire Flex 1.0";
    }
 
    @Override
    public void buildAnoDeFabricacao() {
        // Opera��o complexa.
        carro.anoDeFabricacao = 2011;
    }
 
    @Override
    public void buildModelo() {
        // Opera��o complexa.
        carro.modelo = "Palio";
    }
 
    @Override
    public void buildMontadora() {
        // Opera��o complexa.
        carro.montadora = "Fiat";
    }
}
