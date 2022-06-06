public class Facade {

  public void clientMigrate(String nome, String cep) {
    String city = CepApi.getInstancia().getCity(cep);
    String state = CepApi.getInstancia().getState(cep);

    CrmService.clientSave(name, cep, city, state);
  }
}
