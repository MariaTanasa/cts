package clase;

public class Calator implements Observer{
    String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void anuntaObserver(String anunt) {
        System.out.println("Am primit anuntul: "+anunt+". Nume: "+nume);
    }
}
