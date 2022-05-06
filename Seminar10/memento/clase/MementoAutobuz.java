package clase;

public class MementoAutobuz {
    private String numeSofer;
    private int consumMediu;

    public MementoAutobuz(String numeSofer, int consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public int getConsumMediu() {
        return consumMediu;
    }
}
