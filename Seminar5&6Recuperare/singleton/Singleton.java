package singleton;

public class Singleton {

    //eager initialization
//    private static Singleton instanta=new Singleton();
//    public static Singleton returnareInstanta(){
//        return instanta;
//    }
//
//    //constructor privat
//    private Singleton(){}

    //lazy initialization
    private static Singleton instanta=new Singleton();
    public synchronized static Singleton returnareInstanta(){
        if(instanta==null){
            instanta=new Singleton();
        }
        return instanta;
    }

    //constructor privat
    private Singleton(){}




}
