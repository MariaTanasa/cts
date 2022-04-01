package simple_factory.fabrica;

import simple_factory.family.*;

public class Fabrica {
    public MijlocTransport returneazaMijlocTransport(TipTransport tip,String nrInmatriculare){
        switch (tip){
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }

    }
}
