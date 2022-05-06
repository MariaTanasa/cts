package clase;

public class NotificatorMetrou extends Notificator{
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()>10){
            System.out.println("Calatorul "+calator.getNume()+" ar trebui sa foloseasca Metroul");
        }else{
            super.getUrmatorulNotificator().notifica(calator);
        }
    }
}
