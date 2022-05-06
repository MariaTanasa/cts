package clase;

public class Autobuz {
    private String numeSofer,model;
    private int consumMediu,anFabricatie,nrLocuri;

    public Autobuz(String numeSofer, String model, int consumMediu, int anFabricatie, int nrLocuri) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.consumMediu = consumMediu;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public int getConsumMediu() {
        return consumMediu;
    }

    public void setConsumMediu(int consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append('}');
        return sb.toString();
    }
    public MementoAutobuz salvareMemento(){
        return new MementoAutobuz(numeSofer,consumMediu);
    }
    public void undoMemento(MementoAutobuz memento){
        this.numeSofer=memento.getNumeSofer();
        this.consumMediu=memento.getConsumMediu();
    }


}
