package clase;

import java.util.ArrayList;
import java.util.List;

public class FirmaAutobuze {
    private List<MementoAutobuz> listaAutobuze=new ArrayList<>();
    public FirmaAutobuze() {
        this.listaAutobuze = new ArrayList<>();
    }

    public void adaugaMemento(MementoAutobuz memento){
        listaAutobuze.add(memento);
    }

    public MementoAutobuz getMemento(int index){
        return listaAutobuze.get(index);
    }

}
