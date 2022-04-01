package factory_method;

import simple_factory.family.MijlocTransport;

public interface AbstractFactory {
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare);

}
