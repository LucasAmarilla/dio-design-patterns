package dio.Facade.SubSistema2;

import java.util.SplittableRandom;

public class cep {
    public static cep instance = new cep();

    private cep() {
        super();
    }

    public static cep getInstance() {
        return instance;
    }

    public String recupCidade(String cep) {
        return "xique-xique";
    }

    public String recupEstado(String cep) {
        return "Bahia";

    }
}