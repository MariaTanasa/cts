package main;

import sem1.Girafa;
import sem1.Ingrijitor;
import sem1.Zebra;
import sem1.Zoo;

public class Main {
    public static void main(String[] args) {
        Ingrijitor i=new Ingrijitor("Alexandru Vasile");
        Zoo zoo=new Zoo("Gradina zoologica Bucuresti",i);
        zoo.addAnimal(new Girafa("g1"));
        zoo.addAnimal(new Girafa("g2"));
        zoo.addAnimal(new Zebra("z1"));
        zoo.hranesteAnimale();

    }
}
