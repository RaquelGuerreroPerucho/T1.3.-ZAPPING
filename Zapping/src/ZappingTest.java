import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    public void test0(){
        Zapping z1= new Zapping();

        int resultadoReal=z1.cambioCanal(0,0);
        int resultadoEsperado = 0;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test1(){
        Zapping z1= new Zapping();

        int resultadoReal=z1.cambioCanal(1,2);
        int resultadoEsperado = 1;

        assertEquals(resultadoReal,resultadoEsperado);
    }

}