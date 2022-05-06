package main;

import clase.Autobuz;
import clase.FirmaAutobuze;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Andrei","Model1",24,2015,5);
        FirmaAutobuze firma=new FirmaAutobuze();

        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Mihai");
        firma.adaugaMemento(autobuz.salvareMemento());

        autobuz.setConsumMediu(20);
        firma.adaugaMemento(autobuz.salvareMemento());

        firma.adaugaMemento(autobuz.salvareMemento());
        System.out.println(autobuz.toString());
        autobuz.undoMemento(firma.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
