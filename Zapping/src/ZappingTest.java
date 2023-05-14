import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    public void test0(){

        int resultadoReal= Zapping.cambioCanal(0,0);
        int resultadoEsperado = 0;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test1(){

        int resultadoReal= Zapping.cambioCanal(1,2);
        int resultadoEsperado = 1;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test3(){

        int resultadoReal= Zapping.cambioCanal(10,30);
        int resultadoEsperado = 20;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test4(){

        int resultadoReal= Zapping.cambioCanal(2,99);
        int resultadoEsperado = 2;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test5(){

        int resultadoReal= Zapping.cambioCanal(5,63);
        int resultadoEsperado = 41;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test6(){

        int resultadoReal= Zapping.cambioCanal(63,5);
        int resultadoEsperado = 41;

        assertEquals(resultadoReal,resultadoEsperado);
    }

    @Test
    public void test7(){

        int resultadoReal= Zapping.cambioCanal(1,51);
        int resultadoEsperado = 49;

        assertEquals(resultadoReal,resultadoEsperado);
    }

}