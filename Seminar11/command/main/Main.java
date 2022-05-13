package main;

import clase.Autobuz;
import clase.ComandaPlecareInCursa;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("B67RHY");
        Autobuz autobuz2 = new Autobuz("B56HJU");

        Operator operator = new Operator();
        operator.adaugaComanda(new ComandaPlecareInCursa(103, autobuz2));
        operator.adaugaComanda(new ComandaPlecareInCursa(104, autobuz1));
        operator.adaugaComanda(new ComandaPlecareInCursa(105, autobuz2));
        operator.adaugaComanda(new ComandaPlecareInCursa(103, autobuz1));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
