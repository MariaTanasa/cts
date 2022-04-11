package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorAbstract;
import decorator.clase.Imprimanta;
import decorator.clase.ImprimantaDeBilete;

public class Main {
    public static void main(String[] args) {
        Imprimanta imprimanta=new ImprimantaDeBilete(5);
        imprimanta.printeazaBilet();

        DecoratorAbstract decorator=new Decorator(imprimanta,"Paste fericit!");
        decorator.printeazaBilet();
        decorator.printeazaVerso();
    }
}
