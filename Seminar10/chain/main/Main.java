package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
//        12. Trebuie implementat un modul care sa ii spuna calatorului ce mijloc de transport trebuie sa foloseasca in functie de distanta pe care o are de parcurs.
//        Astfel, daca un calator are de parcurs o distanta mai mica de 3 km, este recomandat sa mearga cu Troleibuzul.
//        Daca are o distanta cuprinsa intre 3 si 5 km i se recomanda sa foloseasca autobuzul,
//        iar daca are o distanta cuprinsa intre 5 km si 10 km,  i se recomanda sa foloseasca Tramvaiul.
//        In cazul in care distanta este mai mare decat 10 km i se recomanda sa foloseasca Metroul.

        NotificatorMetrou notificatorMetrou=new NotificatorMetrou();
        NotificatorAutobuz notificatorAutobuz=new NotificatorAutobuz();
        NotificatorTramvai notificatorTramvai=new NotificatorTramvai();
        NotificatorTroleibuz notificatorTroleibuz=new NotificatorTroleibuz();
        notificatorMetrou.setUrmatorulNotificator(notificatorAutobuz);
        notificatorAutobuz.setUrmatorulNotificator(notificatorTramvai);
        notificatorTramvai.setUrmatorulNotificator(notificatorTroleibuz);

        Calator calator=new Calator("Popescu",4);
        notificatorMetrou.notifica(calator);


    }
}
