package adapter.main;

import adapter.subteran.ValidatorMetrou;
import adapter.terestru.AdapterObiecte;
import adapter.terestru.ValidatorAdapter;
import adapter.terestru.ValidatorAutobuz;
import adapter.terestru.ValidatorTerestru;

public class Main {
    static void valideazaBiletCalatorie(ValidatorTerestru validatorTerestru){
    validatorTerestru.valideazaBilet();
    }
    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz=new ValidatorAutobuz();
        valideazaBiletCalatorie(validatorAutobuz);

        //NU merge sa facem in felul urmator
        ValidatorMetrou validatorMetrou=new ValidatorMetrou();
//        valideazaBiletCalatorie(validatorMetrou);

        AdapterObiecte adapterObiecte=new AdapterObiecte(validatorMetrou);
        valideazaBiletCalatorie(adapterObiecte);

        ValidatorAdapter validatorAdapter=new ValidatorAdapter();
        valideazaBiletCalatorie(validatorAdapter);
    }
}
