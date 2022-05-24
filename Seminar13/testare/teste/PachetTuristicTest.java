package testare.teste;

import clase.PachetTuristic;
import org.junit.Test;
import testare.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    public void testPoateRezerva(){
        PersoanaFake persoana=new PersoanaFake();
        persoana.setValoareVarsta(20);

        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Roma",3000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testBoundary(){
        PersoanaFake persoana=new PersoanaFake();
        persoana.setValoareVarsta(18);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Roma",3000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testDiscount(){
        PersoanaFake persoana=new PersoanaFake();
        persoana.setValoareVarsta(70);
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Roma",200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0,pachetTuristic.getPret(),0.01);
    }


}