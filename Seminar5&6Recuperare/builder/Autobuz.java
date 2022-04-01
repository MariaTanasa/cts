package builder;

public class Autobuz {
    private String model;
    private String numeSofer;
    private boolean oprireCapat;
    private boolean deschideUsi;
    private String textDerulat;
    private String nrInmatriculare;

    public Autobuz() {
        this.model = "Mercedes";
        this.numeSofer = "Dorel";
        this.oprireCapat = true;
        this.deschideUsi = true;
        this.textDerulat = "STB - in miscare";
        this.nrInmatriculare = "B555STB";
    }

    public String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public boolean isOprireCapat() {
        return oprireCapat;
    }

    void setOprireCapat(boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
    }

    public boolean isDeschideUsi() {
        return deschideUsi;
    }

    void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    public String getTextDerulat() {
        return textDerulat;
    }

    void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", oprireCapat=").append(oprireCapat);
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", textDerulat='").append(textDerulat).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
