package dio.Strategy;

public class Test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento def = new ComportamentoDefensivo();
        Comportamento agre = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

        robo.setStrategy(agre);

        robo.mover();
        robo.mover();


    }
}
