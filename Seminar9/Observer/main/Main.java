package main;

import clase.Autobuz;
import clase.Calator;

public class Main {
    public static void main(String[] args) {
        //Ex11
//        11. Se doreste implementarea unei aplicatii prin care utilizatorii se pot inregistra intr-o lista de calatori
//        care sa fie anuntati atunci cand autobuzul pleaca de la capat de linie. Autobuzul cand pleaca in cursa de la capatul de linie
//        trebuie sa anunte toti acesti calatori că s-a pus in miscare. Calatorii vor putea in acest mod sa stie cand trebuie sa astepte autobuzul in statie.

        Autobuz autobuz=new Autobuz("Autobuzul pleaca din statie");
        Calator c1=new Calator("Marian");
        Calator c2=new Calator("Ion");
        Calator c3=new Calator("Vasile");
        Calator c4=new Calator("Marius");
        Calator c5=new Calator("Alex");

        autobuz.adaugaObserver(c1);
        autobuz.adaugaObserver(c2);
        autobuz.adaugaObserver(c3);
        autobuz.anuntaCalator();

        autobuz.eliminaObserver(c2);
        System.out.println("\n");
        autobuz.anuntaCalator();



    }
}
