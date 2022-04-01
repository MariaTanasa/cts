package factory_method;

import simple_factory.family.MijlocTransport;
import simple_factory.family.Troleibuz;

public class FabricaTroleibuz implements AbstractFactory {
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
