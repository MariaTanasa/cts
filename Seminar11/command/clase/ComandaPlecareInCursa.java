package clase;

public class ComandaPlecareInCursa implements Command {
    private Integer linie;
    private Autobuz autobuz;

    public ComandaPlecareInCursa(Integer linie, Autobuz autobuz) {
        this.linie = linie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pleacaInCursa(linie);
    }
}
