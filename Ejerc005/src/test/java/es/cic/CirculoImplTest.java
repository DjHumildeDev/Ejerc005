package es.cic;

import static org.junit.Assert.assertEquals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoImplTest {

    private Circulo cut;

    @BeforeEach
    void SetUp() throws Exception{
       cut = new Circulo(0, new Posicion(1, 1), 4, "Negro");
    }

    @Test
    void testCambiarTamano(){
        cut.cambiarTamano(4.5);
        
    }
}