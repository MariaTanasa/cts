package composite.clase;

public class Autobuz implements Item{
    private String producator,model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugaItem(Item item) throws Exception {
        throw new Exception("Nepermis!");
    }

    @Override
    public void stergeItem(Item item) throws Exception {
        throw new Exception("Nepermis!");

    }

    @Override
    public void descriereItem() {
        System.out.println(this.toString());
    }

    @Override
    public Item getItem(int pozitie) throws Exception {
        throw new Exception("Nepermis!");

    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        return pretPerLoc*nrLocuri+model.length();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
