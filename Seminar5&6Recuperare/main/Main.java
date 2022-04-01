package main;

import factory_method.FabricaAutobuz;
import factory_method.FabricaTramvai;
import factory_method.FabricaTroleibuz;
import protoype.Autobuz;
import protoype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
//        Singleton
//        Singleton s1;
//        s1=Singleton.returnareInstanta();
//        System.out.println(s1);
//        Singleton s2;
//        s2=Singleton.returnareInstanta();
//        System.out.println(s2);

//        Simple Factory
//        Fabrica f1=new Fabrica();
//        MijlocTransport m1=f1.returneazaMijlocTransport(TipTransport.Tramvai, "B34GTT");
//        MijlocTransport m2=f1.returneazaMijlocTransport(TipTransport.Autobuz, "B67GTH");
//        MijlocTransport m3=f1.returneazaMijlocTransport(TipTransport.Troleibuz, "B78FRG");
//        m1.afisareNrInmatriculare();
//        m2.afisareNrInmatriculare();
//        m3.afisareNrInmatriculare();

//        FactoryMethod
//        MijlocTransport autobuz=new FabricaAutobuz().returneazaMijlocTransport("B67GTH");
//        MijlocTransport tramvai=new FabricaTramvai().returneazaMijlocTransport("B56GFR");
//        MijlocTransport troleibuz=new FabricaTroleibuz().returneazaMijlocTransport("B45GDF");
//        autobuz.afisareNrInmatriculare();
//        tramvai.afisareNrInmatriculare();
//        troleibuz.afisareNrInmatriculare();

//        Protoype
        Autobuz autobuz=new Autobuz("Andrei");
        Autobuz autobuz2;
        try{
            autobuz2= (Autobuz) autobuz.copiaza();
            autobuz2.setSoferAutobuz("Matei");
            System.out.println(autobuz.getSoferAutobuz());
            System.out.println(autobuz2.getSoferAutobuz());
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
