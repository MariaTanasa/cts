package factory_method;

import simple_factory.family.Autobuz;
import simple_factory.family.MijlocTransport;

public class FabricaAutobuz implements AbstractFactory {
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
