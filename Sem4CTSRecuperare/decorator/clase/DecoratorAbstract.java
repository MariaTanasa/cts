package decorator.clase;

public abstract class DecoratorAbstract implements Imprimanta{
    private Imprimanta imprimanta;

    public DecoratorAbstract(Imprimanta imprimanta) {
        this.imprimanta = imprimanta;
    }

    @Override
    public void printeazaBilet() {
        imprimanta.printeazaBilet();
    }
    public abstract void printeazaVerso();
}
