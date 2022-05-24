package testare.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    int valoareVarsta;
    boolean valoareCheckCNP;
    String valoareSex;

    @Override
    public String getSex() {
        return this.valoareSex;
    }

    @Override
    public int getVarsta() {
        return this.valoareVarsta;
    }

    @Override
    public boolean checkCNP() {
        return this.valoareCheckCNP;
    }

    public void setValoareVarsta(int valoareVarsta) {
        this.valoareVarsta = valoareVarsta;
    }

    public void setValoareCheckCNP(boolean valoareCheckCNP) {
        this.valoareCheckCNP = valoareCheckCNP;
    }
}
