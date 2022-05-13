package clase;

public class LaReparat implements Stare{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie) {
            autobuz.setStare(this);
            System.out.println("Autobuzul nr " + autobuz.getNumarAutobuz() + " a ajuns in service.");
        } else {
            System.out.println("Autobuzul nr " + autobuz.getNumarAutobuz() + " nu poate sa treaca in service.");
        }
    }
}
