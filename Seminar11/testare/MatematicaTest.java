import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    @Test
    public void test(){
        Matematica matematica=new Matematica();
        int suma=matematica.suma(3,5);
        assertEquals(8,suma);
    }


}