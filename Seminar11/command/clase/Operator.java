package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda) {
        listaComenzi.add(comanda);
    }

    public void executaComanda() {
        if(!listaComenzi.isEmpty()) {
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        } else {
            System.out.println("Nu mai exista comenzi in asteptare");
        }
    }

}
