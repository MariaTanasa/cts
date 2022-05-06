package clase;

public class Calator {
    private String nume;
    private int distanta;

    public Calator(String nume, int distanta) {
        this.nume = nume;
        this.distanta = distanta;
    }

    public Calator(String nume) {
        this.nume = nume;
        distanta=0;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getDistanta() {
        return distanta;
    }

    public void setDistanta(int distanta) {
        this.distanta = distanta;
    }
}
