package clase;

public abstract class MijlocTransportSine {
    //obligatoriu protected/default/private ca sa nu se poata accesa
    abstract void opresteStatie1();
    abstract void opresteStatie2();
    abstract void opresteStatie3();

    //obligatoriu metode finale
    public final void parcurgeSensNormal(){
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
    }

    public final void parcurgeSensInvers(){
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    }


}
