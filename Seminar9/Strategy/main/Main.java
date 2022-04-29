package main;

import clase.CardBancar;
import clase.Sms;
import clase.ValidatorCalatorie;

public class Main{
    public static void main(String[] args) {
        //Ex10
//        10. Un calator are posibilitatea sa plateasca cu cardul de calatorii, cardul bancar sau prin SMS. Trebuie implementat modulul dintr-un validator calatorie
//        care sa permita plata calatoriei printr-una din cele trei metode. Calatorul va decide modul de plata atunci cand se urca in mijlocul de transport.
        ValidatorCalatorie validatorCalatorie=new ValidatorCalatorie(3);
        validatorCalatorie.platesteCalatorie();

        validatorCalatorie.setModPlata(new CardBancar());
        validatorCalatorie.platesteCalatorie();
        validatorCalatorie.setModPlata(new Sms());
        validatorCalatorie.platesteCalatorie();
    }
}
