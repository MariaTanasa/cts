package clase;

public class Autobuz {
    private int numarAutobuz;
    private Stare stare;

    public Autobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
        this.stare = new LaCapatDeLinie();
    }

    public int getNumarAutobuz() {
        return numarAutobuz;
    }

    public void setNumarAutobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void pleacaInCursa(){
        new InCursa().modificaStare(this);
    }
    public void ajungeLaCapatLinie(){
        new LaCapatDeLinie().modificaStare(this);
    }
    public void trimiteInService(){
        new LaReparat().modificaStare(this);
    }
    public void ieseDinService(){
        new LaCapatDeLinie().modificaStare(this);
    }

}
