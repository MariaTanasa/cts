package clase;

public class NotificatorTramvai extends Notificator{
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()>5&& calator.getDistanta()<=10){
            System.out.println("Calatorul "+calator.getNume()+" ar trebui sa foloseasca Tramvaiul");
        }else{
            super.getUrmatorulNotificator().notifica(calator);
        }
    }
}
