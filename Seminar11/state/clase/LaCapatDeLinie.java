package clase;

public class LaCapatDeLinie implements Stare{

    @Override
    public void modificaStare(Autobuz autobuz) {
        Stare stareCurenta=autobuz.getStare();
        if(stareCurenta instanceof InCursa){ //! (autobuz.getStare() instanceof LaCapatDeLinie)
            System.out.println("Autobuzul "+autobuz.getNumarAutobuz()+" este la capat de linie");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul "+autobuz.getNumarAutobuz()+" este deja la capat de linie");
        }

    }
}
