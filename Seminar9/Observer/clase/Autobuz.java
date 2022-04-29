package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subiect{
    List<Observer> observerList;
    String anunt;

    public Autobuz(String anunt) {
        this.observerList=new ArrayList<>();
        this.anunt = anunt;
    }

    @Override
    public void adaugaObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void eliminaObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void anuntaCalator() {
        for(Observer obs:observerList){
            obs.anuntaObserver(anunt);
        }
    }
}
