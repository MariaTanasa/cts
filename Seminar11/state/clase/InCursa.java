package clase;

public class InCursa implements Stare{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            autobuz.setStare(this);
            System.out.println("Noua stare a autobuzului "+autobuz.getNumarAutobuz()+" a plecat in cursa");
        }else{
            System.out.println("Autobuzul "+autobuz.getNumarAutobuz()+" nu poate pleca in cursa");
        }
    }

}
