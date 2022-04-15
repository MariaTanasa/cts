package main;

import proxy.Autobuz;
import proxy.AutobuzNocturn;
import proxy.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        //Ex8
        MijlocTransport autobuz= new Autobuz(5,20);
        autobuz.opresteInStatie();
        MijlocTransport autobuzDeNoapte= new AutobuzNocturn((Autobuz)autobuz);
        autobuzDeNoapte.opresteInStatie();

//        autobuzDeNoapte.setNrPasageri(0);
//        autobuzDeNoapte.opresteInStatie();
//SAU
        autobuz.setNrPasageri(0);
        autobuzDeNoapte.opresteInStatie();

    }
}
