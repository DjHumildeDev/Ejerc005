package es.cic;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class lienzoTest {

    private Lienzo cut;
    private CirculoImpl dependencia;

    @BeforeEach
    void SetUp() throws Exception{
        this.cut = new Lienzo();
        this.dependencia = mock(CirculoImpl.class);
        
    }

    @Test
    void testCrearFigura() {
        CirculoImpl circuloEsperado= new CirculoImpl(5,"rojo",new Posicion(5,4));
        when(dependencia.aniadirFigura(5, "rojo", new Posicion(5,4))).thenReturn(circuloEsperado);
        cut.CrearFigura(new CirculoImpl(5,"rojo",new Posicion(5,4)), FiguraEnum.Circulo);
    
        assertThat("Hay las figuras esperadas en el lienzo",Integer.valueOf(cut.getCirculosLienzo().size()), is(1));
        //verify(dependencia,times(1)).aniadirFigura(5, "rojo", new Posicion(5,4));
    
    }

    @Test
    void testEliminarFigura() {
        cut.CrearFigura(new CirculoImpl(5,"rojo",new Posicion(5,4)), FiguraEnum.Circulo);
        cut.eliminarFigura(0);
        assertThat("Se ha eliminado correctamente la figuta", Integer.valueOf(cut.getCirculosLienzo().size()),is(0));
    }

    @Test
    void testEstaDentro() {
        
        assertTrue("Esta dentro", cut.estaDentro(new Posicion(8, 10000)));
    }


    @Test
    void testModificarPosFigura() {
        dependencia.setColor("rojo");
        dependencia.setRadio(0);
        dependencia.setPos(new Posicion(5,4));
        CirculoImpl circuloEsperado= new CirculoImpl(500,"rojo",new Posicion(5,4));
        when(dependencia.modificarFigura(500)).thenReturn(circuloEsperado);
    }

    @Test
    void testModificarTamanoFigura() {
        
    }
}
