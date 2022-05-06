package clase;

public class NotificatorAutobuz extends Notificator{
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()>=3&& calator.getDistanta()<=5){
            System.out.println("Calatorul "+calator.getNume()+" ar trebui sa foloseasca Autobuzul");
        }else{
            super.getUrmatorulNotificator().notifica(calator);
        }
    }
}
