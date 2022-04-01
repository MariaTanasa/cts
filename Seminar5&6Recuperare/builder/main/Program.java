package builder.main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1=new AutobuzBuilder().setModel("Ford").setNumeSofer("Vasile").build();
        System.out.println(autobuz1.toString());
        Autobuz autobuz2=new AutobuzBuilder().setNrInmatriculare("B67GTH").build();
        System.out.println(autobuz2.toString());

    }
}
