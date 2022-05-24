package testare.teste;

import clase.AgentieTurism;
import clase.IPachet;
import org.junit.Test;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetStub;

import static org.junit.Assert.*;

public class AgentieTurismTest {
    @Test
    public void testeAdaugaPachet(){
        AgentieTurism a=new AgentieTurism();
        IPachet dummy=new PachetDummy();
        a.adaugaPachet(dummy);
        assertEquals(1,a.getNumarPacheteTuristice());
    }

    @Test
    public void testCalculareSumaTotalaPachete(){
        AgentieTurism agentie=new AgentieTurism();
        agentie.adaugaPachet(new PachetStub());
        agentie.adaugaPachet(new PachetStub());
        assertEquals(2000,agentie.calculareSumaTotalaPachete(),0.01);
    }

}