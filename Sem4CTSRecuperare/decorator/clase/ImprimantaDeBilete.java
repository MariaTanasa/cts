package decorator.clase;

public class ImprimantaDeBilete implements Imprimanta {
    private float pretBilet;

    public ImprimantaDeBilete(float pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Preul biletului este "+ pretBilet+" lei");
    }
}
