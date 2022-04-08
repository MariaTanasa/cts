package adapter.terestru;

import adapter.subteran.ValidatorMetrou;

public class AdapterObiecte implements ValidatorTerestru{
    private ValidatorMetrou validatorMetrou=new ValidatorMetrou();

    public AdapterObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
