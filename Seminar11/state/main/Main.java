package main;

import clase.Autobuz;
import clase.InCursa;
import clase.LaCapatDeLinie;

public class Main {
    public static void main(String[] args) {
//        15. Se doreste implementarea unui modul care sa gestioneze autobuzele din cadrul flotei in functie de starea in care se afla fiecare autobuz.
//        Starile posibile sunt: InCursa, LaCapatDeLinie, LaReparat.

//        Un autobuz care se afla la capat de linie poate sa plece in cursa, insa un autobuz care este in cursa nu poate sa plece in cursa.
//        Va putea pleca in cursa doar dupa ce ajunge la capat de linie. De asemneea un autobuz care este la reparat va putea s aplece in cursa
//        doar dupa ce este reparat. Un autobuz care nu este in cursa nu are cum sa ajunga la capat de linie.
        Autobuz autobuz=new Autobuz(313);
        autobuz.ajungeLaCapatLinie();
        autobuz.pleacaInCursa();
        autobuz.trimiteInService();
        autobuz.ajungeLaCapatLinie();
    }
}
