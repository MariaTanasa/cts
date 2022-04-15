package main;

import flyweight.Autobuz;
import flyweight.LinieFactory;

public class Main {
    public static void main(String[] args) {
        //Ex9
        Autobuz a1=new Autobuz("model1",2000,40);
        Autobuz a2=new Autobuz("model2",2000,16);
        Autobuz a3=new Autobuz("model3",2010,42);
        Autobuz a4=new Autobuz("model4",2015,25);

        LinieFactory factory=new LinieFactory();
        factory.getLinie(137).afiseazaDescriere(a1);
        factory.getLinie(137).afiseazaDescriere(a2);
        factory.getLinie(160).afiseazaDescriere(a3);
        factory.getLinie(160).afiseazaDescriere(a4);


    }
}
