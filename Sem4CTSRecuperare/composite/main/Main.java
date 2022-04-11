package composite.main;

import composite.clase.Autobuz;
import composite.clase.Flota;

public class Main {
    public static void main(String[] args) {
        //Ex6
        Autobuz autobuz1=new Autobuz("Audi","A1",15);
        Autobuz autobuz2=new Autobuz("Audi","A1",20);
        Autobuz autobuz3=new Autobuz("Audi","A1",17);
        Autobuz autobuz4=new Autobuz("Audi","A1",40);
        Autobuz autobuz5=new Autobuz("Audi","A1",62);
        Autobuz autobuz6=new Autobuz("Audi","A1",70);

        Flota flota1=new Flota("Flota1");
        Flota flota2=new Flota("Flota2");
        Flota flota3=new Flota("Flota mare");
        Flota flotaMare=new Flota("Flota companie");

        try{
            flota1.adaugaItem(autobuz1);
            flota1.adaugaItem(autobuz2);
            flota1.adaugaItem(autobuz3);

            flota2.adaugaItem(autobuz4);

            flota3.adaugaItem(autobuz5);
            flota3.adaugaItem(autobuz6);

            flotaMare.adaugaItem(flota1);
            flotaMare.adaugaItem(flota2);
            flotaMare.adaugaItem(flota3);

            flota2.stergeItem(autobuz3);
            flotaMare.descriereItem();

            System.out.println("Suma totala garantata=" +
                    flotaMare.calculeazaSumaGarantata(3)+
                    " lei(pretul este de 3 lei per loc)");

            System.out.println("Suma totala garantata flota3=" +
                    flota3.calculeazaSumaGarantata(3)+
                    " lei(pretul este de 3 lei per loc)");
        }catch (Exception e){
            e.printStackTrace();

        }


    }
}
