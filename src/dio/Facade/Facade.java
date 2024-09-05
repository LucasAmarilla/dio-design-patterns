package dio.Facade;

import dio.Facade.SubSistema.crm;
import dio.Facade.SubSistema2.cep;

public class Facade {

    public void migrarClente(String nome, String cep2){
        String cidade = cep.getInstance().recupCidade(cep2);
        String estado = cep.getInstance().recupEstado(cep2);

        crm.gravarCliente(nome, cep2, cidade, estado);
    }
}
