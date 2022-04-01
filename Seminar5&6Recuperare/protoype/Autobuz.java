package protoype;

public class Autobuz implements MijlocTransport{

    private String soferAutobuz;

    public Autobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
       return (MijlocTransport) super.clone();
    }

    public String getSoferAutobuz() {
        return soferAutobuz;
    }

    public void setSoferAutobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }
}
