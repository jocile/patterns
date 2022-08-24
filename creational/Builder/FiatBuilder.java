package Builder;

public class FiatBuilder extends CarroBuilder{
	@Override
    public void buildPreco() {
        // Operação complexa. 
       carro.preco=26000;
    }
 
    @Override
    public void buildDscMotor() {
        // Operação complexa.
        carro.dscMotor = "Fire Flex 1.0";
    }
 
    @Override
    public void buildAnoDeFabricacao() {
        // Operação complexa.
        carro.anoDeFabricacao = 2011;
    }
 
    @Override
    public void buildModelo() {
        // Operação complexa.
        carro.modelo = "Palio";
    }
 
    @Override
    public void buildMontadora() {
        // Operação complexa.
        carro.montadora = "Fiat";
    }
}
