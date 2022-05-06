package clase;

public class NotificatorTroleibuz extends Notificator{
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()<3){
            System.out.println("Calatorul "+calator.getNume()+" ar trebui sa foloseasca Troleibuzul");
        }else{
            super.getUrmatorulNotificator().notifica(calator);
        }
    }
}
