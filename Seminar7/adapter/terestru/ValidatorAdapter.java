package adapter.terestru;

import adapter.subteran.ValidatorMetrou;

public class ValidatorAdapter extends ValidatorMetrou implements ValidatorTerestru{

    //Apare o singura metoda pt ca valideazaAbonament e mostenita deja de la parinte
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}
