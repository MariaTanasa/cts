package proxy;

public class Autobuz implements MijlocTransport{
    int nrPasageri,nrLinie;

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }
    @Override
    public void setNrPasageri(int nrPasageri) {
        this.nrPasageri=nrPasageri;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul de pe linia "+this.getNrLinie() +" cu "+this.getNrPasageri()+" a oprit in statie");
    }


}
