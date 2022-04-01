package protoype;

public class Tramvai implements MijlocTransport{

    String soferTramvai;

    public Tramvai(String soferTramvai) {
        this.soferTramvai = soferTramvai;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public String getSoferTramvai() {
        return soferTramvai;
    }

    public void setSoferTramvai(String soferTramvai) {
        this.soferTramvai = soferTramvai;
    }
}
