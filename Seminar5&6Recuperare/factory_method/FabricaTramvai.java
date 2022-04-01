package factory_method;

import simple_factory.family.MijlocTransport;
import simple_factory.family.Tramvai;

public class FabricaTramvai implements AbstractFactory {
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
