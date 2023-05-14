import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    Zapping z1= new Zapping();

    @Test
    public void test0(){

        int resultadoReal=z1.cambioCanal(0,0);
        int resultadoEsperado = 0;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test1(){

        int resultadoReal=z1.cambioCanal(1,2);
        int resultadoEsperado = 1;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test3(){

        int resultadoReal=z1.cambioCanal(10,30);
        int resultadoEsperado = 20;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test4(){

        int resultadoReal=z1.cambioCanal(2,99);
        int resultadoEsperado = 2;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test5(){

        int resultadoReal=z1.cambioCanal(5,63);
        int resultadoEsperado = 41;

        assertEquals(resultadoReal,resultadoEsperado);
    }

}